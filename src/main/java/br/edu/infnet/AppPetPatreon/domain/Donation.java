package br.edu.infnet.AppPetPatreon.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Donation {

    private float donationAmount;
    private LocalDateTime dateTime;
    private Patreon patreon;
    private List<Pet> pets;

    public Donation() {
        dateTime = LocalDateTime.now();
    }

    public Donation(float donationAmount, Patreon patreon, List<Pet> pets) {
        this.donationAmount = donationAmount;
        this.dateTime = LocalDateTime.now();
        this.patreon = patreon;
        this.pets = pets;
    }

    public float getDonationAmount() {
        return donationAmount;
    }
    public void setDonationAmount(float donationAmount) {
        this.donationAmount = donationAmount;
    }
    public LocalDateTime getDateTime() {
        return dateTime;
    }
    public Patreon getPatreon() {
        return patreon;
    }
    public void setPatreon(Patreon patreon) {
        this.patreon = patreon;
    }
    public List<Pet> getPets() {
        return pets;
    }
    public void setPets(List<Pet> pets) {
        this.pets = pets;
    }

    @Override
    public String toString() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        return String.format("%f;%s", donationAmount, dateTime.format(formatter));
    }   
}