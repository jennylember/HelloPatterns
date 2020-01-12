package ducks

fun main() {
    val mallard: Duck = MallardDuck()
    mallard.performQuack()
    mallard.performFly()
    val modelDuck: Duck = ModelDuck()
    modelDuck.performFly()
    val flyRocketPowered = FlyRocketPowered()
    modelDuck.setFlyBehavior(flyRocketPowered)
    modelDuck.performFly()
}