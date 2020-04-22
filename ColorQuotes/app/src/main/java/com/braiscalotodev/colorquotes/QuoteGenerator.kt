package com.braiscalotodev.colorquotes

object QuoteGenerator {

    private val quoteList = listOf(

        Quote("“Cuando salgas de la tormenta, ya no serás la misma persona que " +
                "había entrado en ella. En eso consiste la tormenta”",
            "Haruki Murakami"),
        Quote("“Amo las limitaciones, porque son la causa de la inspiración”",
            "Susan Sontag"),
        Quote("“Si quieres el arcoíris, tienes que soportar la lluvia”",
            "Dolly Parton"),
        Quote("“La cometa se eleva más alto en contra del viento, no a su favor”",
            "Winston Churchill"),
        Quote("“En medio de la dificultad, se esconde la oportunidad”","A. Einstein"),
        Quote("“No hay caminos para la paz; la paz es el camino”", "Mahatma Ghandi"),
        Quote("“Aprende a vivir y sabrás morir bien”","Confucio"),
        Quote("“El sabio no dice nunca todo lo que piensa, pero siempre piensa todo lo que dice”",
            "Aristóteles"),
        Quote("“Hay dos cosas que son infinitas: el universo y la " +
                "estupidez humana; de la primera no estoy muy seguro”","Albert Einstein"),
        Quote("“No es fácil estar borracho todo el tiempo. Si fuera fácil, todos lo harían.”" ,
            "Tyrion Lannister"),
        Quote("“Quien no condena el mal, ordena que se haga”", "Leonardo Da Vinci"),
        Quote("“Hay personas que no saben perder su tiempo completamente solas. " +
                "Son el azote de las personas ocupadas.”", "Louis de Bonald"),
        Quote("“Cuando te das cuenta de que deseas pasar el resto de tu vida con una persona, " +
                "quieres que el resto de tu vida empiece lo antes posible”", "Billy Cristal"),
        Quote("“Un vaso medio vacío de vino es también uno medio lleno, pero una mentira " +
                "a medias, de ningún modo es una media verdad.”", "Jean Cocteau"),
        Quote("“La vida es una película que vuelve a empezar cada mañana al despertarnos. " +
                "Olvídate de tus errores, cada día tienes una nueva oportunidad para triunfar y " +
                "alcanzar la felicidad”", "Norkin Gilbert"),
        Quote("“No se puede poseer mayor gobierno, ni menor, que el de uno mismo. ”",
            "Leonardo Da Vinci"),
        Quote("“Decir lo que sentimos, sentir lo que decimos, concordar las palabras " +
                "con la mente.”", "Séneca")

    )
    fun getQuote() : Quote = quoteList.random()
}