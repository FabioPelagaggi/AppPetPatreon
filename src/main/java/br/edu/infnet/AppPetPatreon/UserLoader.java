package br.edu.infnet.AppPetPatreon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import br.edu.infnet.AppPetPatreon.model.domain.Patreon;
import br.edu.infnet.AppPetPatreon.service.UserService;

@Component
public class UserLoader implements ApplicationRunner {

    @Autowired
    private UserService userService;

    @Override
    public void run(ApplicationArguments args) throws Exception {

        Patreon patreon = new Patreon("Vlad Tepes Dracula", "bat18@gmail.com", "65683156613");
        patreon.setPassword("666");
        patreon.setAdmin(true);

        userService.add(patreon);

        System.out.println("Application Started");
    }

}
