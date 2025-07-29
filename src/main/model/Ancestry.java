package main.model;

// 
public class Ancestry {
    String name;
    String ttrpg;

    public Ancestry(String name, String ttrpg) {
        this.name = name;
        this.ttrpg = ttrpg;
    }

    public String getTtrpg(){
        return this.ttrpg;
    }
    public String getName(){
        return this.name;
    }


}
