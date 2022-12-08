package br.edu.infnet.AppPetPatreon.model.domain;

import br.edu.infnet.AppPetPatreon.model.validation.Valid;

public class Patreon {

    private String firstName;
    private String middleName = "";
    private String lastName = "";
    private String email;
    private String phone;

    public Patreon(String name, String email, String phone) throws Exception {
        
        this.setName(Valid.name(name));
        this.email = Valid.email(email);
        this.phone = Valid.phone(phone);
    }

    private void setFirstName(String inputFirstName) {
        firstName = inputFirstName;
    };

    private String getFirstName(){
        return firstName;
    };

    private void setMiddleName(String inputMiddleName) {
        middleName = inputMiddleName;
    };

    private String getMiddleName(){
        return middleName;
    };

    private void setLastName(String inputLastName) {
        lastName = inputLastName;
    };

    private String getLastName(){
        return lastName;
    };
    
    public String getEmail() {
        return email;
    }
    public String getPhone() {
        return phone;
    }

    public String getName(){
        StringBuilder fullName = new StringBuilder();

        String firstName = getFirstName();
        String middleName = getMiddleName();
        String lastName = getLastName();

        fullName.append(firstName);
        fullName.append(" ");
        fullName.append(middleName);
        fullName.append(" ");
        fullName.append(lastName);

        return fullName.toString();
    };

    public void setName(String inputFullName) {
        String[] nameArray = inputFullName.split(" ");

        setFirstName(nameArray[0]);
        if(nameArray.length > 2){
            setMiddleName(middleNameBuilder(nameArray));
        }
        if(nameArray.length > 1){
            setLastName(nameArray[nameArray.length -1]);
        }
    };

    private String middleNameBuilder(String[] nameArray){
        StringBuilder middleNameBuilder = new StringBuilder();

        for (int i = 1; i < nameArray.length -1; i++) {
            middleNameBuilder.append(nameArray[i]);
            if(i < nameArray.length -2){
                middleNameBuilder.append(" ");
            }
        }
        return middleNameBuilder.toString();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getName());
        stringBuilder.append(";");
        stringBuilder.append(this.email);
        stringBuilder.append(";");
        stringBuilder.append(this.phone);
        return stringBuilder.toString();
    }
}