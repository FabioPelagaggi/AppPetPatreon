package br.edu.infnet.AppPetPatreon.model.domain;

import br.edu.infnet.AppPetPatreon.constants.CONST;

public class Horse extends Pet {

    private String breed;
    private float hayCost;
    private float saltCost;
    private float vetCost;

    public Horse(String name, String animalType, int age, String gender, float foodCost, String breed, float hayCost,
            float saltCost, float vetCost) throws Exception {
        super(name, animalType, age, gender, foodCost);
        this.breed = breed;
        this.hayCost = hayCost;
        this.saltCost = saltCost;
        this.vetCost = vetCost;
    }

    public String getBreed() {
        return breed;
    }

    public float getHayCost() {
        return hayCost;
    }

    public float getSaltCost() {
        return saltCost;
    }

    public float getVetCost() {
        return vetCost;
    }

    @Override
    public float calcMonthlyCost() {
        float foodCost = getFoodCost();
        float hayCost = this.getHayCost();
        float vetCost = this.getVetCost();

        return foodCost + hayCost + vetCost;
    }

    public void print() {
        System.out.println("Horse Name: " + this.getName());
        System.out.println("Breed: " + this.getBreed());
        System.out.println("Gender: " + this.getGender());
        System.out.println("Age: " + this.getAge());
        System.out.println("Monthly Cost: " + this.calcMonthlyCost());
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(CONST.HORSE_TAG);
        stringBuilder.append(";");
        stringBuilder.append(super.toString());
        stringBuilder.append(";");
        stringBuilder.append(breed);
        stringBuilder.append(";");
        stringBuilder.append(hayCost);
        stringBuilder.append(";");
        stringBuilder.append(saltCost);
        stringBuilder.append(";");
        stringBuilder.append(vetCost);
        stringBuilder.append(";");
        stringBuilder.append(calcMonthlyCost());
        return stringBuilder.toString();
    }
}