package com.physsim.main;

import java.util.ArrayList;

public class Handler {

    private ArrayList<PhysicsObject> physObjects;

    public Handler(){
        physObjects = new ArrayList<>();
    }

    public void tick(){
        for(PhysicsObject object : physObjects) object.tick();
    }

    public void addObject(PhysicsObject object){
        physObjects.add(object);
    }

    public PhysicsObject getPhysicsObject(int index){
        return physObjects.get(index);
    }
}
