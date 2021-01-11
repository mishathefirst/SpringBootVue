package infsystem.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        // this attribute will be available in the view index.html as a thymeleaf variable
        model.addAttribute("eventName", "FIFA 2018");
        // this just means render index.html from static/ area
        return "index";
    }



    @RequestMapping(value = "/abstrcars", method = RequestMethod.GET)
    public String abstrcars(Model model) {
        // this attribute will be available in the view index.html as a thymeleaf variable
        model.addAttribute("firstcar", "ZIL-41041");
        // this just means render index.html from static/ area
        return "abstrcars";
    }



    @RequestMapping(value = "/forsalecars", method = RequestMethod.GET)
    public String forsalecars(Model model) {
        // this attribute will be available in the view index.html as a thymeleaf variable
        //model.addAttribute("firstcar", "ZIL-41041");
        // this just means render index.html from static/ area
        return "forsalecars";
    }
}