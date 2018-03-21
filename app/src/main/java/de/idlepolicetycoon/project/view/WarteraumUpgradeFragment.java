package de.idlepolicetycoon.project.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.dennis.idlepolicetycoon.R;

import de.idlepolicetycoon.project.controller.FragmentController;


public class WarteraumUpgradeFragment extends Fragment {

    private Button closeWarteraumUpgrade;
    private WarteraumUpgradeFragment warteraumUpgradeFragment;
    private FragmentController fragmentController = new FragmentController();

    public WarteraumUpgradeFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_warteraum_upgrade, container, false);

       closeWarteraumUpgrade = view.findViewById(R.id.btn_close_warteraumUpgrade);
       warteraumUpgradeFragment = this;

       closeWarteraumUpgrade.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
                fragmentController.closeFragment(warteraumUpgradeFragment);
           }
       });

       return view;
    }


}
