package br.edu.infnet.AppPetPatreon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.AppPetPatreon.model.domain.Horse;

@Controller
public class HorseController {

    @PostMapping(value = "/pet/addHorse")
    public String addHorse(Horse horse){
        System.out.println(horse);
        return "redirect:/";
    }
    
}
