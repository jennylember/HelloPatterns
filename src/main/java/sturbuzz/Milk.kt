package sturbuzz

class Milk(var beverage: Beverage) : CondimentDecorator() {

    override var description: String = "${beverage.description}, Milk"

    override fun cost(): Double {
        return .10 + beverage.cost() + beverage.size.price
    }

}