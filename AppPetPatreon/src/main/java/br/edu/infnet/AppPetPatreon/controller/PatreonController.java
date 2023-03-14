package br.edu.infnet.AppPetPatreon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.AppPetPatreon.model.domain.Patreon;
import br.edu.infnet.AppPetPatreon.service.PatreonService;

@Controller
public class PatreonController {

    @Autowired
    private PatreonService patreonService;

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

        patreonService.add(patreon);

        return "redirect:/home";
    }

    @GetMapping(value = "/user/{id}/remove")
    public String remove(@PathVariable Integer id) {

        patreonService.remove(id);

        return "redirect:/user/table";
    }

    @GetMapping(value = "/user/table")
    public String usersTableScreen(Model model) {

        model.addAttribute("patreons", patreonService.getPatreons());

        return "user/table";
    }

}