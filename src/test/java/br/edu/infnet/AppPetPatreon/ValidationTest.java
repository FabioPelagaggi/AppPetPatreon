package br.edu.infnet.AppPetPatreon;

import br.edu.infnet.AppPetPatreon.model.domain.Bird;
import br.edu.infnet.AppPetPatreon.model.domain.Dog;
import br.edu.infnet.AppPetPatreon.model.domain.Horse;

public class ValidationTest {
    public static void main(String[] args) {
        // Invalid Name
        Dog dog1 = new Dog("P1ngo", "Dog", 7, "Male", 232.5f, "Colie", "Large", false, 23.4f, 16.7f);
        System.out.println(dog1);

        // Invalid Age
        Bird bird1 = new Bird("Zezé", "Bird", 113, "Male", 12.5f, "Small", 2.4f, 6.7f);
        System.out.println(bird1);

        // Invalid Cost
        Horse horse3 = new Horse("Aquiles", "horse", 6, "Male", 15000.5f, "Mustang", 1.4f, 25.9f, 20);
        System.out.println(horse3);
    }
}
