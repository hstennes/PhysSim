package com.physsim.main;

import java.awt.Point;

public class AABB extends PhysicsObject {

    private Point min;
    private Point max;

    public AABB(Point min, Point max) {
        this.min = min;
        this.max = max;
    }

    public boolean intersectsWith(AABB a) {
        // Exit with no intersection if found separated along an axis
        if (a.max.x < this.min.x || a.min.x > this.max.x) return false;
        if (a.max.y < this.min.y || a.min.y > this.max.y) return false;

        // No separating axis found, therefore there is at least one overlapping axis
        return true;
    }


    @Override
    public void tick() {

    }

}
