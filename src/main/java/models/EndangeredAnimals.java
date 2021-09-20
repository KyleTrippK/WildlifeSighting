package models;

public class EndangeredAnimals extends Wildlife{
    private String health;
    private String age;

    private int id;
    public EndangeredAnimals(String name, String health, String age, String ranger, String location){
        this.name = name;
//        this.id = id;
        this.health = health;
        this.age = age;
        this.ranger = ranger;
        this.location = location;
    }
    public String getEndangeredName(){
        return name;
    }
    public int setId(int id){
        return id;
    }
    public String getHealth(){
        return health;
    }
    public String getAge(){
        return age;
    }
    public String getRanger(){
        return ranger;
    }
    public String getLocation(){
        return location;
    }
}
