package de.idlepolicetycoon.project.model;

/**
 * Created by Bonziller on 14.03.2018.
 */

public class Grundelemente {

    private double x;
    private double y;
    private long upgradekosten;
    private int level;

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

    public long getUpgradekosten() {
        return upgradekosten;
    }

    public void setUpgradekosten(long upgradekosten) {
        this.upgradekosten = upgradekosten;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
