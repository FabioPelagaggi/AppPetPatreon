package br.edu.infnet.AppPetPatreon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.AppPetPatreon.model.domain.Patreon;
import br.edu.infnet.AppPetPatreon.repository.UserRepository;

@Controller
public class UserController {

    @GetMapping(value = "/user/register")
    public String registerScreen() {
        return "user/register";
    }

    @GetMapping(value = "/user/password")
    public String passwordScreen() {
        return "/";
    }

    @PostMapping(value = "/user/add")
    public String add(Patreon patreon) {

        UserRepository.add(patreon);

        return "redirect:/user/table";
    }

    @GetMapping(value = "/user/{id}/remove")
    public String remove(@PathVariable Integer id) {

        UserRepository.remove(id);

        return "redirect:/user/table";
    }

    @GetMapping(value = "/user/table")
    public String usersTableScreen(Model model) {

        model.addAttribute("patreons", UserRepository.getPatreons());
        model.addAttribute("addedPatreon", UserRepository.addedPatreon);
        model.addAttribute("removedPatreon", UserRepository.removedPatreon);

        UserRepository.addedPatreon = null;
        UserRepository.removedPatreon = null;

        return "user/table";
    }

}