package no.bspoke.kotlinrandom

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class RestController {
    @GetMapping("/random-number")
    fun getRandomNumber(@RequestParam(defaultValue = "6") max: Int): RandomNumber {
        val randomNumber = (1..max).random()
        return RandomNumber(randomNumber)
    }
}
