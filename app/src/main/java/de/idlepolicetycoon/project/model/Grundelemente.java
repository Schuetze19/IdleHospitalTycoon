package de.idlepolicetycoon.project.model;

/**
 * Created by Bonziller on 14.03.2018.
 */

public class Grundelemente {

    private float x;
    private float y;
    private long upgradekosten;
    private int level;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
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
