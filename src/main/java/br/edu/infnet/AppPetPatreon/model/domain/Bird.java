package br.edu.infnet.AppPetPatreon.model.domain;

import br.edu.infnet.AppPetPatreon.model.exceptions.InvalidSize;

public class Bird extends Pet{

    private String size;
    private float hayCost;
    private float toysCost;
    
    public Bird(String name, String animalType, int age, String gender, float foodCost, String size, float hayCost, float toysCost) throws Exception{
        super(name, animalType, age, gender, foodCost);
        this.hayCost = hayCost;
        this.toysCost = toysCost;
        
        if (size != null) {
            this.size = size;
        } else {
            throw new InvalidSize("The size cannot be null");
        }
    }

    public String getSize() {
        return size;
    }
    public float getHayCost() {
        return hayCost;
    }
    public float getToysCost() {
        return toysCost;
    }

    @Override
    public float calcMonthlyCost() {
        float foodCost = getFoodCost();
        float hayCost = this.getHayCost();
        float toysCost = this.getToysCost();

        if (size.equalsIgnoreCase("small")){
            foodCost *= 0.3f;
            toysCost *= 0.5f;
        }
        else if (size.equalsIgnoreCase("large")){
            foodCost *= 1.2f;
            hayCost *= 1.2f;
            toysCost *= 1.2f;
        }

        return foodCost + hayCost + toysCost;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        stringBuilder.append(";");
        stringBuilder.append(size);
        stringBuilder.append(";");
        stringBuilder.append(hayCost);
        stringBuilder.append(";");
        stringBuilder.append(toysCost);
        stringBuilder.append(";");
        stringBuilder.append(calcMonthlyCost());
        return stringBuilder.toString();
    }
}