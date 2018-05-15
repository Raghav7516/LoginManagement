package com.web.login.controller;


import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/login")
@RestController
public class LoginController {

    @GetMapping("/all")
    public String hello() {
        return "Welcome to spring security";
    }

    @PreAuthorize("hasAnyRole('ADMIN')")
    @GetMapping("/signup/user")
    public String securedHello() {
        return "Secured Hello";
    }

    @GetMapping("/signup/guest")
    public String alternate() {
        return "alternate";
    }
}
