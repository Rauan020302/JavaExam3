package com.company;

public class Backpack {
    private Circle circle;
    private Cylinder cylinder;
    private Flat flat;

    public Backpack(Circle circle, Cylinder cylinder, Flat flat) {
        this.circle = circle;
        this.cylinder = cylinder;
        this.flat = flat;
    }
    public Backpack(){}

    public Circle getCircle() {
        return circle;
    }

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    public Cylinder getCylinder() {
        return cylinder;
    }

    public void setCylinder(Cylinder cylinder) {
        this.cylinder = cylinder;
    }

    public Flat getFlat() {
        return flat;
    }

    public void setFlat(Flat flat) {
        this.flat = flat;
    }
}
