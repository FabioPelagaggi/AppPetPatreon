package br.edu.infnet.AppPetPatreon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.AppPetPatreon.model.domain.Patreon;
import br.edu.infnet.AppPetPatreon.service.AgencyService;
import br.edu.infnet.AppPetPatreon.service.PatreonService;

@Controller
public class PatreonController {

    @Autowired
    private PatreonService patreonService;

    @Autowired
    private AgencyService agencyService;

    @GetMapping(value = "/patreon/register")
    public String registerScreen(Model model) {

        model.addAttribute("agencies", agencyService.getAgencies());
        
        return "patreon/register";
    }

    @GetMapping(value = "/patreon/password")
    public String passwordScreen() {
        return "/";
    }

    @PostMapping(value = "/patreon/add")
    public String add(Patreon patreon, @RequestParam Integer agencyId) {

        patreon.setAgency(agencyService.get(agencyId));
        patreonService.add(patreon);

        return "redirect:/home";
    }

    @GetMapping(value = "/patreon/{id}/remove")
    public String remove(@PathVariable Integer id) {

        patreonService.remove(id);

        return "redirect:/patreon/table";
    }

    @GetMapping(value = "/patreon/table")
    public String patreonsTableScreen(Model model, @SessionAttribute("logedPatreon") Patreon logedPatreon) {

        model.addAttribute("patreons", patreonService.getPatreons(logedPatreon.getAgency()));

        return "patreon/table";
    }

}