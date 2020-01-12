package weatherStation

import java.util.ArrayList
import java.util.Observable

class WeatherData2 : Subject {
    private val observers: ArrayList<Observer?> = ArrayList()
    var temperature = 0f
        private set
    var humidity = 0f
        private set
    var pressure = 0f
        private set

    override fun registerObserver(o: Observer?) {
        observers.add(o);
    }

    override fun removeObserver(o: Observer?) {
        val index = observers.indexOf(o)
        if (index >= 0) {
            observers.removeAt(index)
        }
    }

    override fun notifyObservers() {
        for (observer in observers) {
            observer!!.update(temperature, humidity, pressure)
        }
    }

    private fun measurementsChanged() {
        notifyObservers()
    }

    fun setMeasurements(temperatureNew: Float, humidityNew: Float, pressureNew: Float) {
        temperature = temperatureNew
        humidity = humidityNew
        pressure = pressureNew
        measurementsChanged()
    }



}


