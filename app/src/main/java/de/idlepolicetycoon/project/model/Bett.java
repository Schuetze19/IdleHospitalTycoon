package de.idlepolicetycoon.project.model;

/**
 * Created by Bonziller on 13.03.2018.
 */

public class Bett {

    private int image;
    private Patient patient;
    private double heilungsdauerVerkuerzung;
    private long kosten;
    private int level;

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
