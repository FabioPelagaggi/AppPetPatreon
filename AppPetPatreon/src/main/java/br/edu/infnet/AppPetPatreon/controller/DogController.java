package br.edu.infnet.AppPetPatreon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.AppPetPatreon.model.domain.Dog;
import br.edu.infnet.AppPetPatreon.service.PetService;

@Controller
public class DogController {

    @Autowired
    private PetService petService;

    @PostMapping(value = "/pet/addDog")
    public String addDog(Dog dog) {

        petService.add(dog);

        return "redirect:/pet/table";
    }

}
