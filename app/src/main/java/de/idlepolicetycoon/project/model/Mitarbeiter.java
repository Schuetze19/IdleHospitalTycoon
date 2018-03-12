package de.idlepolicetycoon.project.model;

/**
 * Created by Dennis on 12.03.2018.
 */

public class Mitarbeiter {

    private String name;
    private int arbeitsgeschwindigkeit;
    private String image;
    private double x;
    private double y;

    public Mitarbeiter(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getArbeitsgeschwindigkeit() {
        return arbeitsgeschwindigkeit;
    }

    public void setArbeitsgeschwindigkeit(int arbeitsgeschwindigkeit) {
        this.arbeitsgeschwindigkeit = arbeitsgeschwindigkeit;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
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
