package main.model;

public class Ttrpg {
    private String name;
    private double version;
    
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
    
    public void setName(String name){
        if(name != null && !name.isEmpty()){
            this.name = name;
        }
        
    }

    public void setVersion(double version){
        this.version = version;
    }
}
