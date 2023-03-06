package br.edu.infnet.AppPetPatreon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.AppPetPatreon.model.domain.Patreon;
import br.edu.infnet.AppPetPatreon.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public boolean add(Patreon patreon) {
        return userRepository.add(patreon);
    }

    public void remove(Integer id) {
        userRepository.remove(id);
    }

    public Patreon get(Integer id) {
        return userRepository.get(id);
    }

    public List<Patreon> getPatreons() {
        return userRepository.getPatreons();
    }

}
