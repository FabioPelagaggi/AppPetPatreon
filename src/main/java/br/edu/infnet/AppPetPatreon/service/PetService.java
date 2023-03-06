package br.edu.infnet.AppPetPatreon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.AppPetPatreon.model.domain.Pet;
import br.edu.infnet.AppPetPatreon.repository.PetRepository;

@Service
public class PetService {
    
    @Autowired
    private PetRepository petRepository;

    public boolean add(Pet pet) {
        return petRepository.add(pet);
    }

    public void remove(Integer id) {
        petRepository.remove(id);
    }

    public Pet get(Integer id) {
        return petRepository.get(id);
    }

    public List<Pet> getPets() {
        return petRepository.getPets();
    }
}
