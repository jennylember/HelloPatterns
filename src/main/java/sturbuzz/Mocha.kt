package sturbuzz

class Mocha(var beverage: Beverage) : CondimentDecorator() {

    override var description: String = "${beverage.description}, Mocha"

    override fun cost(): Double {
        return .20 + beverage.cost() + beverage.size.price
    }

}
