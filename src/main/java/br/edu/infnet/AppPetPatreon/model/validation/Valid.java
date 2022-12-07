package br.edu.infnet.AppPetPatreon.model.validation;

public class Valid {    

    public static String name(String input) throws Exception{
        boolean isName = false;

        char[] chars = input.toCharArray();
        StringBuilder intList = new StringBuilder();
        for(char c : chars){
            if(Character.isDigit(c)){
                intList.append(c);
            }
        }

        if (intList.length() == 0){
            isName = true;
        }

        if (isName) {
            return input;
        }
        else {
            throw new Exception("Invalid Name");
        }
    }

    public static int age(int input) throws Exception{
        boolean isAge = false;

        if (input >= 0 && input <= 100) {
            isAge = true;
        }

        if (isAge) {
            return input;
        }
        else {
            throw new Exception("Invalid Age");
        }
    }

    public static float cost(float input)  throws Exception{
        boolean validCost = false;

        if (input >= 0 && input <= 10000){
            validCost = true;
        }

        if (validCost) {
            return input;
        }
        else {
            throw new Exception("Invalid Cost");
        }
    }

    private static boolean isInt(String input) throws Exception{
        boolean isInt = false;

        try{
            Integer.parseInt(input);
            isInt = true;
        }
        catch (NumberFormatException ex){
            ex.printStackTrace();
        }

        return isInt;
    }

    private static boolean isFloat(String input) throws Exception{
        boolean isFloat = false;

        Float.parseFloat(input);
        isFloat = true;
        
        return isFloat;
    } 
}
