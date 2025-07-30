package main.ui;

import java.util.ArrayList;
import main.model.*;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        String dnd = "Dungeons & Dragons";
        String pf = "Pathfinder";

        Ttrpg system1 = new Ttrpg(dnd, 5);
        Ttrpg system2 = new Ttrpg(dnd, 4);
        Ttrpg system3 = new Ttrpg(dnd, 3.5);
        Ttrpg system4 = new Ttrpg(dnd, 3);
        Ttrpg system5 = new Ttrpg(dnd, 2);
        Ttrpg system6 = new Ttrpg(dnd, 1);
        Ttrpg system7 = new Ttrpg(pf, 1);
        Ttrpg system8 = new Ttrpg(pf, 2);
        ArrayList<Ttrpg> systems = new ArrayList<>();
        
        systems.add(system1);
        systems.add(system2);
        systems.add(system3);
        systems.add(system4);
        systems.add(system5);
        systems.add(system6);
        systems.add(system7);
        systems.add(system8);

        Ancestry elf = new Ancestry("ELF");
        Ancestry dwarf = new Ancestry("DWARF");

        ArrayList<Ancestry> dndAncestries = new ArrayList<>();
        ArrayList<Ancestry> pathfinderAncestries = new ArrayList<>();

        dndAncestries.add(elf);
        dndAncestries.add(dwarf);

        pathfinderAncestries.add(elf);
        pathfinderAncestries.add(dwarf);
        
        Scanner scanner = new Scanner(System.in);
        String choice;
        double choiceVersion;

        String choiceAncestry;

        System.out.println("WLCOME TO TEST NPC GENERATOR");
        System.out.println("*****************************");


        System.out.println("CHOOSE WHAT SYSTEM YOU ARE USING: ");
        for (Ttrpg ttrpg : systems){
           System.out.printf("%s Version: %s\n", ttrpg.getName() , ttrpg.getVersion() );
        }
        choice = scanner.nextLine();
        for (Ttrpg ttrpg : systems){
            if (choice.equals(ttrpg.getName())) {
                System.out.printf("Which Version is the %s: ", ttrpg.getName());
                choiceVersion = scanner.nextDouble();
                scanner.nextLine();
                break;
            } 
        }

        System.out.println("THE list of ancestries for " + choice);

        switch (choice) {
            case "Dungeons & Dragons": 
            for (Ancestry ancestry: dndAncestries) {
                System.out.println(ancestry.getName());
            }
            
            case "Pathfinder": for (Ancestry ancestry: pathfinderAncestries) {
                System.out.println(ancestry.getName());
            }
        }

        System.out.print("Choose which ancestry: ");
        choiceAncestry = scanner.nextLine().toUpperCase();
        
    
        scanner.close();
    }

}