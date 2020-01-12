package observer

import reactor.core.publisher.ReplayProcessor
import java.time.Duration

class EvenObserver(private val processor: ReplayProcessor<Event>) {
    init {
        processor
            .filter { (it.number % 2 == 0) }
           // .timeout(Duration.ofSeconds(1))
            .subscribe(
            {
                println("Found even number: $it")
            },
            { err -> println("Error value: $err") }
        )
    }
}