package no.bspoke.kotlinrandom

import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api")
class RestController {
    @GetMapping("/random-number")
    fun getRandomNumber(@RequestParam(defaultValue = "6") max: Int): RandomNumber {
        val randomNumber = (1..max).random()
        return RandomNumber(randomNumber)
    }

    @PostMapping(path = ["/random-number-by-post"], consumes = ["application/json"], produces = ["application/json"])
    fun getRandomNumberByPost(@RequestBody maxNumberContainer: MaxNumberContainer): RandomNumber {
        val max = maxNumberContainer.max
        val randomNumber = (1..max).random()
        return RandomNumber(randomNumber)
    }
}
