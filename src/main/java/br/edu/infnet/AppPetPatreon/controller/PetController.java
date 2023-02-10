package br.edu.infnet.AppPetPatreon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PetController {

    @GetMapping(value = "/pet")
    public String registerScreen(){
        return "pet/register";
    }

    @PostMapping(value = "/pet/add")
    public String add(String pet){
        
        switch(pet){
            case "Dog":
                return "pet/regDog";
            case "Bird":
                return "pet/regBird";
            case "Horse":
                return "pet/regHorse";
            default:
                return "pet/register";
        }
    }

    
}
