package com.example.ussa_102;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Chronometer;

import androidx.constraintlayout.widget.ConstraintLayout;

public class harjoitusnakuma extends Activity {

    private Chronometer chronometer;
    private boolean running;
    private long pauseOffset;


    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.harjoitusnakuma);

        chronometer=findViewById(R.id.chronometer2);

    }

    public void  startChronometer(View v) {
        if (!running) {
            chronometer.setBase(SystemClock.elapsedRealtime()-pauseOffset);
            chronometer.start();
            running = true;
        }
    }

    public void  pauseChronometer(View v) {
        if (running) {
         chronometer.stop();
         pauseOffset=SystemClock.elapsedRealtime()-chronometer.getBase();
         running=false;
        }
    }
    public void  resetChronometer(View v) {
        chronometer.setBase(SystemClock.elapsedRealtime());
        pauseOffset=0;

    }
}