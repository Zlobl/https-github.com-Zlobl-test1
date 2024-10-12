require: slotfilling/slotFilling.sc
  module = sys.zb-common

require: patterns.sc
  module = sys.zb-common  

require:  function.js

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
        
    state: СlaimTO
        intent!: /claimTo
        a: [Позвоните моим коллегам](http://someautodealer/contacts), чтобы разобраться в ситуации.
 
    state: WhatTO
        intent!: /whatTo
        a: Техническое обслуживание нужно, чтобы предотвратить вероятность случайных поломок, а также произвести регулировку всех основных узлов и агрегатов, чтобы максимально снизить расход топлива и смазочных материалов.
        go!: /SignUpTo

    
    state: SignUpTo
        intent!: /signUpTo
        if: ($session.phone && $session.name) || ($session.phone && $session.car)
            a: Оформляю заявку на техобслуживание на следующие данные:
            a: {{$session.name}}\n{{$session.phone}}\n{{$session.car}}
            a: Наш сотрудник свяжется с вами и уточнит время.
        else: 
            a: Для записи на ТО уточните, пожалуйста, номер телефона.
                
        state: SignToСlarification
            q: *$regexp<(8|\+?7)-?\(?9\d{2}\)?-?\d{3}-?\d{2}-?\d{2}>*
            script: 
                # if ($parseTree._duckling.phone-number)
                var $ = $jsapi.context();
                $.session.phone = $request
                $reactions.answer(JSON.stringify($session))
            a: Номер {{$session}}
            
        



        
    state: Match
        event!: match
        a: {{$context.intent.answer}}