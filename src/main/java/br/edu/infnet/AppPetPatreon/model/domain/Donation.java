package br.edu.infnet.AppPetPatreon.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import br.edu.infnet.AppPetPatreon.model.exceptions.InvalidDonation;

public class Donation {

    private float donationAmount;
    private LocalDateTime dateTime;
    private Patreon patreon;
    private List<Pet> pets;

    public Donation(float donationAmount, Patreon patreon, List<Pet> pets) throws InvalidDonation {
        
        this.dateTime = LocalDateTime.now();

        if (donationAmount > 0) {
            this.donationAmount = donationAmount;
        } else{
            throw new InvalidDonation("The donation amount must be greater than 0");
        }
        
        if(patreon!= null) {
            this.patreon = patreon;
        } else {
            throw new InvalidDonation("The patreon must not be null");
        }

        if (pets!= null) {
            this.pets = pets;
        } else {
            throw new InvalidDonation("The pets must not be null");
        }
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

    public void print(){
        System.out.println("Donation: " + this);
        System.out.println("Donation Amount: " + this.donationAmount);
        System.out.println("Pets Qty.: " + this.pets.size());
        for (Pet pet : this.pets){
            System.out.println("- " + pet.getName());
        }
    }

    @Override
    public String toString() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        return String.format("%f;%s", donationAmount, dateTime.format(formatter));
    }   
}