package de.idlepolicetycoon.project.model;

import android.support.annotation.NonNull;

/**
 * Created by Bonziller on 13.03.2018.
 */

public class Patient {

    private String name;
    private double behandlungsdauer;
    private int level;

    public Patient(@NonNull String name, double behandlungsdauer){
        this.name = name;
        this.behandlungsdauer = behandlungsdauer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBehandlungsdauer() {
        return behandlungsdauer;
    }

    public void setBehandlungsdauer(double behandlungsdauer) {
        this.behandlungsdauer = behandlungsdauer;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
