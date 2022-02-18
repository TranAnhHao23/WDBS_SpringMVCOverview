package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
//    @GetMapping("/greeting")
//    public String greeting(){
//        return "view";
//    }
    @GetMapping("/greeting")
    public ModelAndView changeName(@RequestParam("name") String name) {
        ModelAndView modelAndView = new ModelAndView("view");
        modelAndView.addObject("name", name);
        return modelAndView;
    }
}
