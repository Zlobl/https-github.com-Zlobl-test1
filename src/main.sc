require: slotfilling/slotFilling.sc
  module = sys.zb-common
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
        a: Стоимость обслуживания можно рассчитать (тут)[http://someautodealer/techservice#calculate]

        
        
        
    state: Match
        event!: match
        a: {{$context.intent.answer}}