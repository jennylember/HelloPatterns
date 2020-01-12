package observer

import reactor.core.publisher.ReplayProcessor

fun main() {
    val processor = ReplayProcessor.create<Event>()

    val subject = Subject(processor)
    val observer = EvenObserver(processor)
}