package de.idlepolicetycoon.project.view;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
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
    public final static String positionXKey = "positionx";
    public final static String positionYKey = "positionx";
    public final static String progressbarWidthKey = "progressWidth";
    public final static String progressbarHeightKey = "progressHeight";

    private float x;
    private float y;
    private int width;
    private int height;
    private int dauerInMillis;
    private View view;
    private ProgressBar progressBar;
    private Callable<Void> executeOnFinish;
    private ConstraintLayout constraintLayout;
    private Runnable inProgress;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_progressbar, container, false);
        progressBar = view.findViewById(R.id.progressbar);
        constraintLayout = view.findViewById(R.id.constraintLayoutProgressbar);

        if (savedInstanceState != null) {
            dauerInMillis = savedInstanceState.getInt(dauerInMillisKey);
            x = savedInstanceState.getFloat(positionXKey);
            y = savedInstanceState.getFloat(positionYKey);
            width = savedInstanceState.getInt(progressbarWidthKey);
            height = savedInstanceState.getInt(progressbarHeightKey);
        }
        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        Bundle args = getArguments();
        if(args != null){
            if(constraintLayout != null){
                constraintLayout.setX(x);
                constraintLayout.setY(y);
                if(width > 0) {
                    constraintLayout.setMinWidth(width);
                    constraintLayout.setMaxWidth(width);
                }
                if(height > 0) {
                    constraintLayout.setMinHeight(height);
                    constraintLayout.setMaxHeight(height);
                }
            }
            new ProgressBarController(progressBar).startProgress(args.getInt(dauerInMillisKey),executeOnFinish,inProgress);
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(dauerInMillisKey, dauerInMillis);
        outState.putFloat(positionXKey, x);
        outState.putFloat(positionYKey, y);
        outState.putInt(progressbarWidthKey, width);
        outState.putInt(progressbarHeightKey, height);
    }

    public void setOnProgressFinishedCallable(Callable<Void> onFinish){
        executeOnFinish = onFinish;
    }

    public void setInProgressRunnable(Runnable inProgress){
        this.inProgress = inProgress;
    }

}
