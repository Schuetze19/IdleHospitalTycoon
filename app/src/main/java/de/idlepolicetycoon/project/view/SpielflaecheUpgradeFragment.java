package de.idlepolicetycoon.project.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.dennis.idlepolicetycoon.R;

import de.idlepolicetycoon.project.controller.FragmentController;

public class SpielflaecheUpgradeFragment extends Fragment {

    private Button closeSpielflaecheUpgrade;
    private FragmentController fragmentController = new FragmentController();
    private SpielflaecheUpgradeFragment spielflaecheUpgradeFragment;

    public SpielflaecheUpgradeFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_spielflaeche_upgrade, container, false);

        closeSpielflaecheUpgrade = view.findViewById(R.id.btn_close_spielflaecheUpgrade);
        spielflaecheUpgradeFragment = this;

        closeSpielflaecheUpgrade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fragmentController.closeFragment(spielflaecheUpgradeFragment);
            }
        });
        return view;
    }
}
