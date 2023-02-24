package br.edu.infnet.AppPetPatreon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.AppPetPatreon.repository.AccessRepository;
import br.edu.infnet.AppPetPatreon.repository.UserRepository;

@Controller
public class AccessController {

    @GetMapping(value = "/login")
    public String loginScreen() {
        return "login";
    }

    @GetMapping(value = "/logout")
    public String logout() {

        UserRepository.logedUser = null;

        return "redirect:/home";
    }

    @PostMapping(value = "/login")
    public String login(Model model, @RequestParam String email, @RequestParam String password) {
        System.out.println("RequestParam Email: " + email);
        System.out.println("RequestParam Password: " + password);

        if (AccessRepository.validate(email, password)) {

            model.addAttribute("logedUser", UserRepository.logedUser);

            return "index";
        } else {

            model.addAttribute("errorMsg", "Invalid Email or Password");

            return "login";
        }
    }

}
