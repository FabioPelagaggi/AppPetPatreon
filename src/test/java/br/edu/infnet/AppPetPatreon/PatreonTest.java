package br.edu.infnet.AppPetPatreon;

import br.edu.infnet.AppPetPatreon.model.domain.Patreon;

public class PatreonTest {
    public static void main(String[] args) {
        Patreon patreon01 = new Patreon("Ernesto", "ernesto@gmail.com", "552197621566");
        System.out.println(patreon01);

        Patreon patreon02 = new Patreon("Ferdinando", "ferdinandinho@gmail.com", "552378787878");
        System.out.println(patreon02);

        Patreon patreon03 = new Patreon("Maria Arauja", "maria_lulu@gmail.com", "35199621886");
        System.out.println(patreon03);
    }
}