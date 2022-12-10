package br.edu.infnet.AppPetPatreon.model.domain;

import br.edu.infnet.AppPetPatreon.constants.CONST;
import br.edu.infnet.AppPetPatreon.model.exceptions.InvalidSize;

public class Dog extends Pet {

    private String breed;
    private String size;
    private boolean castrated;
    private float bathCost;
    private float toysCost;

    public Dog(String name, String animalType, int age, String gender, float foodCost, String breed, String size, boolean castrated, float bathCost, float toysCost) throws Exception{
        super(name, animalType, age, gender, foodCost);
        this.breed = breed;
        this.castrated = castrated;
        this.bathCost = bathCost;
        this.toysCost = toysCost;

        if (size != null) {
            this.size = size;
        } else {
            throw new InvalidSize("The size cannot be null");
        }
    }

    public String getBreed() {
        return breed;
    }
    public String getSize() {
        return size;
    }
    public float getBathCost() {
        return bathCost;
    }
    public float getToysCost() {
        return toysCost;
    }

    @Override
    public float calcMonthlyCost() {
        float foodCost = getFoodCost();
        float bathCost = this.getBathCost();
        float toysCost = this.getToysCost();

        if (size.equalsIgnoreCase("small")){
            foodCost *= 0.5f;
            bathCost *= 0.5f;
            toysCost *= 0.5f;
        }
        else if (size.equalsIgnoreCase("medium")){
            bathCost *= 1.5f;
            toysCost *= 1.5f;
        }
        else if (size.equalsIgnoreCase("large")){
            foodCost *= 2f;
            bathCost *= 1.5f;
        }
        return foodCost + bathCost + toysCost;
    }

    public void print(){       
        System.out.println("Dog Name: " + this.getName());
        System.out.println("Breed: " + this.getBreed());
        System.out.println("Gender: " + this.getGender());
        System.out.println("Age: " + this.getAge());
        System.out.println("Size: " + this.getSize());
        System.out.println("Monthly Cost: " + this.calcMonthlyCost());
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(CONST.DOG_TAG);
        stringBuilder.append(";");
        stringBuilder.append(super.toString());
        stringBuilder.append(";");
        stringBuilder.append(breed);
        stringBuilder.append(";");
        stringBuilder.append(size);
        stringBuilder.append(";");
        if (castrated){
            stringBuilder.append("Yes;");
        } else{
            stringBuilder.append("No;");
        }
        stringBuilder.append(bathCost);
        stringBuilder.append(";");
        stringBuilder.append(toysCost);
        stringBuilder.append(";");
        stringBuilder.append(calcMonthlyCost());
        return stringBuilder.toString();
    }
}