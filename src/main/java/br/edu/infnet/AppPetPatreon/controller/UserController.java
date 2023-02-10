package br.edu.infnet.AppPetPatreon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import br.edu.infnet.AppPetPatreon.model.domain.Patreon;

@Controller
public class UserController {
    
    @GetMapping(value = "/user/register")
    public String registerScreen(){
        return "user/register";
    }

    @GetMapping(value = "/user/password")
    public String passwordScreen(){
        return "/";
    }

    @PostMapping(value = "/user/add")
    public String add(Patreon patreon){
        System.out.println(patreon);
        return "redirect:/user/table";
    }

    @GetMapping(value = "/user/table")
    public String usersTableScreen(){
        return "user/table";
    }

}