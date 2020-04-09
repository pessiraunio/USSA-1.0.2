package com.example.ussa_102;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button buttonkraafi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        buttonkraafi=findViewById(R.id.button2);
        buttonkraafi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openKraafi();
            }
        });
    }

    public void openKraafi() {
        Intent intent =new Intent(this, kraafi.class);
        startActivity(intent);
    }

}
