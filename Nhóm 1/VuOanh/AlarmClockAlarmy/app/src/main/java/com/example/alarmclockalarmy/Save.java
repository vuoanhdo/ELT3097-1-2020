package com.example.alarmclockalarmy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Save extends AppCompatActivity {
    Button btnYes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save);
        btnYes = (Button)findViewById(R.id.button4);
        btnYes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Yes = new Intent(Save.this,MainActivity.class);
                startActivity(Yes);
            }
        });
    }
}