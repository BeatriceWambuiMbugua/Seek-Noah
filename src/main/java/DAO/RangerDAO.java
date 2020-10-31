package DAO;

import models.Ranger;

import java.util.List;

public interface RangerDAO {
    //List
    List<Ranger> getAllRangers();
    void addRanger(Ranger ranger);
}
