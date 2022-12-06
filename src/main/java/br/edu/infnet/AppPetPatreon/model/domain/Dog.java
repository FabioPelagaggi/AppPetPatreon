package br.edu.infnet.AppPetPatreon.model.domain;

public class Dog extends Pet {

    private String breed;
    private String size;
    private boolean castrated;
    private float bathCost;
    private float toysCost;

    public Dog(String name, String animalType, int age, String gender, float foodCost, String breed, String size, boolean castrated, float bathCost, float toysCost){
        super(name, animalType, age, gender, foodCost);
        this.breed = breed;
        this.size = size;
        this.castrated = castrated;
        this.bathCost = bathCost;
        this.toysCost = toysCost;
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

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
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