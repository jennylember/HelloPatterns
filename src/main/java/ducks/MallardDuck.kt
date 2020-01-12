package ducks

class MallardDuck: Duck(quackBehavior = Quack(), flyBehavior = FlyWithWings()) {

    fun display() {
        println("I'm a real Mallard duck!")
    }

}