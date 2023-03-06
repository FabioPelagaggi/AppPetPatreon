package br.edu.infnet.AppPetPatreon;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppPetPatreon.model.domain.Bird;
import br.edu.infnet.AppPetPatreon.model.domain.Dog;
import br.edu.infnet.AppPetPatreon.model.domain.Horse;
import br.edu.infnet.AppPetPatreon.model.methods.ConvertString;
import br.edu.infnet.AppPetPatreon.service.PetService;

@Component
public class PetLoader {

    // @Autowired
    // private PetService petService;

    // @Override
    // public void run(ApplicationArguments args) throws Exception {

    // String file = "Pets.txt";

    // try {
    // FileReader fileReader = new FileReader(file);
    // BufferedReader bufferedReader = new BufferedReader(fileReader);

    // String line = bufferedReader.readLine();

    // String[] fields = null;

    // while (line != null) {
    // fields = line.split(";");

    // switch (fields[0].toUpperCase()) {
    // case "DOG":
    // try {
    // boolean castrated = false;
    // if (fields[8].equalsIgnoreCase("Yes")) {
    // castrated = true;
    // }
    // Dog dog = new Dog(fields[1], fields[2], ConvertString.toInt(fields[3]),
    // fields[4],
    // ConvertString.toFloat(fields[5]), fields[6], fields[7], castrated,
    // ConvertString.toFloat(fields[9]), ConvertString.toFloat(fields[10]));
    // petService.add(dog);
    // System.out.println(dog.toString());
    // } catch (Exception e) {
    // e.printStackTrace();
    // System.out.println("[ERROR] - " + e.getMessage());
    // }
    // break;

    // case "HORSE":
    // try {
    // Horse horse = new Horse(fields[1], fields[2], ConvertString.toInt(fields[3]),
    // fields[4],
    // ConvertString.toFloat(fields[5]), fields[6],
    // ConvertString.toFloat(fields[7]),
    // ConvertString.toFloat(fields[8]), ConvertString.toFloat(fields[9]));
    // petService.add(horse);
    // System.out.println(horse.toString());
    // } catch (Exception e) {
    // e.printStackTrace();
    // System.out.println("[ERROR] - " + e.getMessage());
    // }
    // break;

    // case "BIRD":
    // try {
    // Bird bird = new Bird(fields[1], fields[2], ConvertString.toInt(fields[3]),
    // fields[4],
    // ConvertString.toFloat(fields[5]), fields[6],
    // ConvertString.toFloat(fields[7]),
    // ConvertString.toFloat(fields[8]));
    // petService.add(bird);
    // System.out.println(bird.toString());
    // } catch (Exception e) {
    // e.printStackTrace();
    // System.out.println("[ERROR] - " + e.getMessage());
    // }
    // break;

    // default:
    // System.out.println("Data Unknown");
    // break;
    // }
    // }
    // } catch (Exception e) {
    // e.printStackTrace();
    // System.out.println("[ERROR] - " + e.getMessage());
    // }

    // System.out.println("Pets Loaded");
    // }

}
