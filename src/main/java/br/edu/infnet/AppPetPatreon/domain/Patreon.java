package br.edu.infnet.AppPetPatreon.domain;

public class Patreon {
    private String name;
    private String email;
    private String phone;

    public Patreon(String name, String email, String phone) {
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(name);
        stringBuilder.append(";");
        stringBuilder.append(email);
        stringBuilder.append(";");
        stringBuilder.append(phone);
        return stringBuilder.toString();
    }
}