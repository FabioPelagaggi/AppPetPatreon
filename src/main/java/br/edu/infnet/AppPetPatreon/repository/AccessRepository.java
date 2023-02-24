package br.edu.infnet.AppPetPatreon.repository;

import br.edu.infnet.AppPetPatreon.model.domain.Patreon;

public class AccessRepository {
    
    public static boolean validate(String email, String password){

        boolean isValid = false;

        for (Patreon patreon : UserRepository.getPatreons()) {
            if (patreon.getEmail().equals(email) && patreon.getPassword().equals(password)) {
                System.out.println("Login Successful");
                isValid = true;

                UserRepository.logedUser = patreon;
            } 
        }

        if (!isValid) {
            System.out.println("Login Failed");
        }

        return isValid;
    }

}
