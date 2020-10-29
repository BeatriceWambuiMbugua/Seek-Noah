package DAO;

import models.Location;

import java.util.List;

public interface LocationDAO {
    //create List
    List<Location> getAllLocations();

    void addLocation(Location location);
}
