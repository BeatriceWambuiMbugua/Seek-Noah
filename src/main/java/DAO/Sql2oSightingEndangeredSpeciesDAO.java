package DAO;

import models.SightingEndangeredSpecies;
import org.sql2o.Connection;
import org.sql2o.Sql2o;
import org.sql2o.Sql2oException;

import java.util.List;

public class Sql2oSightingEndangeredSpeciesDAO implements SightingEndangeredSpeciesDAO{
   private final Sql2o sql2o;

   //generate constructor
    public Sql2oSightingEndangeredSpeciesDAO(Sql2o sql2o) {
        this.sql2o = sql2o;
    }
    //generate Override code
    @Override
    public List<SightingEndangeredSpecies> getAllEndangered() {
        String sql = "SELECT * FROM sightings WHERE type = 'Endangered'";
        try(Connection con = sql2o.open()){
            return con.createQuery(sql)
                    .executeAndFetch(SightingEndangeredSpecies.class);
        }catch (Sql2oException ex){
            System.out.println(ex);
        }
        return null;
    }

    @Override
    public void addEndangeredSpecies(SightingEndangeredSpecies sightingEndangeredSpecies) {

    }
}
