package de.idlepolicetycoon.project.model;

/**
 * Created by Bonziller on 13.03.2018.
 */

public class Arzt extends Mitarbeiter {

    public Arzt(int image, double x, double y) {
        super(image);
        setX(x);
        setY(y);
        setKosten(10);
    }

}
