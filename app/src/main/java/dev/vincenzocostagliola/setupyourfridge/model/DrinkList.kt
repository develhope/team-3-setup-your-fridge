package dev.vincenzocostagliola.setupyourfridge.model

object DrinkList {

    private val beerOne = Beer("Heineken", "Lager", "5", "blond")
    private val beerTwo = Beer("Messina", "Lager", "5", "blond")
    private val beerThree = Beer("Becks", "Lager", "5", "blond")
    private val beerFour = Beer("Spaceman", "ipa", "6", "blond")

    private val beerList: List<Beer> = listOf(beerOne, beerTwo, beerThree, beerFour)

    fun getBeerList(): List<Beer> {

        return beerList
    }


}