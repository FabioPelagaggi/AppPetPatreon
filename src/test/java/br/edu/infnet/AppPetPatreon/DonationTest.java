package br.edu.infnet.AppPetPatreon;

import java.util.List;

import br.edu.infnet.AppPetPatreon.domain.Bird;
import br.edu.infnet.AppPetPatreon.domain.Dog;
import br.edu.infnet.AppPetPatreon.domain.Donation;
import br.edu.infnet.AppPetPatreon.domain.Horse;
import br.edu.infnet.AppPetPatreon.domain.Patreon;
import br.edu.infnet.AppPetPatreon.domain.Pet;

public class DonationTest {
    public static void main(String[] args) {
        
        Dog dog1 = new Dog("Pongo", "Dog", 7, "Male", 232.5f, "Colie", "Large", false, 23.4f, 16.7f);
        Horse horse1 = new Horse("Sansao", "horse", 15, "Male", 332.3f, "Arabian", 10.3f, 26.7f, 70);
        Bird bird3 = new Bird("Ferdinando", "Bird", 5, "Male", 3.5f, "Small", 1.4f, 5.9f);
        Patreon patreon01 = new Patreon("Ernesto", "ernesto@gmail.com", "552197621566");

        List<Pet> pets;
        pets = List.of(dog1, horse1, bird3);

        Donation donation01 = new Donation(1200f, patreon01, pets);

        System.out.println(donation01);
    }
}