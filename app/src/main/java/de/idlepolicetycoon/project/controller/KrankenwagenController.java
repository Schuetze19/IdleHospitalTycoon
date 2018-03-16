package de.idlepolicetycoon.project.controller;

import java.util.ArrayList;
import java.util.List;

import de.idlepolicetycoon.project.model.Krankenwagen;
import de.idlepolicetycoon.project.model.Patient;

/**
 * Created by Bonziller on 16.03.2018.
 */

public class KrankenwagenController {

    private List<Patient> patienten = new ArrayList<>();
    private Krankenwagen krankenwagen;

    public KrankenwagenController(){
        createPatienten(10);
        krankenwagen = new Krankenwagen(1,1,patienten,1.0,10);
        // Initialisiere Fragment (Fahrstrecke Fragment)
        // Setzte die Argumente des Fragments (Fragment.setArguments(Fragment.patientenAnzahlKey,patienten.size()))
        // Zeige das Fragment an (KrankenwagenFragment)
        // Lege dir einen Punkt fest, auf dem der Wagen 24/7 langfährt. Dies MUSS im Hintergrund passieren. z.B.: (Thread(Runnable({LOGIK für bewegung einbauen!})).start();
        // Im Hintergrund Thread sollte die Abfrage drin sein "Bin ich am Punkt Y angekommen? (Warteraum Eingang)", wenn Ja, dann Initialisiere das ProgressBarFragment und zeige es an.
    }

    public List<Patient> getPatienten(){
        return patienten;
    }

    private void createPatienten(int anzahl){
        this.patienten.clear();
        for (int i = 0; i < anzahl; i++){
            patienten.add(new Patient("Bob",5));
        }
    }

}
