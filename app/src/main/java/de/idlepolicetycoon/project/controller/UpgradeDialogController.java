package de.idlepolicetycoon.project.controller;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.dennis.idlepolicetycoon.R;

import java.util.logging.Logger;

import de.idlepolicetycoon.project.view.KrankenwagenUpgradeFragment;
import de.idlepolicetycoon.project.view.SpielflaecheFragment;
import de.idlepolicetycoon.project.view.SpielflaecheUpgradeFragment;
import de.idlepolicetycoon.project.view.WarteraumFragment;
import de.idlepolicetycoon.project.view.WarteraumUpgradeFragment;

/**
 * Created by Dennis on 13.03.2018.
 */

public class UpgradeDialogController{

    private Button upgradeButtonKrankenwagen;
    private Button upgradeButtonWarteraum;
    private Button upgradeButtonSpielflaeche;

    private FragmentController fragmentController = new FragmentController();

    public UpgradeDialogController(View view){

        upgradeButtonKrankenwagen = (Button) view.findViewById(R.id.upgradeButtonKrankenwagen);
        upgradeButtonWarteraum = (Button) view.findViewById(R.id.upgradeButtonWarteraum);
        upgradeButtonSpielflaeche = (Button) view.findViewById(R.id.upgradeButtonSpielflaeche);

        upgradeButtonKrankenwagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                KrankenwagenUpgradeFragment krankenwagenFragment = new KrankenwagenUpgradeFragment();
                createFragmentAndShowFragment(krankenwagenFragment, "upgradeKrankenwagenFragment");
            }
        });

        upgradeButtonWarteraum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                WarteraumUpgradeFragment warteraumFragment = new WarteraumUpgradeFragment();
                createFragmentAndShowFragment(warteraumFragment, "upgradeWarteraumFragment");
            }
        });

        upgradeButtonSpielflaeche.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SpielflaecheUpgradeFragment spielflaecheFragment = new SpielflaecheUpgradeFragment();
                createFragmentAndShowFragment(spielflaecheFragment, "upgradeSpielflaecheFragment");
            }
        });
    }

    private void createFragmentAndShowFragment(Fragment createFragment, String fragmentTag){
        fragmentController.showFragmentAufView(R.id.constraintLayoutMain, createFragment, fragmentTag);
    }

    //TODO: Wird das noch benötigt???
    private void michiFragenMethode(){
        /* //FÜR PRGORESSBAR BENÖTIGT
                Bundle bundle = new Bundle();
                bundle.putInt(ProgressBarFragment.dauerInMillisKey,2542);
                test.setArguments(bundle);
                test.setOnProgressFinishedCallable(() -> {
                    System.out.println("Progress ist fertiggestellt");
                    return null;
                });
                test.setInProgressRunnable(new Runnable() {
                    @Override
                    public void run() {
                        // INPROGRESS Aktion
                    }
                });
                test.setOnCancelRunnable(new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("PROGRESS CANCELED");
                    }
                });*/

        //btn_close.setOnClickListener(new View.OnClickListener() {
        //   @Override
        //   public void onClick(View view) {
        //      closeFragment(test);
        //   }
        //});
    }
}
