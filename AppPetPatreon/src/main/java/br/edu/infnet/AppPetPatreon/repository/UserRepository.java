package br.edu.infnet.AppPetPatreon.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.edu.infnet.AppPetPatreon.model.domain.Patreon;

@Repository
public interface UserRepository extends CrudRepository<Patreon, Integer> {

}
