package br.edu.infnet.AppPetPatreon;

import br.edu.infnet.AppPetPatreon.domain.Patreon;

public class PatreonTest {

    public static void main(String[] args) {
        
        Patreon patreonTest01 = new Patreon("Ernesto", "ernesto@gmail.com", "552197621566");
        System.out.println(patreonTest01);

        Patreon patreonTest02 = new Patreon("Ferdinando", "ferdinandinho@gmail.com", "552378787878");
        System.out.println(patreonTest02);

        Patreon patreonTest03 = new Patreon("Maria Arauja", "maria_lulu@gmail.com", "35199621886");
        System.out.println(patreonTest03);

    }
}
