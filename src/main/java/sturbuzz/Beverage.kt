package sturbuzz

abstract class Beverage {
    open var description = "Unknown Beverage"
    open var size: Size = Size.TALL

    abstract fun cost(): Double
}