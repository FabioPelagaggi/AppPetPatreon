package br.edu.infnet.AppPetPatreon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.AppPetPatreon.model.domain.Dog;
import br.edu.infnet.AppPetPatreon.repository.PetRepository;

@Controller
public class DogController {

    @PostMapping(value = "/pet/addDog")
    public String addDog(Dog dog) {

        PetRepository.add(dog);

        return "redirect:/pet/table";
    }

}
