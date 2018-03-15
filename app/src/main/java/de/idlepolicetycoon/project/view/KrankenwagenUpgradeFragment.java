package de.idlepolicetycoon.project.view;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.dennis.idlepolicetycoon.R;

import java.util.logging.Logger;

public class KrankenwagenUpgradeFragment extends Fragment {

    public KrankenwagenUpgradeFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_krankenwagen_upgrade, container, false);
        return view;
    }
}
