package de.idlepolicetycoon.project.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bonziller on 13.03.2018.
 */

public class Krankenwagen {

    private List<Patient> patienten = new ArrayList<>();
    private double geschwindigkeit;
    private long kapazitaet;
    private double x,y;
    private long kosten;
    private int level;

    public Krankenwagen(List<Patient> patienten, double geschwindigkeit,long kapazitaet, double x, double y){
        this.patienten = patienten;
        this.geschwindigkeit = geschwindigkeit;
        this.kapazitaet = kapazitaet;
        this.x = x;
        this.y = y;
    }

    public List<Patient> getPatienten() {
        return patienten;
    }

    public void setPatienten(List<Patient> patienten) {
        this.patienten = patienten;
    }

    public double getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(double geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    public long getKapazitaet() {
        return kapazitaet;
    }

    public void setKapazitaet(long kapazitaet) {
        this.kapazitaet = kapazitaet;
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
