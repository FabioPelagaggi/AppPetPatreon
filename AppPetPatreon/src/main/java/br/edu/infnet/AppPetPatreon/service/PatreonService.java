package br.edu.infnet.AppPetPatreon.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.AppPetPatreon.model.domain.Agency;
import br.edu.infnet.AppPetPatreon.model.domain.Patreon;
import br.edu.infnet.AppPetPatreon.repository.PatreonRepository;

@Service
public class PatreonService {

    @Autowired
    private PatreonRepository patreonRepository;

    public Patreon add(Patreon patreon) {
        return patreonRepository.save(patreon);
    }

    public Patreon validate(String email, String password) {
        return patreonRepository.validate(email, password);
    }

    public void remove(Integer id) {
        patreonRepository.deleteById(id);
    }

    public Patreon get(Integer id) {
        return patreonRepository.findById(id).get();
    }

    public List<Patreon> getPatreons() {
        return (List<Patreon>) patreonRepository.findAll();
    }

    public List<Patreon> getPatreons(Agency agency) {

        List<Patreon> patreonsAgency = new ArrayList<Patreon>();
        List<Patreon> patreons = (List<Patreon>) patreonRepository.findAll();

        for (Patreon patreon : patreons) {
            if (patreon.getAgency().getName().equalsIgnoreCase(agency.getName())) {
                patreonsAgency.add(patreon);
            }
        }

        return patreonsAgency;
    }

}
