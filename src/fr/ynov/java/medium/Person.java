package fr.ynov.java.medium;

enum Nationality {
    USA("United States of America","US", "English"),
    GERMANY("Germany","DE", "Deutsch"),
    FRENCH("French","FR", "French"),
    ITALIAN("Italian","IT", "Italian");


    private final String countryName;
    private final String countryCode;
    private final String language;


    Nationality(String countryName, String countryCode, String language) {
        this.countryName = countryName;
        this.countryCode = countryCode;
        this.language = language;
    }
    public String getCountryName() {
        return countryName;
    }
    public String getCountryCode() {
        return countryCode;
    }
    public String getLanguage() {
        return language;
    }
}


public class Person {
    private final String name;
    private final int age;
    private final String gender;
    private final float height;
    private final float weight;
    private final Nationality nationality;

    public Person(String name, int age, String gender, float height, float weight, Nationality nationality) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.nationality = nationality;
    }

    public void printPerson() {
        System.out.println("Person Details :");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age + " years old");
        System.out.println("Gender: " + gender);
        System.out.println("Height: " + height+ " cm");
        System.out.println("Weight: " + weight+ " kg");
        System.out.println("Nationality: " + nationality.getCountryName() + " " + nationality.getCountryCode());
        System.out.println("Language: " + nationality.getLanguage());
    }

    public static void main(String[] args) {
        Person person  = new Person("Loïc ANDRIANARIVONY",25,"Male",172,85, Nationality.FRENCH);
        person.printPerson();
    }
}

