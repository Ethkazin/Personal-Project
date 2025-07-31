package main.model;

import java.util.ArrayList;

public class Ancestries {
    private ArrayList<Ancestry> ancestries;

    public Ancestries(Ancestry ancestry) {
        ancestries = new ArrayList<>();
    }

    public ArrayList<Ancestry> getAncestries() {
        return this.ancestries;
    }

    public void setAncestries(ArrayList<Ancestry> ancestries) {
        this.ancestries = ancestries;
    }

    // public void addAncestry(Ancestry ancestry, Ancestries ancestries){
    // getAncestries();
    // ancestries.add(ancestry);
    // }
}
