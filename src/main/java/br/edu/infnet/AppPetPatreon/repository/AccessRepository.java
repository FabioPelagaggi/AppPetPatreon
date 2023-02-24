package br.edu.infnet.AppPetPatreon.repository;

public class AccessRepository {
    
    public static boolean validate(String email, String password){

        if(email.equalsIgnoreCase("bat@gmail.com") && password.equalsIgnoreCase("666")){
            System.out.println("Login Successful");
            return true;
        } else {
            System.out.println("Login Failed");
            return false;
        }
    }

}
