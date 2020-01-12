package sturbuzz

class DarkRoast : Beverage() {
    override var description = "Dark Roast Coffee"

    override fun cost(): Double {
        return 0.99
    }
}