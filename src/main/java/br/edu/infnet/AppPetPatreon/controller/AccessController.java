package br.edu.infnet.AppPetPatreon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class AccessController {
    
    @GetMapping(value = "/login")
    public String loginScreen(){
        return "login";
    }
    
    @PostMapping(value = "/login/log")
    public String login(String email, String password){
        System.out.println("Email: "+ email);
        System.out.println("Password: "+ password);
        return "redirect:/";
    }
    
}
