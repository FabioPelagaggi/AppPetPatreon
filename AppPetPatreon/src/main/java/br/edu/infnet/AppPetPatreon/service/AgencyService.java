package br.edu.infnet.AppPetPatreon.service;

import java.util.Comparator;
import java.util.List;

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
        List<Agency> agencies = (List<Agency>) agencyRepository.findAll();

        agencies.sort(Comparator.comparingInt(Agency::getPatreonsSize).reversed());
        
        return agencies;
    }

    public List<Agency> getAgenciesAlpha() {
        List<Agency> agencies = (List<Agency>) agencyRepository.findAll();

        agencies.sort((a1, a2) -> a1.getName().compareTo(a2.getName()));

        return agencies;
    }

}
