package br.edu.infnet.AppPetPatreon;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppPetPatreon.model.domain.Patreon;
import br.edu.infnet.AppPetPatreon.service.UserService;

@Component
public class UserLoader implements ApplicationRunner {

    @Autowired
    private UserService userService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        String file = "Patreons.txt";

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();

            String[] fields = null;

            while (line != null) {
                fields = line.split(";");

                if (fields[0].equalsIgnoreCase("PATREON")) {
                    try {

                        Patreon patreon = new Patreon(fields[1], fields[2], fields[3]);
                        patreon.setPassword(fields[4]);
                        if (fields[5].equalsIgnoreCase("true")) {
                            patreon.setAdmin(true);
                        }

                        System.out.println(patreon.toString());

                        userService.add(patreon);

                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("[ERROR] - " + e.getMessage());
                    }
                } else {
                    System.out.println("Data is not valid");
                }
                line = bufferedReader.readLine();
            }

            bufferedReader.close();
            fileReader.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("[ERROR] - " + e.getMessage());
        }

        System.out.println("Patreons Loaded");
    }
}