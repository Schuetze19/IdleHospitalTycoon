package de.idlepolicetycoon.project.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

import com.example.dennis.idlepolicetycoon.R;
import com.squareup.picasso.Picasso;

import de.idlepolicetycoon.project.controller.UpgradeDialogController;

public class MainActivity extends AppCompatActivity {

    UpgradeDialogController upgradeDialogController;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        upgradeDialogController = new UpgradeDialogController(this.getWindow().getDecorView(), this);
        final View view = this.getWindow().getDecorView();
        loadBackgroundImage(view,R.id.fahrstrecke_background,R.drawable.strassebsp);
        loadBackgroundImage(view,R.id.warteraum_background,R.drawable.warteraum);
        loadBackgroundImage(view,R.id.spielflaeche_background,R.drawable.hospital);
    }

    private void loadBackgroundImage(View view, int viewElementId, int drawable){
        ImageView imageView = view.findViewById(viewElementId);
        Picasso.get().load(drawable).into(imageView);
    }

}
