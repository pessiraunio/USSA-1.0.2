package com.example.ussa_102;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.nio.channels.InterruptedByTimeoutException;

public class MainActivity extends AppCompatActivity {

    private Button buttonkraafi;
    private Button buttonharjoitus;
    private Button buttonkalenteri;
    private Button buttonohjelma;
    private Button buttonomatharjoitukset;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonomatharjoitukset=findViewById(R.id.button5);
        buttonomatharjoitukset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOmatHarjoitukset();
            }
        });

        buttonohjelma=findViewById(R.id.button4);
        buttonohjelma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openOhjelmanluonti();
            }
        });

        buttonkalenteri=findViewById(R.id.button1);
        buttonkalenteri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openKalenteri();
            }
        });

        buttonkraafi=findViewById(R.id.button2);
        buttonkraafi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openKraafi();
            }
        });

        buttonharjoitus=findViewById(R.id.button3);
        buttonharjoitus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openHarjoitus();
            }
        });
    }

    public void openKraafi() {
        Intent intent =new Intent(this, kraafi.class);
        startActivity(intent);
    }

    public void openHarjoitus() {
        Intent intent =new Intent(this, harjoitusnakuma.class);
        startActivity(intent);
    }

    public void openKalenteri() {
        Intent intent =new Intent(this, kalenteri.class);
        startActivity(intent);
    }

    public void openOhjelmanluonti() {
        Intent intent=new Intent (this, ohjelman_luonti.class);
        startActivity(intent);
    }

    public void openOmatHarjoitukset() {
        Intent intent=new Intent(this, omat_harjoitukset.class);
        startActivity(intent);
    }

}
