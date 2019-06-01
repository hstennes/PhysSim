package com.physsim.main;

import java.awt.Graphics;
import java.awt.geom.Point2D;

public class AABB extends PhysicsObject {

    public Point2D.Float min; //Upper left
    public Point2D.Float max; //Lower right

    public AABB(Point2D.Float min, Point2D.Float max) {
        this.min = min;
        this.max = max;
    }

    public AABB(float minX, float minY, float maxX, float maxY) {
        this.min = new Point2D.Float(minX, minY);
        this.max = new Point2D.Float(maxX, maxY);
    }

    @Override
    public void tick() {

    }
  
    public void render(Graphics g) {
        g.drawRect((int) min.x, (int) min.y, (int) (max.x - min.x), (int) (max.y - min.y));

    }

}
