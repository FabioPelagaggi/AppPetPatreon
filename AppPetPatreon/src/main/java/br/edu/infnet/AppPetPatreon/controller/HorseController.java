package br.edu.infnet.AppPetPatreon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.AppPetPatreon.model.domain.Horse;
import br.edu.infnet.AppPetPatreon.service.PetService;

@Controller
public class HorseController {

    @Autowired
    private PetService petService;

    @PostMapping(value = "/pet/addHorse")
    public String addHorse(Horse horse) {

        petService.add(horse);

        return "redirect:/pet/table";
    }

}
