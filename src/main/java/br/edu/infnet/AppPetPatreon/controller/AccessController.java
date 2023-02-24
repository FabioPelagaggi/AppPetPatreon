package br.edu.infnet.AppPetPatreon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.edu.infnet.AppPetPatreon.repository.AccessRepository;

@Controller
public class AccessController {

    @GetMapping(value = "/login")
    public String loginScreen() {
        return "login";
    }

    @PostMapping(value = "/login")
    public String login(Model model, @RequestParam String email, @RequestParam String password) {
        System.out.println("RequestParam Email: " + email);
        System.out.println("RequestParam Password: " + password);

        if (AccessRepository.validate(email, password)) {
            return "redirect:/home";
        } else {

            model.addAttribute("errorMsg", "Invalid Email or Password");

            return "login";
        }
    }

}
