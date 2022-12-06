package br.edu.infnet.AppPetPatreon;

import java.util.List;

import br.edu.infnet.AppPetPatreon.domain.Dog;
import br.edu.infnet.AppPetPatreon.domain.Donation;
import br.edu.infnet.AppPetPatreon.domain.Patreon;
import br.edu.infnet.AppPetPatreon.domain.Pet;

public class DonationTest {
    public static void main(String[] args) {
        
        Dog dog1 = new Dog("Pongo", "Dog", 7, "Male", 232.5f, "Colie", "Large", false, 23.4f, 16.7f);
        Dog dog2 = new Dog("Pingo", "Dog", 14, "Female", 132.5f, "Poodle", "Small", true, 23.4f, 16.7f);
        Dog dog3 = new Dog("Aaron", "Dog", 12, "Male", 232.5f, "Labrador", "Medium", false, 23.4f, 16.7f);
        Patreon patreon01 = new Patreon("Ernesto", "ernesto@gmail.com", "552197621566");

        List<Pet> pets;
        pets = List.of(dog1, dog2, dog3);

        Donation donation01 = new Donation(1200f, patreon01, pets);

        System.out.println(donation01);
    }
}