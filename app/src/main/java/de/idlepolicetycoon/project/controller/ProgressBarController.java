package de.idlepolicetycoon.project.controller;

import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ProgressBar;

import java.util.concurrent.Callable;

/**
 * Created by Bonziller on 15.03.2018.
 */

public class ProgressBarController{

    private View view;
    private ProgressBar progressBar;

    public ProgressBarController(@NonNull ProgressBar progressBar){
        this.progressBar = progressBar;
    }

    public ProgressBarController(@NonNull ProgressBar progressBar, @NonNull View view){
        this.progressBar = progressBar;
        this.view = view;
    }

    public void startProgress(final int dauerInMillis, Callable<Void> onFinish){
        new Thread(new Runnable() {
            @Override
            public void run() {
                progressBar.setMax(dauerInMillis);
                final int progress = dauerInMillis / 50;
                int g = 0;
                while(g+progress < dauerInMillis){
                    g+= progress;
                    progressBar.setProgress(g);
                    try {
                        Thread.sleep(progress);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                progressBar.setProgress(progressBar.getMax());
                if(onFinish != null) {
                    try {
                        onFinish.call();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}
