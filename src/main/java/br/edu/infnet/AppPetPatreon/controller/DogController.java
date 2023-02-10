package br.edu.infnet.AppPetPatreon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.AppPetPatreon.model.domain.Dog;

@Controller
public class DogController {

    @PostMapping(value = "/pet/addDog")
    public String addDog(Dog dog){
        System.out.println(dog);
        return "redirect:/";
    }
    
}
