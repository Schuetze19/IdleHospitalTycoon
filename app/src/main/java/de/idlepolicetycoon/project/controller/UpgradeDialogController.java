package de.idlepolicetycoon.project.controller;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.dennis.idlepolicetycoon.R;

import de.idlepolicetycoon.project.view.KrankenwagenUpgradeFragment;

/**
 * Created by Dennis on 13.03.2018.
 */

public class UpgradeDialogController{

    private Button upgradeButtonKrankenwagen;

    private FragmentController fragmentController = new FragmentController();

    public UpgradeDialogController(View view){

        upgradeButtonKrankenwagen = (Button) view.findViewById(R.id.upgradeButtonKrankenwagen);

        upgradeButtonKrankenwagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                KrankenwagenUpgradeFragment test = new KrankenwagenUpgradeFragment();
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
                fragmentController.showFragmentAufView(R.id.constraintLayoutMain, test, "krankenwagenFragment");

                //btn_close.setOnClickListener(new View.OnClickListener() {
                 //   @Override
                 //   public void onClick(View view) {
                  //      closeFragment(test);
                 //   }
                //});
            }
        });
    }
}
