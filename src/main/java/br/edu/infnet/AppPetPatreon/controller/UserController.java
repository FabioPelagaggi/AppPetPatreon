package br.edu.infnet.AppPetPatreon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.AppPetPatreon.model.domain.Patreon;

@Controller
public class UserController {

    @GetMapping(value = "/user")
    public String registerScreen(){
        return "user/register";
    }

    @PostMapping(value = "/user/add")
    public String add(Patreon patreon){
        System.out.println(patreon);
        return "redirect:/";
    }

}