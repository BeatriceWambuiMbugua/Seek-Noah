package models;

public class SightingEndangeredSpecies extends Sighting {
    private int speciesAge;
    private String speciesHealth;
    private static final String TYPE = "Endangered";

    //generate constructors

    public SightingEndangeredSpecies(String speciesName, int rangerId, int locationId, int speciesAge, String speciesHealth) {
        super(speciesName, rangerId, locationId);
        this.speciesAge = speciesAge;
        this.speciesHealth = speciesHealth;
        this.setType(TYPE);
    }

    //generate setters and getters

    public int getSpeciesAge() {
        return speciesAge;
    }

    public void setSpeciesAge(int speciesAge) {
        this.speciesAge = speciesAge;
    }

    public String getSpeciesHealth() {
        return speciesHealth;
    }

    public void setSpeciesHealth(String speciesHealth) {
        this.speciesHealth = speciesHealth;
    }
}
