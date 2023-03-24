package br.edu.infnet.AppPetPatreon.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttribute;

import br.edu.infnet.AppPetPatreon.model.domain.Donation;
import br.edu.infnet.AppPetPatreon.model.domain.Patreon;
import br.edu.infnet.AppPetPatreon.service.DonationService;
import br.edu.infnet.AppPetPatreon.service.PetService;

@Controller
public class DonationController {
    
    @Autowired
    private DonationService donationService;

    @Autowired
    private PetService petService;

    @GetMapping(value = "/donation/register")
    public String registerScreen(Model model) {

        model.addAttribute("pets", petService.getPets());

        return "donation/register";
    }

    @PostMapping(value = "/donation/add")
    public String add(Donation donation, @RequestParam Integer petId, @SessionAttribute("logedPatreon") Patreon logedPatreon) {

        donation.setPatreon(logedPatreon);
        donation.setAgency(logedPatreon.getAgency());
        donation.setDateTime(LocalDateTime.now());
        donation.addPet(petService.get(petId));
        donationService.add(donation);

        return "redirect:/donation/table";
    }

    @GetMapping(value = "/donation/{id}/remove")
    public String remove(@PathVariable Integer id) {

        donationService.remove(id);

        return "redirect:/donation/table";
    }

    @GetMapping(value = "/donation/table")
    public String petsTableScreen(Model model, @SessionAttribute("logedPatreon") Patreon logedPatreon) {

        model.addAttribute("donations", donationService.getDonations(logedPatreon));

        return "donation/table";
    }
}
