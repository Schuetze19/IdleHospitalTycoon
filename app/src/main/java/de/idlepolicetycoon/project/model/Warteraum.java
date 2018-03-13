package de.idlepolicetycoon.project.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Bonziller on 13.03.2018.
 */

public class Warteraum {

    private long kapazitaet;
    private List<Patient> patienten = new ArrayList<>();

    public Warteraum(long kapazitaet){
        this.kapazitaet = kapazitaet;
    }

    public long getKapazitaet() {
        return kapazitaet;
    }

    public void setKapazitaet(long kapazitaet) {
        this.kapazitaet = kapazitaet;
    }

    public List<Patient> getPatienten() {
        return patienten;
    }

    public void setPatienten(List<Patient> patienten) {
        this.patienten = patienten;
    }

    public void addPatientenZumWarteraum(Krankenwagen krankenwagen){
        int patientenAnzahl = krankenwagen.getPatienten().size() + patienten.size();
        if(patienten.size() < kapazitaet && patientenAnzahl > kapazitaet){
            long verbleibenderPlatz = kapazitaet - patienten.size();
            for (int i = 0; i < verbleibenderPlatz; i++){
                this.patienten.add(krankenwagen.getPatienten().get(i));
            }
        }else if(patientenAnzahl <= kapazitaet){
            this.patienten.addAll(krankenwagen.getPatienten());
        }
    }

}
