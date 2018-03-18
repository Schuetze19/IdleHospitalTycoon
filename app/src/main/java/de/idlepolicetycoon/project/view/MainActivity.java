package de.idlepolicetycoon.project.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;

import com.example.dennis.idlepolicetycoon.R;
import com.squareup.picasso.Picasso;

import de.idlepolicetycoon.project.controller.UpgradeDialogController;

public class MainActivity extends AppCompatActivity {

    UpgradeDialogController upgradeDialogController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Set fullscreen
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        // Set No Title
        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        final View view = this.getWindow().getDecorView();
        upgradeDialogController = new UpgradeDialogController(view, this);
        loadBackgroundImage(view,R.id.fahrstrecke_background,R.drawable.strassebsp);
        loadBackgroundImage(view,R.id.warteraum_background,R.drawable.warteraum);
        loadBackgroundImage(view,R.id.spielflaeche_background,R.drawable.hospital);
    }

    private void loadBackgroundImage(View view, int viewElementId, int drawable){
        ImageView imageView = view.findViewById(viewElementId);
        Picasso.get().load(drawable).into(imageView);
    }

}
