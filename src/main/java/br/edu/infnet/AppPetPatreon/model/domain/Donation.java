package br.edu.infnet.AppPetPatreon.model.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import br.edu.infnet.AppPetPatreon.constants.CONST;
import br.edu.infnet.AppPetPatreon.model.exceptions.InvalidDonation;
import br.edu.infnet.AppPetPatreon.model.methods.ConvertString;

public class Donation {

    private float orderNumber;
    private float donationAmount;
    private LocalDateTime dateTime;
    private Patreon patreon;
    private List<Pet> pets;

    public Donation(float donationAmount, Patreon patreon, List<Pet> pets) throws Exception {
        
        this.dateTime = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyMMddHHmmss");

        this.orderNumber = ConvertString.toFloat(dateTime.format(formatter));

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
        System.out.println();
        System.out.println("Donation Data: " + this);
        System.out.println("-----------------------");
        System.out.println("Order Number: " + this.orderNumber);
        System.out.println("Donation Amount: " + this.donationAmount);
        System.out.println("Pets Qty.: " + this.pets.size());
        for (Pet pet : this.pets){
            System.out.println("- " + pet.getAnimalType());
            pet.print();
        }
    }

    private float calcPetsTotalMonthlyCost(){
        float total = 0;
        for (Pet pet : this.getPets()){
            total += pet.calcMonthlyCost();
        }
        return total;
    }

    public String writeFile(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(CONST.DONATION_TAG);
        stringBuilder.append(";");
        stringBuilder.append(this.orderNumber);
        stringBuilder.append(";");
        stringBuilder.append(this.dateTime.format(formatter));
        stringBuilder.append(";");
        stringBuilder.append(this.calcPetsTotalMonthlyCost());
        stringBuilder.append(";");
        stringBuilder.append("\r\n");

        return stringBuilder.toString();
    }

    @Override
    public String toString() {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        String stringData = String.format("%s;%f;%f;%s;%s;%s", CONST.DONATION_TAG, this.orderNumber, this.donationAmount, this.dateTime.format(formatter), this.patreon, this.pets.toString());

        return stringData.toString();
    }   
}