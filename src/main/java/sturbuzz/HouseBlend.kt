package sturbuzz

class HouseBlend : Beverage() {

    override var description = "House Blend Coffee"

    override fun cost(): Double {
        return 0.89
    }
}