package no.bspoke.kotlinrandom

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinRandomApplication

fun main(args: Array<String>) {
	runApplication<KotlinRandomApplication>(*args)
}
