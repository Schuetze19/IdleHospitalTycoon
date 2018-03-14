package de.idlepolicetycoon.project.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.dennis.idlepolicetycoon.R;

import de.idlepolicetycoon.project.controller.UpgradeDialogController;

public class MainActivity extends AppCompatActivity {

    UpgradeDialogController upgradeDialogController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        upgradeDialogController = new UpgradeDialogController(this.getWindow().getDecorView(), this);
    }
}
