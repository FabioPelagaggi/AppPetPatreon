package br.edu.infnet.AppPetPatreon.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import br.edu.infnet.AppPetPatreon.model.domain.Pet;

@Repository
public class PetRepository {

    private static Integer id = 0;
    private static Map<Integer, Pet> petsMap = new HashMap<Integer, Pet>();

    public static Pet addedPet;
    public static Pet removedPet;

    public boolean add(Pet pet) {

        addedPet = pet;

        pet.setId(id++);

        try {
            petsMap.put(pet.getId(), pet);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public Pet get(Integer id) {
        return petsMap.get(id);
    }

    public void remove(Integer id) {
        removedPet = petsMap.remove(id);
    }

    public List<Pet> getPets() {
        return petsMap.values().stream().toList();
    }
}