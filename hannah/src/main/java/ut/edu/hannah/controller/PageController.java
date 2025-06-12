package ut.edu.hannah.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PageController {
    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/courses")
    public String courses() {
        return "courses";
    }

    @GetMapping("/community")
    public String community() {
        return "community";
    }

    @GetMapping("/support")
    public String support() {
        return "support"; // Maps to src/main/resources/templates/support.html
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }
}