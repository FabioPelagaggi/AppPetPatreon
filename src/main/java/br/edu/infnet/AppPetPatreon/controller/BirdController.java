package br.edu.infnet.AppPetPatreon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.AppPetPatreon.model.domain.Bird;

@Controller
public class BirdController {
    
    @PostMapping(value = "/pet/addBird")
    public String addBird(Bird bird){
        System.out.println(bird);
        return "redirect:/home";
    }
}
