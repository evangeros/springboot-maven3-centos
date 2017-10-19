package de.codecentric.springbootmaven3centos;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class App {

    @Value("${cloud.source}")
    private String cloudSource;

    @Value("${cloud.greeting}")
    private String cloudGreeting;

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return cloudGreeting + cloudSource;
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(App.class, args);
    }
}
