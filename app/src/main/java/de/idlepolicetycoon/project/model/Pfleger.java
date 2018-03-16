package de.idlepolicetycoon.project.model;

/**
 * Created by Bonziller on 13.03.2018.
 */

public class Pfleger extends Mitarbeiter {

    private double geschwindigkeit;
    private double aufnahmeGeschwindigkeit;

    public Pfleger(int image,float x, float y, long upgradekosten, int level) {
        super(x, y, image, upgradekosten, level);
    }

    public double getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(double geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    public double getAufnahmeGeschwindigkeit() {
        return aufnahmeGeschwindigkeit;
    }

    public void setAufnahmeGeschwindigkeit(double aufnahmeGeschwindigkeit) {
        this.aufnahmeGeschwindigkeit = aufnahmeGeschwindigkeit;
    }
}
