package br.edu.infnet.AppPetPatreon;

import br.edu.infnet.AppPetPatreon.model.domain.Bird;

public class BirdTest {
    public static void main(String[] args) {
        Bird bird1 = new Bird("Zezé", "Bird", 13, "Male", 12.5f, "Small", 2.4f, 6.7f);
        System.out.println(bird1);

        Bird bird2 = new Bird("Astrogimecleuda", "Bird", 27, "Female", 16.5f, "Large", 3.4f, 5.7f);
        System.out.println(bird2);

        Bird bird3 = new Bird("Ferdinando", "Bird", 5, "Male", 3.5f, "Small", 1.4f, 5.9f);
        System.out.println(bird3);
    }   
}