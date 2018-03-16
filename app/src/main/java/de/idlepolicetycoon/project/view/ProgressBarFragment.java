package de.idlepolicetycoon.project.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;

import com.example.dennis.idlepolicetycoon.R;

import java.util.concurrent.Callable;

import de.idlepolicetycoon.project.controller.ProgressBarController;

/**
 * Created by Bonziller on 15.03.2018.
 */

public class ProgressBarFragment extends android.support.v4.app.Fragment {

    public ProgressBarFragment(){}

    public final static String dauerInMillisKey = "Millis";
    private int dauerInMillis;
    private View view;
    private ProgressBar progressBar;
    private Callable<Void> executeOnFinish;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_progressbar, container, false);
        progressBar = view.findViewById(R.id.progressbar);

        if (savedInstanceState != null) {
            dauerInMillis = savedInstanceState.getInt(dauerInMillisKey);
        }
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        Bundle args = getArguments();
        if(args != null){
            new ProgressBarController(progressBar).startProgress(args.getInt(dauerInMillisKey),executeOnFinish);
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(dauerInMillisKey, dauerInMillis);
    }

    public void setOnProgressFinishedCallable(Callable<Void> onFinish){
        executeOnFinish = onFinish;
    }

}
