package dev.vincenzocostagliola.setupyourfridge.model

object DrinkList {

    private val beerOne = Beer(
        name = "Ichnusa non filtrata",
        shortDescription = "Ichnusa non filtrata",
        longDescription = "Colore giallo dorato luminoso con schiuma fine e persistente. Al naso sprigiona aromi di fiori d'arancio, caramello e luppolo, accompagnati da un delicato sentore di miele in un complesso di eleganza e piacevolezza che si conferma anche all'assaggio, dove freschezza e rotondità avvolgono una persistenza moderatamente amarognola di grande equilibrio.\n" +
                "\n" +
                "Ideale per un aperitivo di formaggi e salumi, si accompagna bene anche a pesci al forno saporiti. ",
        format = "33 cl",
        imageUrl = "url.com/link"
    )

    private val beerTwo = Beer(
        name = "Birra Messina Cristalli Di Sale",
        shortDescription = "Birra Messina Cristalli Di Sale",
        longDescription = "Colore giallo dorato luminoso con una naturale opalescenza, ha schiuma compatta e persistente.",
        format = "33 cl",
        imageUrl = "url.com/link"
    )

    private val beerThree = Beer(
        name = "Tennent's Super",
        shortDescription = "Tennent's Super",
        longDescription = "Bel colore giallo dorato luminoso con schiuma bianca di poca persistenza.",
        format = "33 cl",
        imageUrl = "url.com/link"
    )

    private val beerList: MutableList<Beer> = mutableListOf(beerOne, beerTwo, beerThree)

    fun getBeerList(): List<Beer> {

        return beerList
    }

    fun setPreferredBeer(beer: Beer, isPreferred: Boolean): Beer {
        val preferredBeer = beer.copy(preferred = isPreferred)
        val index = beerList.indexOf(beer)
        beerList[index] = preferredBeer
        return preferredBeer
    }
}