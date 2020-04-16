package com.example.ussa_102;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.EditText;
import android.widget.ScrollView;

import androidx.constraintlayout.widget.ConstraintLayout;

public class harjoitusnakuma extends Activity {

    private Chronometer chronometer;
    private boolean running;
    private long pauseOffset;
    private EditText meditText3_StopWatchLapCount;
    private Button mBtnStopWatchLap;
    private ScrollView mtimerLaps;

    private int Laps=0;


    @Override
    protected void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.harjoitusnakuma);

        chronometer=findViewById(R.id.chronometer2);
        meditText3_StopWatchLapCount= (EditText) findViewById(R.id.editText3_StopWatchLapCount);
        mBtnStopWatchLap= (Button) findViewById(R.id.buttonStopWatchLap);
        mtimerLaps=(ScrollView) findViewById(R.id.timerLaps);

        meditText3_StopWatchLapCount.setEnabled(false);

        mBtnStopWatchLap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ++Laps;

                if(chronometer==null) {
                    return;
                }

                meditText3_StopWatchLapCount.append("Lap " + String.valueOf(Laps) +" | "
                        + String.valueOf(chronometer.getText())
                        + " " +"\n");

                mtimerLaps.post(new Runnable() {
                    @Override
                    public void run() {
                        mtimerLaps.smoothScrollTo(0, meditText3_StopWatchLapCount.getBottom());
                    }
                });
            }
        });

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
        meditText3_StopWatchLapCount.setText("");
        Laps=1;
        chronometer.stop();

    }

}