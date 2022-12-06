package br.edu.infnet.AppPetPatreon.domain;

public abstract class Pet {

    private String name;
    private String animalType;
    private int age;
    private String gender;
    private float foodCost;

    public Pet(String name, String animalType, int age, String gender, float foodCost) {
        this.name = name;
        this.animalType = animalType;
        this.age = age;
        this.gender = gender;
        this.foodCost = foodCost;
    }

    public String getName() {
        return name;
    }
    public String getAnimalType() {
        return animalType;
    }
    public int getAge() {
        return age;
    }
    public String getGender() {
        return gender;
    }
    public float getFoodCost() {
        return foodCost;
    }

    public abstract float calcMonthlyCost();

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name);
        stringBuilder.append(";");
        stringBuilder.append(animalType);
        stringBuilder.append(";");
        stringBuilder.append(age);
        stringBuilder.append(";");
        stringBuilder.append(gender);
        stringBuilder.append(";");
        stringBuilder.append(foodCost);
        return stringBuilder.toString();
    }
}