package br.edu.infnet.AppPetPatreon;

import br.edu.infnet.AppPetPatreon.model.domain.Dog;

public class DogTest {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Pongo", "Dog", 7, "Male", 232.5f, "Colie", "Large", false, 23.4f, 16.7f);
        System.out.println(dog1);

        Dog dog2 = new Dog("Pingo", "Dog", 14, "Female", 132.5f, "Poodle", "Small", true, 23.4f, 16.7f);
        System.out.println(dog2);

        Dog dog3 = new Dog("Aaron", "Dog", 12, "Male", 232.5f, "Labrador", "Medium", false, 23.4f, 16.7f);
        System.out.println(dog3);
    }    
}