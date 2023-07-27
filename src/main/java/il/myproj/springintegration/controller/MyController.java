package il.myproj.springintegration.controller;//package il.myproj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import il.myproj.springintegration.config.Directory;
@RestController
@RequestMapping("/")
public class MyController {
    //http://localhost:8080/springApp

    @GetMapping("/springApp")
    public String index() {


        return "Greetings from Spring Boot!";
    }

}