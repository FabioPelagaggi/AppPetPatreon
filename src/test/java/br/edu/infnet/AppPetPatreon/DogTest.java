package br.edu.infnet.AppPetPatreon;

import br.edu.infnet.AppPetPatreon.domain.Dog;

public class DogTest {
    public static void main(String[] args) {
        Dog dog = new Dog("Pongo", "Dog", 7, "Male", 232.5f, "Colie", "Large", 23.4f, 16.7f);

        System.out.println(dog);

        Dog dog2 = new Dog("Pingo", "Dog", 14, "Female", 132.5f, "Poodle", "Small", 23.4f, 16.7f);

        System.out.println(dog2);

        Dog dog3 = new Dog("Aaron", "Dog", 12, "Male", 232.5f, "Labrador", "Medium", 23.4f, 16.7f);

        System.out.println(dog3);
    }    
}
