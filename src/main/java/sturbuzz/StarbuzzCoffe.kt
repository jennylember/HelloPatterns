package sturbuzz

fun main() {

    val beverage = Espresso()
    println("${beverage.description} - $${beverage.cost()}")

    //var bev = Whip(Mocha(Mocha(DarkRoast())))
    var beverage2: Beverage = DarkRoast()
    beverage2 = Mocha(beverage2)
    beverage2 = Mocha(beverage2)
    beverage2 = Whip(beverage2)

    println("${beverage2.description} - $${beverage2.cost()}")

    val beverage6 = HouseBlend()
    val beverage7 = Soy(beverage6)
    val beverage8 = Mocha(beverage7)
    val beverage9 = Whip(beverage8)

    println("${beverage9.description} - $${beverage9.cost()}")

}