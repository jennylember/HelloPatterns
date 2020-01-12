package observer

import reactor.core.publisher.ReplayProcessor
import java.util.*
import java.util.concurrent.Executors

class Subject(private val processor: ReplayProcessor<Event>) {
    private val executor = Executors.newSingleThreadExecutor()

    init {
        executor.submit {
            while (true) {
                val number = getRandomNumberInRange(0, 10)
                println("Next number: $number")
                processor.onNext(Event(number))
                Thread.sleep(1000)
            }
        }
    }

    private fun getRandomNumberInRange(min: Int, max: Int): Int {
        require(min < max) { "max must be greater than min" }
        val r = Random()
        return r.nextInt(max - min + 1) + min
    }
}