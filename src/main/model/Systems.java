package main.model;

import java.util.ArrayList;

import main.model.npc.System;

public class Systems {
    private ArrayList<System> systems;

    public Systems() {
        systems = new ArrayList<>();
    }

    public ArrayList<System> getSystems() {
        return systems;
    }

    public void setSystems(ArrayList<System> systems) {
        this.systems = systems;
    }

}
