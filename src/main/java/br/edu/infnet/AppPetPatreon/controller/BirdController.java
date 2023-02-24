package br.edu.infnet.AppPetPatreon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.AppPetPatreon.model.domain.Bird;
import br.edu.infnet.AppPetPatreon.repository.PetRepository;

@Controller
public class BirdController {

    @PostMapping(value = "/pet/addBird")
    public String addBird(Bird bird) {
        
        PetRepository.add(bird);

        return "redirect:/pet/table";
    }
}
