package main.model.npc;

public class System {
    
    private String name;
    private double version;
    
    public System(String name, double version) {
        setName(name);
        setVersion(version);
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
