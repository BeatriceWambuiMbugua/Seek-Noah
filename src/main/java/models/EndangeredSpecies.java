package models;

public class EndangeredSpecies extends Species{
    //add properties
    private String health;
    private int age;
    private String gender;

    //generate constructor passing the arguments from the parent class
    public EndangeredSpecies(int id, String name, String health, int age, String gender) {
        super(id, name);
        this.health = health;
        this.age = age;
        this.gender = gender;
    }

    //generate getters and setters
    public String getHealth() {
        return health;
    }

    public void setHealth(String health) {
        this.health = health;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
