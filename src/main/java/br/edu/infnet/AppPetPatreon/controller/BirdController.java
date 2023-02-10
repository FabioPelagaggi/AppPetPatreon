package br.edu.infnet.AppPetPatreon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.AppPetPatreon.model.domain.Pet;

@Controller
public class BirdController {
    
    @PostMapping(value = "/pet/addBird")
    public String addBird(){
        System.out.println();
        return "redirect:/";
    }
}
