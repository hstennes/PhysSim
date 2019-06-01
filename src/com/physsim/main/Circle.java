package com.physsim.main;

import java.awt.*;
import java.awt.geom.Point2D;

public class Circle extends PhysicsObject {

    public Point2D.Float center;
    public float radius;

    public Circle(float x, float y, float radius){
        center = new Point2D.Float(x, y);
        this.radius = radius;
    }

    public Circle(Point2D.Float center, float radius){
        this.center = center;
        this.radius = radius;
    }

    @Override
    public void tick() {

    }

    public void render(Graphics g){
        g.drawOval((int) (center.x - radius), (int) (center.y - radius), (int) (2 * radius), (int) (2 * radius));
    }

}
