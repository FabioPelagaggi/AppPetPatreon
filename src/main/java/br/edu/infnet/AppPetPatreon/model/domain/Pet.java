package br.edu.infnet.AppPetPatreon.model.domain;

import br.edu.infnet.AppPetPatreon.model.validation.Valid;

public abstract class Pet {

    private Integer id;
    private String name;
    private String animalType;
    private int age;
    private String gender;
    private float foodCost;

    public Pet(String name, String animalType, int age, String gender, float foodCost) throws Exception {
        this.name = Valid.name(name);
        this.age = Valid.age(age);
        this.foodCost = Valid.cost(foodCost);
        this.gender = gender;
        this.animalType = animalType;
    }

    public void setId(Integer id) {
        this.id = id;
    };

    public Integer getId() {
        return id;
    };

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

    public abstract void print();

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