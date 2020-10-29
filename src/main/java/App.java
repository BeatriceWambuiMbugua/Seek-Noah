import DAO.*;
import models.Location;
import models.Ranger;

import static spark.Spark.*;

import org.sql2o.Sql2o;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {

        staticFileLocation("/public");
        String connectionString = "jdbc:postgresql://localhost:5432/wildlife";
        Sql2o sql2o = new Sql2o(connectionString, "moringa", "Access");
        Sql2oLocationDAO LocationDAO = new Sql2oLocationDAO(sql2o);
        Sql2oRangerDAO RangerDAO = new Sql2oRangerDAO(sql2o);
//        Sql2oSightingDAO sightingDAO = new Sql2oSightingDAO(sql2o);
        Sql2oSightingEndangeredSpeciesDAO sightingEndangeredSpeciesDAO = new Sql2oSightingEndangeredSpeciesDAO(sql2o);

        //Declare the Map<> globally to DRY the code
        Map<String, Object> model = new HashMap<>();

        //Start writing the path codes
        get("/",  (request, response) -> {
             return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

//locations code
        get("/locations", (request, response) -> {
            model.put("locations", LocationDAO.getAllLocations());
            return new ModelAndView(model, "location.hbs");
        }, new HandlebarsTemplateEngine());

        get("/addlocation", (request, response) -> {
            return new ModelAndView(model, "location-form.hbs");
        }, new HandlebarsTemplateEngine());

        //rangers code
        get("/rangers", (request, response) -> {
            model.put("rangers", RangerDAO.getAllRangers());
            return new ModelAndView(model, "rangers.hbs");
        }, new HandlebarsTemplateEngine());

        get("/addranger", (request, response) -> {
            return new ModelAndView(model, "rangers-form.hbs");
        }, new HandlebarsTemplateEngine());
    }
}
