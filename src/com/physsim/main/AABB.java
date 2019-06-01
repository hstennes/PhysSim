package com.physsim.main;

import java.awt.Graphics;
import java.awt.geom.Point2D;

public class AABB extends PhysicsObject {

    private Point2D.Float min; //Upper left
    private Point2D.Float max; //Lower right

    public AABB(Point2D.Float min, Point2D.Float max) {
        this.min = min;
        this.max = max;
    }

    public AABB(float minX, float minY, float maxX, float maxY) {
        this.min = new Point2D.Float(minX, minY);
        this.max = new Point2D.Float(maxX, maxY);
    }


    public boolean intersects(PhysicsObject object) {
        if (object instanceof AABB) {
            AABB aabb = (AABB) object;
            //Exit with no intersection if found separated along an axis
            if (aabb.max.x < min.x || aabb.min.x > max.x) return false;
            if (aabb.max.y < min.y || aabb.min.y > max.y) return false;
        }

        //No separating axis found, therefore there is at least one overlapping axis
        return true;
    }

    public Point2D.Float getMin() {
        return min;
    }

    public Point2D.Float getMax() {
        return max;
    }

    @Override
    public void tick() {

    }
  
    public void render(Graphics g) {
        g.drawRect((int) min.x, (int) min.y, (int) (max.x - min.x), (int) (max.y - min.y));

    }

}
