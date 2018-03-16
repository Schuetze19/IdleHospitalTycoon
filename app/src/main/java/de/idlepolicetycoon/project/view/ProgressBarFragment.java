package de.idlepolicetycoon.project.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.example.dennis.idlepolicetycoon.R;

import de.idlepolicetycoon.project.controller.ProgressBarController;

/**
 * Created by Bonziller on 15.03.2018.
 */

public class ProgressBarFragment extends android.support.v4.app.Fragment {

    public ProgressBarFragment(){}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_progressbar, container, false);
        ProgressBar progressBar = view.findViewById(R.id.progressbar);

        // dort, wo man das Fragment rein lädt (zum commit), muss man vorher "setArguments()" machen.
        new ProgressBarController(progressBar,view).startProgress(2018);
        return view;
    }

}
