package br.edu.infnet.AppPetPatreon.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import br.edu.infnet.AppPetPatreon.model.domain.Patreon;
import br.edu.infnet.AppPetPatreon.service.PatreonService;

@Controller
@SessionAttributes("logedUser")
public class AccessController {

    Patreon logedUser = null;

    @Autowired
    private PatreonService userService;

    @GetMapping(value = "/login")
    public String loginScreen() {
        return "login";
    }

    @GetMapping(value = "/logout")
    public String logout(HttpSession session, SessionStatus status) {

        status.setComplete();
        session.removeAttribute("logedUser");
        logedUser = null;

        return "redirect:/home";
    }

    @PostMapping(value = "/login")
    public String login(Model model, @RequestParam String email, @RequestParam String password) {

        logedUser = userService.validate(email, password);

        if (logedUser != null) {

            model.addAttribute("logedUser", logedUser);

            return "redirect:/home";
        } else {

            model.addAttribute("errorMsg", "Invalid Email or Password");

            return "login";
        }
    }

}
