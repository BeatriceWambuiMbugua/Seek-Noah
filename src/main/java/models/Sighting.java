package models;

public class Sighting {


    //create properties
    private int id;
    private Species species;
    private int rangerId;
    private int locationId;

    //generate constructor
    public Sighting(Species species, int rangerId, int locationId) {
        this.species = species;
        this.rangerId = rangerId;
        this.locationId = locationId;
    }

    //generate setters and getters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public int getRangerId() {
        return rangerId;
    }

    public void setRangerId(int rangerId) {
        this.rangerId = rangerId;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }
}
