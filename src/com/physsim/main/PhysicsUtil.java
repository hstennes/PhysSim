package com.physsim.main;

public class PhysicsUtil {

    public static boolean intersectsCircleAABB(Circle circle, AABB aabb){
        return false;
    }

    public static boolean insersectsAABB(AABB a, AABB b){
        //Exit with no intersection if found separated along an axis
        if (a.max.x < b.min.x || a.min.x > b.max.x) return false;
        if (a.max.y < b.min.y || a.min.y > b.max.y) return false;

        //No separating axis found, therefore there is at least one overlapping axis
        return true;
    }

    public static boolean intersectsCircle(Circle a, Circle b){
        float r = a.radius + b.radius;
        r = r * r;
        return r < Math.pow(a.center.x - b.center.x, 2) + Math.pow(a.center.y - b.center.y, 2);
    }
}
