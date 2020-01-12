package weatherStation

interface Observer {
    fun update(temp: Float, hum: Float, pres: Float)
}