package models;

public abstract class Species {
    //add properties
    private int id;
    private String name;

    //generate constructor
    public Species(int id, String name) {
        this.id = id;
        this.name = name;
    }

    //generate getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
