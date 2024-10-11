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
            q: $regex<*(хорош|норм|отли|харош).*\b>
            a: Это отлично! Как я могу помочь?

            
        state: Bad
            q: $regex<*(плох|не оч|неоч|хрен).*\b>
            a: Ужас! Могу ли я чем-то помочь?
            
    state: Bye
        intent!: /пока
        a: Пока пока

    state: NoMatch
        event!: noMatch
        a: Я не понял. Вы сказали: {{$request.query}}

    state: Match
        event!: match
        a: {{$context.intent.answer}}