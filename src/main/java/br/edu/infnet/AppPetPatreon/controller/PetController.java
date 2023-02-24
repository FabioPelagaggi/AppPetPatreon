package br.edu.infnet.AppPetPatreon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.AppPetPatreon.model.domain.Pet;
import br.edu.infnet.AppPetPatreon.repository.PetRepository;

@Controller
public class PetController {

    @GetMapping(value = "/pet")
    public String registerScreen() {
        return "pet/register";
    }

    @PostMapping(value = "/pet/add")
    public String add(String pet) {

        switch (pet) {
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

    @GetMapping(value = "/pet/{id}/remove")
    public String remove(@PathVariable Integer id) {

        PetRepository.remove(id);

        return "redirect:/pet/table";
    }

    @GetMapping(value = "/pet/table")
    public String petsTableScreen(Model model) {

        model.addAttribute("pets", PetRepository.getPets());
        model.addAttribute("addedPet", PetRepository.addedPet);
        model.addAttribute("removedPet", PetRepository.removedPet);

        PetRepository.addedPet = null;
        PetRepository.removedPet = null;

        return "pet/table";
    }

}
