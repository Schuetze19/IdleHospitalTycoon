package de.idlepolicetycoon.project.model;

/**
 * Created by Bonziller on 13.03.2018.
 */

public class Pfleger extends Mitarbeiter {

    public Pfleger(int image,double x, double y, long kosten) {
        super(image);
        setX(x);
        setY(y);
        setKosten(kosten);
    }

}
