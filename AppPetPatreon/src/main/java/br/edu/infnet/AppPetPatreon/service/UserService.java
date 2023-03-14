package br.edu.infnet.AppPetPatreon.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.infnet.AppPetPatreon.model.domain.Patreon;
import br.edu.infnet.AppPetPatreon.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public Patreon add(Patreon patreon) {
        return userRepository.save(patreon);
    }

    public void remove(Integer id) {
        userRepository.deleteById(id);
    }

    public Optional<Patreon> get(Integer id) {
        return userRepository.findById(id);
    }

    public List<Patreon> getPatreons() {
        return (List<Patreon>) userRepository.findAll();
    }

}
