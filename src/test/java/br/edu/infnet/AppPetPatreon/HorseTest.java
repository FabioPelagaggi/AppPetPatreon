package br.edu.infnet.AppPetPatreon;

import br.edu.infnet.AppPetPatreon.domain.Horse;

public class HorseTest {
    public static void main(String[] args) {
        Horse horse1 = new Horse("Sansao", "horse", 15, "Male", 332.3f, "Arabian", 10.3f, 26.7f, 70);
        System.out.println(horse1);

        Horse horse2 = new Horse("Eris", "horse", 22, "Felame", 406.4f, "Thoroughbred", 13.4f, 15.7f, 30);
        System.out.println(horse2);

        Horse horse3 = new Horse("Aquiles", "horse", 6, "Male", 150.5f, "Mustang", 1.4f, 25.9f, 20);
        System.out.println(horse3);
    }   
}
