package de.idlepolicetycoon.project.model;

/**
 * Created by Dennis on 12.03.2018.
 */

public class Mitarbeiter {

    private String name;
    private int image;
    private double x;
    private double y;
    private long kosten;
    private int level;

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

    public long getKosten() {
        return kosten;
    }

    public void setKosten(long kosten) {
        this.kosten = kosten;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
