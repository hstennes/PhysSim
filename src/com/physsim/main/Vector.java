package com.physsim.main;

public class Vector {

    public float x;
    public float y;

    public Vector(float x, float y){
        this.x = x;
        this.y = y;
    }

    public Vector add(Vector v){
        return new Vector(x + v.x, y + v.y);
    }

    public Vector subtract(Vector v){
        return new Vector(x - v.x, y - v.y);
    }

    public Vector multiply(Vector v){
        return new Vector(x * v.x, y * v.y);
    }

    public float magnitude(){
        return (float) Math.sqrt((double) (x * x + y * y));
    }

}
