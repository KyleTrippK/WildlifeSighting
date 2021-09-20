package models;

import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;
import wildlifeDao.DaoClass;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static spark.Spark.staticFileLocation;
import static spark.Spark.*;

public class App extends DaoClass{
    public static void main(String[] args) {
        staticFileLocation("/public");
        DaoClass daoClass = new DaoClass();

        get("/", (request, response) ->{
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "/index.hbs");
        }, new HandlebarsTemplateEngine());

        get("/endangered-Animals", (request, response)->{
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "/endangeredAnimals-form.hbs");
        }, new HandlebarsTemplateEngine());

        post("/endangered-species/new", (request, response) -> {
            Map<String, Object> model = new HashMap<>();

            String name = request.queryParams("name");
            String health = request.queryParams("health");
            String age = request.queryParams("age");
            String ranger = request.queryParams("ranger");
            String location = request.queryParams("location");

            model.put("name", name);
            model.put("health", health);
            model.put("age", age);
            model.put("ranger", ranger);
            model.put("location", location);

            EndangeredAnimals endangered = new EndangeredAnimals(name, health, age, ranger, location);
//            model.put("endanger", endangered);
            daoClass.add(endangered);
            return new ModelAndView(model, "endangeredAnimal-sighted.hbs");
        }, new HandlebarsTemplateEngine());

        get("/view-endangered-species", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model,"/view-endangered.hbs");
        }, new HandlebarsTemplateEngine());

        get("/animals", (request, response)->{
            Map<String, Object> model = new HashMap<>();
            return new ModelAndView(model, "/animal-form.hbs");
        }, new HandlebarsTemplateEngine());

        post("/animal-form/new", (request, response) ->{
            Map <String, Object> model = new HashMap<String, Object>();

            String name = request.queryParams("name");
            String ranger = request.queryParams("ranger");
            String location = request.queryParams("location");

            model.put("name", name);
            model.put("ranger", ranger);
            model.put("location", location);

            Animals newAnimal = new Animals(name, ranger, location);
//            model.put("newAnimal",)
            return new ModelAndView(model, "animal-sighted.hbs");
        }, new HandlebarsTemplateEngine());

        get("/view-animals", (request, response)->{
            Map<String, Object> model = new HashMap<>();

            return new ModelAndView(model, "/view-animals.hbs");
        }, new HandlebarsTemplateEngine());
    }
}
