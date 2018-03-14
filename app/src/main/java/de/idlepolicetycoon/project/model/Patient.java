package de.idlepolicetycoon.project.model;

import android.support.annotation.NonNull;

/**
 * Created by Bonziller on 13.03.2018.
 */

public class Patient extends Mitarbeiter{

    private double behandlungsdauer;

    public Patient(@NonNull String name, double behandlungsdauer){
        super();
        setName(name);
        this.behandlungsdauer = behandlungsdauer;
    }

    public double getBehandlungsdauer() {
        return behandlungsdauer;
    }

    public void setBehandlungsdauer(double behandlungsdauer) {
        this.behandlungsdauer = behandlungsdauer;
    }
}
