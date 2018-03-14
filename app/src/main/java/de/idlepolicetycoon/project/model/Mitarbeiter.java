package de.idlepolicetycoon.project.model;

/**
 * Created by Dennis on 12.03.2018.
 */

public class Mitarbeiter extends Grundelemente{

    private String name;
    private int image;

    public Mitarbeiter(){}

    public Mitarbeiter(double x, double y, int image, long upgradekosten,int level){
        this.image = image;
        setX(x);
        setY(y);
        setUpgradekosten(upgradekosten);
        setLevel(level);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
