package de.idlepolicetycoon.project.model;

/**
 * Created by Dennis on 12.03.2018.
 */

public class Mitarbeiter {

    private String name;
    private int image;
    private double x;
    private double y;

    public Mitarbeiter(int image){this.image = image;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
}
