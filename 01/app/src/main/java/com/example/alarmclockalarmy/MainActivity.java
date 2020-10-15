package com.example.alarmclockalarmy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnAddtoPhoto;
    Button btnSave;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnAddtoPhoto = (Button)findViewById(R.id.button2);
        btnAddtoPhoto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AddtoPhoto = new Intent(MainActivity.this, AddtoPhoto.class);
                startActivity(AddtoPhoto);
            }
        });
        btnSave = (Button)findViewById(R.id.button);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Save = new Intent(MainActivity.this, Save.class);
                startActivity(Save);
            }
        });
    }
}









