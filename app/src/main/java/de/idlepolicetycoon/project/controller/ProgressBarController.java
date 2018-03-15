package de.idlepolicetycoon.project.controller;

import android.graphics.Canvas;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.ProgressBar;

import com.example.dennis.idlepolicetycoon.R;
import com.squareup.picasso.Picasso;

import java.io.IOException;

/**
 * Created by Bonziller on 15.03.2018.
 */

public class ProgressBarController{

    private View view;
    private ProgressBar progressBar;
    private Handler handler = new Handler();

    public ProgressBarController(@NonNull ProgressBar progressBar){
        this.progressBar = progressBar;
    }
    public ProgressBarController(@NonNull ProgressBar progressBar, @NonNull View view){
        this.progressBar = progressBar;
        this.view = view;
    }

    public void startProgress(final int max, double geschwindigkeitInSekunden){
        new Thread(new Runnable() {
            @Override
            public void run() {
                progressBar.setMax(max);
                int g = 1;
                while(g < max){
                    g++;
                    progressBar.setProgress(g);
                    // TryCatch anpassen, sodass der Ladebalken zur richtigen Zeit voll ist. 1 Sekunde = 1000 Millisekunden
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

}
