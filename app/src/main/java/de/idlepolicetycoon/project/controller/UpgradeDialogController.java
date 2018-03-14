package de.idlepolicetycoon.project.controller;

import android.app.FragmentTransaction;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.dennis.idlepolicetycoon.R;

import java.util.logging.Logger;

import de.idlepolicetycoon.project.view.KrankenwagenUpgradeFragment;

/**
 * Created by Dennis on 13.03.2018.
 */

public class UpgradeDialogController{

    private Button upgradeButtonKrankenwagen;
    AppCompatActivity appCompatActivity;


    public UpgradeDialogController(View view, AppCompatActivity appCompatActivity){
        this.appCompatActivity = appCompatActivity;

        upgradeButtonKrankenwagen = (Button) view.findViewById(R.id.upgradeButtonKrankenwagen);

        upgradeButtonKrankenwagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                appCompatActivity.getSupportFragmentManager().beginTransaction().replace(R.id.constraintLayoutMain, new KrankenwagenUpgradeFragment()).commit();
            }
        });
    }
}
