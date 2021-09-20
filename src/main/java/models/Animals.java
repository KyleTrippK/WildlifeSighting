package models;

public class Animals extends Wildlife {

    public Animals(String name, String ranger, String location){
        this.name = name;
        this.ranger = ranger;
        this.location =location;
        //this.id = id;

    }
    public String getName(){
        return name;
    }
//    public int getId(){
//        return id;
//    }

    public String getLocation() {
        return location;
    }

    public String getRanger(){
        return ranger;
    }
}
