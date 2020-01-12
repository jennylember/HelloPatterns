package sturbuzz

class Decaf : Beverage() {
    override var description = "Decaf Coffee"

    override fun cost(): Double {
        return 1.05
    }
}