package br.edu.infnet.AppPetPatreon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.AppPetPatreon.model.domain.Horse;
import br.edu.infnet.AppPetPatreon.repository.PetRepository;

@Controller
public class HorseController {

    @PostMapping(value = "/pet/addHorse")
    public String addHorse(Horse horse) {

        PetRepository.add(horse);

        return "redirect:/pet/table";
    }

}
