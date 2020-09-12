package no.bspoke.kotlinrandom

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HtmlController {

    @GetMapping("/")
    fun homepage(model: Model): String {
        model["title"] = "Generate Random Numbers by Kotlin API"
        return "homepage"
    }
}
