package br.edu.infnet.AppPetPatreon.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.edu.infnet.AppPetPatreon.model.domain.Patreon;

public class UserRepository {

    private static Integer id = 0;
    private static Map<Integer, Patreon> patreonsMap = new HashMap<Integer, Patreon>();

    public static Patreon addedPatreon;
    public static Patreon removedPatreon;

    public static boolean add(Patreon patreon) {

        addedPatreon = patreon;

        patreon.setId(id++);

        try {
            patreonsMap.put(patreon.getId(), patreon);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static Patreon get(Integer id) {
        return patreonsMap.get(id);
    }

    public static void remove(Integer id) {
        removedPatreon = patreonsMap.remove(id);
    }

    public static List<Patreon> getPatreons() {
        return patreonsMap.values().stream().toList();
    }
}