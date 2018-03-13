package de.idlepolicetycoon.project.controller;

import android.view.View;
import android.widget.Button;

import com.example.dennis.idlepolicetycoon.R;

import java.util.logging.Logger;

/**
 * Created by Dennis on 13.03.2018.
 */

public class UpgradeDialogController {

    private Button upgradeButtonKrankenwagen;

    public UpgradeDialogController(View view){
        upgradeButtonKrankenwagen = (Button) view.findViewById(R.id.upgradeButtonKrankenwagen);


    }
}
