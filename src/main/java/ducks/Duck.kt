package ducks

abstract class Duck(private var flyBehavior: FlyBehavior, private var quackBehavior: QuackBehavior) {

    fun performFly() {
        flyBehavior.fly()
    }

    fun performQuack() {
        quackBehavior.quack()
    }

    fun setFlyBehavior(fb: FlyBehavior) {
        flyBehavior = fb
    }

    fun setQuackBehavior(qb: QuackBehavior) {
        quackBehavior = qb
    }

    fun swim() {
        println("All ducks float, even decoys!")
    }

}