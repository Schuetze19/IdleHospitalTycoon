package de.idlepolicetycoon.project.model;

/**
 * Created by Bonziller on 13.03.2018.
 */

public class Bett extends Gegenstand{

    private int image;
    private Patient patient;
    private double heilungsdauerVerkuerzung;
    private long gewinnPatient;

    public Bett(int image){
        this.image = image;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public double getHeilungsdauerVerkuerzung() {
        return heilungsdauerVerkuerzung;
    }

    public void setHeilungsdauerVerkuerzung(double heilungsdauerVerkuerzung) {
        this.heilungsdauerVerkuerzung = heilungsdauerVerkuerzung;
    }

    public long getGewinnPatient() {
        return gewinnPatient;
    }

    public void setGewinnPatient(long gewinnPatient) {
        this.gewinnPatient = gewinnPatient;
    }
}
