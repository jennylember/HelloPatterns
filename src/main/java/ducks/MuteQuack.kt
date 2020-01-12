package ducks

class MuteQuack: QuackBehavior {
    override fun quack() {
        println("<< Silence >>")
    }
}