package de.idlepolicetycoon.project.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bonziller on 13.03.2018.
 */

public class Krankenwagen extends Gegenstand{

    private List<Patient> patienten = new ArrayList<>();
    private double geschwindigkeit;
    private long kapazitaet;

    public Krankenwagen(float x, float y, List<Patient> patienten, double geschwindigkeit,long kapazitaet){
        setX(x);
        setY(y);
        setPatienten(patienten);
        this.geschwindigkeit = geschwindigkeit;
        this.kapazitaet = kapazitaet;
    }

    public List<Patient> getPatienten() {
        return patienten;
    }

    public void setPatienten(List<Patient> patienten) {
        if(patienten != null){
            if(patienten.size() <= kapazitaet) {
                this.patienten = patienten;
            }else{
                for (int i = 0; i < kapazitaet;i++){
                    this.patienten.clear();
                    this.patienten.add(patienten.get(i));
                }
            }
        }else{
            this.patienten.clear();
        }
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
}
