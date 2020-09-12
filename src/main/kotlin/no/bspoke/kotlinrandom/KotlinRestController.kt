package no.bspoke.kotlinrandom

import org.springframework.web.bind.annotation.*
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api")
class KotlinRestController {
    @GetMapping("/random-number")
    fun getRandomNumber(@RequestParam(defaultValue = "6") max: Int): RandomNumberContainer {
        val randomNumber = generateRandomNumber(max)
        return RandomNumberContainer(randomNumber)
    }

    @PostMapping("/random-number")
    fun getRandomNumberByPost(@RequestBody maxNumberContainer: MaxNumberContainer): RandomNumberContainer {
        val max = maxNumberContainer.max
        val randomNumber = generateRandomNumber(max)
        return RandomNumberContainer(randomNumber)
    }

    fun generateRandomNumber(max: Int): Int {
        return (1..max).random()
    }
}
