package kg.kuraido.acceptorinfinity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("activePage", "home");
        return "home";
    }

//    @GetMapping("/show")
//    public String getAbout(Model model) {
//        model.addAttribute("activePage", "home");
//    return "show";
//    }

    }
