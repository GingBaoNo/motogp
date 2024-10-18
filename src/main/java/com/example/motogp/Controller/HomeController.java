package com.example.motogp.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @GetMapping("/")
    public String Home(){
        return "index";
    }

    @GetMapping("/login.html")
    public String Login(){
        return "login";
    }

    @GetMapping("/riders.html")
    public String rider(){
        return "riders";
    }

    @GetMapping("/teams.html")
    public String team(){
        return "teams";
    }

    @GetMapping("/calendar.html")
    public String calendar(){
        return "calendar";
    }

    @GetMapping("/results.html")
    public String result(){
        return "results";
    }

    @GetMapping("/standing.html")
    public String standing(){
        return "standing";
    }

}
