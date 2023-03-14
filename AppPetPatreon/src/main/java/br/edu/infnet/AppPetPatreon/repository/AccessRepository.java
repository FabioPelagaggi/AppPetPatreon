package br.edu.infnet.AppPetPatreon.repository;

import org.springframework.beans.factory.annotation.Autowired;

import br.edu.infnet.AppPetPatreon.model.domain.Patreon;
import br.edu.infnet.AppPetPatreon.service.UserService;

public class AccessRepository {

    public static Patreon logedUser;

    @Autowired
    private static UserService userService;

    public static boolean validate(String email, String password) {

        boolean isValid = false;

        for (Patreon patreon : userService.getPatreons()) {
            if (patreon.getEmail().equals(email) && patreon.getPassword().equals(password)) {
                System.out.println("Login Successful");
                System.out.println("Welcome " + patreon.toString());
                isValid = true;

                logedUser = patreon;
            }
        }

        if (!isValid) {
            System.out.println("Login Failed");
        }

        return isValid;
    }

}