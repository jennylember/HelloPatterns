package sturbuzz

class Whip(var beverage: Beverage) : CondimentDecorator() {

    override var description: String = "${beverage.description}, Whip"

    override fun cost(): Double {
        return .10 + beverage.cost() + beverage.size.price
    }

}
