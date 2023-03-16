package br.edu.infnet.AppPetPatreon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.AppPetPatreon.model.domain.Agency;
import br.edu.infnet.AppPetPatreon.model.domain.Patreon;
import br.edu.infnet.AppPetPatreon.service.AgencyService;

@Controller
public class AgencyController {

    @Autowired
    private AgencyService agencyService;

    @GetMapping(value = "/agency/register")
    public String registerScreen() {
        return "agency/register";
    }

    @PostMapping(value = "/agency/add")
    public String add(Agency agency, @SessionAttribute("logedPatreon") Patreon logedPatreon) {

        agency.addPatreon(logedPatreon);

        agencyService.add(agency);

        return "redirect:/agency/table";
    }

    @GetMapping(value = "/agency/{id}/remove")
    public String remove(@PathVariable Integer id) {

        agencyService.remove(id);

        return "redirect:/agency/table";
    }

    @GetMapping(value = "/agency/table")
    public String agencysTableScreen(Model model) {

        model.addAttribute("agencies", agencyService.getAgencies());

        return "agency/table";
    }
}
