package weatherStation

interface Subject {
    fun registerObserver(o: Observer?)
    fun removeObserver(o: Observer?)
    fun notifyObservers()
}