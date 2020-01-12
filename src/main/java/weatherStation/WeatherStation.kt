package weatherStation

fun main() {
    val weatherData = WeatherData()
    var currentConditionsDisplay = CurrentConditionsDisplay(weatherData)
    var statisticsDisplay = StatisticsDisplay(weatherData)
    var forecastDisplay = ForecastDisplay(weatherData)
    var heatIndexDisplay = HeatIndexDisplay(weatherData)
    weatherData.setMeasurements(81f, 66f, 31.4f)
    weatherData.setMeasurements(82f, 70f, 29.2f)
    weatherData.setMeasurements(78f, 90f, 29.4f)
}

