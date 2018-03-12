package de.idlepolicetycoon.project.model;

import android.support.annotation.NonNull;

/**
 * Created by Bonziller on 12.03.2018.
 */

public class Arbeitsplatz {

    private Mitarbeiter mitarbeiter;
    private long kosten;
    private int arbeitsgeschwindigkeit;
    private int image;

    public Arbeitsplatz(@NonNull Mitarbeiter mitarbeiter, int image){
        this.mitarbeiter = mitarbeiter;
        this.image = image;
    }

    public Mitarbeiter getMitarbeiter() {
        return mitarbeiter;
    }

    public long getKosten() {
        return kosten;
    }

    public void setKosten(long kosten) {
        this.kosten = kosten;
    }

    public int getArbeitsgeschwindigkeit() {
        return arbeitsgeschwindigkeit;
    }

    public void setArbeitsgeschwindigkeit(int arbeitsgeschwindigkeit) {
        this.arbeitsgeschwindigkeit = arbeitsgeschwindigkeit;
    }

    public int getImage() {
        return image;
    }
}
