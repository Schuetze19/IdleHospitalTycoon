package de.idlepolicetycoon.project.controller;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.example.dennis.idlepolicetycoon.R;

import java.util.concurrent.Callable;
import java.util.logging.Logger;

import de.idlepolicetycoon.project.view.KrankenwagenUpgradeFragment;
import de.idlepolicetycoon.project.view.ProgressBarFragment;

/**
 * Created by Dennis on 13.03.2018.
 */

public class UpgradeDialogController{

    private Button upgradeButtonKrankenwagen;
    private Button btn_close;
    AppCompatActivity appCompatActivity;
    private KrankenwagenUpgradeFragment test;

    public UpgradeDialogController(View view, AppCompatActivity appCompatActivity){
        this.appCompatActivity = appCompatActivity;

        upgradeButtonKrankenwagen = (Button) view.findViewById(R.id.upgradeButtonKrankenwagen);

        upgradeButtonKrankenwagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                test = new KrankenwagenUpgradeFragment();

                /* //FÜR PRGORESSBAR BENÖTIGT
                Bundle bundle = new Bundle();
                bundle.putInt(ProgressBarFragment.dauerInMillisKey,1453);
                test.setArguments(bundle);
                test.setOnProgressFinishedCallable(() -> {
                    System.out.println("Progress ist fertiggestellt");
                    return null;
                });*/
                showFragmentAufView(R.id.constraintLayoutMain, test);

                btn_close = (Button) view.findViewById(R.id.btn_close);

                //btn_close.setOnClickListener(new View.OnClickListener() {
                 //   @Override
                 //   public void onClick(View view) {
                  //      closeFragment(test);
                 //   }
                //});
            }
        });
    }

    public void showFragmentAufView(int containerViewID, Fragment fragment){
        appCompatActivity.getSupportFragmentManager().beginTransaction().replace(containerViewID, fragment).commit();
    }

    public void closeFragment(Fragment fragment){
        appCompatActivity.getSupportFragmentManager().beginTransaction().remove(fragment).commit();
    }
}
