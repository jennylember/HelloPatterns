package weatherStation

class CurrentConditionsDisplay(private val weatherData: Subject) : Observer,
    DisplayElement {
    private var temperature = 0f
    private var humidity = 0f
    override fun update(temp: Float, hum: Float, pres: Float) {
        temperature = temp
        humidity = hum
        display()
    }

    override fun display() {
        println("Current conditions: $temperature F degrees and $humidity % humidity")
    }

    init {
        weatherData.registerObserver(this)
    }

}

