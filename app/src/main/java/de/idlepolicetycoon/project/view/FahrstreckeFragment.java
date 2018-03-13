package de.idlepolicetycoon.project.view;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.dennis.idlepolicetycoon.R;

public class FahrstreckeFragment extends Fragment {

    public FahrstreckeFragment() {}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_fahrstrecke, container, false);
    }
}
