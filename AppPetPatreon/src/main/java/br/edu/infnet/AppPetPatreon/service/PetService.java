package br.edu.infnet.AppPetPatreon.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.AppPetPatreon.model.domain.Agency;
import br.edu.infnet.AppPetPatreon.model.domain.Pet;
import br.edu.infnet.AppPetPatreon.repository.PetRepository;

@Service
public class PetService {
    
    @Autowired
    private PetRepository petRepository;

    public Pet add(Pet pet) {
        return petRepository.save(pet);
    }

    public void remove(Integer id) {
        petRepository.deleteById(id);
    }

    public Pet get(Integer id) {
        return petRepository.findById(id).get();
    }

    public List<Pet> getPets() {
        return (List<Pet>) petRepository.findAll();
    }

    
    public List<Pet> getPets(Agency agency) {

        List<Pet> petsAgency = new ArrayList<Pet>();
        List<Pet> pets = (List<Pet>) petRepository.findAll();

        for (Pet pet : pets) {
            if (pet.getAgency().getName().equalsIgnoreCase(agency.getName())) {
                petsAgency.add(pet);
            }
        }

        return petsAgency;
    }
}
