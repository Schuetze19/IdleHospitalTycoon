package de.idlepolicetycoon.project.controller;

import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ProgressBar;

import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by Bonziller on 15.03.2018.
 */

public class ProgressBarController{

    private View view;
    private ProgressBar progressBar;
    private AtomicBoolean cancelRequest = new AtomicBoolean(false);

    public ProgressBarController(@NonNull ProgressBar progressBar){
        this.progressBar = progressBar;
    }

    public ProgressBarController(@NonNull ProgressBar progressBar, @NonNull View view){
        this.progressBar = progressBar;
        this.view = view;
    }

    public void startProgress(final int dauerInMillis, Callable<Void> onFinish, Runnable inProgress, Runnable onCancel){
        new Thread(new Runnable() {
            @Override
            public void run() {
                progressBar.setMax(dauerInMillis);
                final int progress = dauerInMillis / 50;
                int g = 0;
                while(g+progress < dauerInMillis){
                    if(cancelRequest.get()){
                        if(onCancel != null) {
                            onCancel.run();
                            Thread.currentThread().interrupt();
                        }
                    }
                    if(inProgress != null) {
                        inProgress.run();
                    }
                    g+= progress;
                    progressBar.setProgress(g);
                    try {
                        Thread.sleep(progress);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        g = dauerInMillis;
                    }
                }
                progressBar.setProgress(progressBar.getMax());
                if(!cancelRequest.get() && onFinish != null) {
                    try {
                        onFinish.call();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

    public void cancelProgress(){
        cancelRequest.set(true);
    }
}
