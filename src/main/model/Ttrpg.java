package main.model;

public class Ttrpg {
    String name;
    double version;
    
    public Ttrpg(String name, double version) {
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public double getVersion() {
        return version;
    }
    

}
