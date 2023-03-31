package br.edu.infnet.AppPetPatreon;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppPetPatreon.model.domain.Agency;
import br.edu.infnet.AppPetPatreon.model.domain.Dog;
import br.edu.infnet.AppPetPatreon.model.domain.Donation;
import br.edu.infnet.AppPetPatreon.model.domain.Patreon;
import br.edu.infnet.AppPetPatreon.model.domain.Pet;
import br.edu.infnet.AppPetPatreon.service.DonationService;

@Order(4)
@Component
public class DonationLoader implements ApplicationRunner {

    @Autowired
    private DonationService donationService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Agency agency = new Agency("Pet Patreon System", "admin@petpatreon.com");
        agency.setId(1);

        Patreon patreon = new Patreon("Vlad Tepes Dracula", "bat18@gmail.com", "65683156613");
        patreon.setId(1);

        Dog dog = new Dog();
        dog.setId(1);

        List<Pet> pets = new ArrayList<Pet>();
        pets.add(dog);
        Donation donation = new Donation((float) 3500.00, patreon, pets);
        donation.setAgency(agency);
        donation.setDateTime(LocalDateTime.now());

        donationService.add(donation);
        
        System.out.println("Donation Loaded");
    }
}