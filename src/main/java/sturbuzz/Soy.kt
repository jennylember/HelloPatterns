package sturbuzz


class Soy(var beverage: Beverage) : CondimentDecorator() {

    override var description: String = "${beverage.description}, Soy"

    override fun cost(): Double {
        return .15 + beverage.cost() + beverage.size.price
    }

}
