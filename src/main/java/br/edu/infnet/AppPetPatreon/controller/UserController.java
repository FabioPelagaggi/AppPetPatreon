package br.edu.infnet.AppPetPatreon.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
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
        System.out.println(patreon);

        UserRepository.add(patreon);

        return "redirect:/user/table";
    }

    @GetMapping(value = "/user/table")
    public String usersTableScreen() {

        System.out.println("Patreons list");

        List<Patreon> patreons = UserRepository.getPatreons();

        System.out.println(patreons.size());

        for (Patreon patreon : patreons) {
            System.out.println(patreon);
        }

        return "user/table";
    }

}