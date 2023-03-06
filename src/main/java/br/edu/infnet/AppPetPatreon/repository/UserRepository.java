package br.edu.infnet.AppPetPatreon.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.edu.infnet.AppPetPatreon.model.domain.Patreon;

@Repository
public class UserRepository {

    private static Integer id = 0;
    private static Map<Integer, Patreon> patreonsMap = new HashMap<Integer, Patreon>();

    public static Patreon addedPatreon;
    public static Patreon removedPatreon;

    public boolean add(Patreon patreon) {

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

    public Patreon get(Integer id) {
        return patreonsMap.get(id);
    }

    public void remove(Integer id) {
        removedPatreon = patreonsMap.remove(id);
    }

    public List<Patreon> getPatreons() {
        return patreonsMap.values().stream().toList();
    }
}