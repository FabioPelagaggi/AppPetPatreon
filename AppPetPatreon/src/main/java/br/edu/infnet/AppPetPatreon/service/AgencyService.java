package br.edu.infnet.AppPetPatreon.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.AppPetPatreon.model.domain.Agency;
import br.edu.infnet.AppPetPatreon.repository.AgencyRepository;

@Service
public class AgencyService {

    @Autowired
    private AgencyRepository agencyRepository;

    public Agency add(Agency agency) {
        return agencyRepository.save(agency);
    }

    public void remove(Integer id) {
        agencyRepository.deleteById(id);
    }

    public Agency get(Integer id) {
        return agencyRepository.findById(id).get();
    }

    public List<Agency> getAgencies() {
        return (List<Agency>) agencyRepository.findAll();
    }

}
