package info.developia.demogroovyreact.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HomeController {

    @GetMapping("/")
    def String home(Model model){

        model.addAttribute("name", "This is Manu talking")
        model.addAttribute("surname", "Garcia Rodriguez")

        "home"
    }
}
