package com.physsim.main;

import java.awt.*;

public abstract class PhysicsObject {

    public float mass;

    public PhysicsObject(float mass){
        this.mass = mass;
    }

    public abstract void tick();

    public abstract void render(Graphics g);

}
