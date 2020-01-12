package sturbuzz

abstract class CondimentDecorator : Beverage() {
    //abstract var beverage: Beverage
    abstract override var description: String
//
//    override fun cost(): Double {
//        return beverage.size.price
//    }
}
