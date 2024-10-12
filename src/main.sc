require: slotfilling/slotFilling.sc
  module = sys.zb-common

require: patterns.sc
  module = sys.zb-common  

require:  function.js

require: pattern.sc

require: config.yaml
    var = cars
    
init:
    
  $global.$ = {
        __noSuchProperty__: function(property) {
            return $jsapi.context()[property];
        }
    };
  
theme: /

    state: Start
        q!: $regex</start>
        a: Начнём.

    state: Hello
        intent!: /привет
        a: Привет! Как дела?
    
        state: Good
            q: $regexp_i<.*(хорош|норм|отли|харош).*>
            a: Это отлично! Как я могу помочь?

            
        state: Bad
            q: $regexp_i<.*(плох|не оч|неоч|хрен).*>
            a: Ужас! Могу ли я чем-то помочь?
            
    state: Bye
        intent!: /пока
        a: Пока пока

    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

    state: PriceTO
        intent!: /priceTo
        a: Стоимость обслуживания можно рассчитать [тут](http://someautodealer/techservice#calculate)

    state: ScheduleTO
        intent!: /scheduleTo
        a: График технического обслуживания можно узнать [тут](http://someautodealer/techservice).    
        
    state: ClaimTO
        intent!: /claimTo
        a: [Позвоните моим коллегам](http://someautodealer/contacts), чтобы разобраться в ситуации.
 
    state: WhatTO
        intent!: /whatTo
        a: Техническое обслуживание нужно, чтобы предотвратить вероятность случайных поломок, а также произвести регулировку всех основных узлов и агрегатов, чтобы максимально снизить расход топлива и смазочных материалов.
        go!: /SignUpTo

    
    state: SignUpTo
        intent!: /signUpTo
        if: ($session.phone && $session.name) || ($session.phone && $session.car)
            a: Оформляю заявку на техобслуживание.
            a: Наш сотрудник свяжется с вами по номеру "{{$session.phone}}" и уточнит время.
            a: {{$session.car}} {{$session.name}}
            script:
                $integration.googleSheets.writeDataToLine(
                    "db246158-4219-403f-8752-a15592516a64",
                    "1qs5B8sxUDJNHQ3-0erjEz55O01UaBQs60obouIQB3Us",
                    "clients",
                    [$session.name, $session.car, $session.phone]
                );
        else: 
            a: Для записи на ТО уточните, пожалуйста, ваше имя, номер телефона и марку автомобиля.
                
        state: SignToClarification
            q: $carEan
            q: $carRus
            q: *
            script: 
                var entities = $jsapi.context().entities
                if (!$session.name){
                    $.session.name = _.filter(entities, function(en) {
                    return en.pattern == "pymorphy.name";
                    }).map(function(en) {
                    return en.value;
                    });
                    if (_.isEmpty($.session.name)) delete  $.session.name;
                }
                if (!$session.phone){
                    $.session.phone = _.filter(entities, function(en) {
                    return en.pattern == "duckling.phone-number";
                    }).map(function(en) {
                    return en.value;
                    });
                    if (_.isEmpty($.session.phone)) delete  $.session.phone;
                }
                if (!$session.car){
                    var puttetn = $jsapi.context().nluResults.selected.debugInfo
                    if (puttetn && puttetn.pattern && puttetn.effectivePattern && (puttetn.pattern == "$carEan" || puttetn.pattern == "$carRus")){
                        $.session.car = puttetn.effectivePattern
                        $reactions.answer(JSON.stringify($session.car))
                    }
                }
            if: ($session.phone && $session.name) || ($session.phone && $session.car)
                go!: /SignUpTo
            else:
                go!: /SignToClarification2
        
        
    state: SignToClarification2
        script:
            if ($.session.name && !$.session.phone && !$session.car){
                $reactions.answer($.session.name + ", уточните номер телефона и марку автомобиля.");
            }else if(!$.session.name && $.session.phone && !$session.car){
                $reactions.answer("Уточните ваше имя и марку автомобиля.");
            }else if(!$.session.name && !$.session.phone && $session.car){
                $reactions.answer("Уточните ваше имя и номер телефона.");
            }else if($.session.name && !$.session.phone && $session.car){
                $reactions.answer("Для записи уточните ваш номер телефона.");
            }else { $reactions.answer("Для записи на ТО уточните ваше имя, номер телефона и марку автомобиля."); }
            $reactions.transition( {value: "/SignUpTo/SignToClarification", deferred: true} );
            
        # state: GoSignToClarification
        #     q: *
        #     go!: /SignUpTo/SignToClarification
            
            
    state: DeleteSession
        q!: deletesession
        script:
            $jsapi.stopSession();

        
    state: Match
        event!: match
        a: {{$context.intent.answer}}



    # state:
    #     q!: $test
    #     q!: *
        
    #     script:
    #         var text = "Денис, номер телефона 89965008843, машина Ксиоми"
    #         $reactions.answer(JSON.stringify($jsapi.context().nluResults.selected.debugInfo))
            