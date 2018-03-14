package de.idlepolicetycoon.project.model;

/**
 * Created by Bonziller on 13.03.2018.
 */

public class Arzt extends Mitarbeiter {

    private double geschwindigkeit;
    private double heilung;

    public Arzt(int image, double x, double y, long upgradekosten, int level) {
        super(x, y, image, upgradekosten, level);
    }

    public double getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(double geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    public double getHeilung() {
        return heilung;
    }

    public void setHeilung(double heilung) {
        this.heilung = heilung;
    }
}
