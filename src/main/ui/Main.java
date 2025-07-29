package main.ui;

import java.util.ArrayList;
import main.model.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Ancestry> ancestries = new ArrayList<>();
        Ancestry ancestry1 = new Ancestry("Elf","Dungeon Dragon 5e");
        Ancestry ancestry2 = new Ancestry("Dwarf", "Dungeon Dragon 5e");

        ancestries.add(ancestry1);
        ancestries.add(ancestry2);

        for (Ancestry ancestry : ancestries){
            System.out.println(ancestry.getName());
        }
        


    }

}
