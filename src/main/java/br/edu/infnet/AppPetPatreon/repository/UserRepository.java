package br.edu.infnet.AppPetPatreon.repository;

import java.util.ArrayList;
import java.util.List;

import br.edu.infnet.AppPetPatreon.model.domain.Patreon;

public class UserRepository {
    private static List<Patreon> patreons = new ArrayList<Patreon>();

    public static boolean add(Patreon patreon) {
        try{
            patreons.add(patreon);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static List<Patreon> getPatreons() {
        return patreons;
    }
}