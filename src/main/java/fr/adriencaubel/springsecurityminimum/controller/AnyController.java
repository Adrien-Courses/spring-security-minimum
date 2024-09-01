package fr.adriencaubel.springsecurityminimum.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnyController {

    @GetMapping("/private")
    public String mustAuthenticated() {
        return "<h1>You are authenticated</h1>";
    }
}
