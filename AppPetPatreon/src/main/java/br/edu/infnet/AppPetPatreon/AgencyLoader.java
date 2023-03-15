package br.edu.infnet.AppPetPatreon;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppPetPatreon.model.domain.Agency;
import br.edu.infnet.AppPetPatreon.service.AgencyService;

@Order(1)
@Component
public class AgencyLoader implements ApplicationRunner {

    @Autowired
    private AgencyService agencyService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Agency agencyPetPatreon = new Agency("Pet Patreon System", "admin@petpatreon.com");
        agencyPetPatreon.setId(1);

        agencyService.add(agencyPetPatreon);

        String file = "textdata//Agencies.txt";

        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line = bufferedReader.readLine();

            String[] fields = null;

            while (line != null) {
                fields = line.split(";");

                if (fields[0].equalsIgnoreCase("AGENCY")) {
                    try {

                        Agency agency = new Agency(fields[1], fields[2]);

                        System.out.println(agency.toString());

                        agencyService.add(agency);

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

        System.out.println("Agencies Loaded");
    }
}
