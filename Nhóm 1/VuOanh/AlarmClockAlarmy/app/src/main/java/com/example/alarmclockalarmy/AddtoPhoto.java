package com.example.alarmclockalarmy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddtoPhoto extends AppCompatActivity {
     Button btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addto_photo);
        btnBack = (Button)findViewById(R.id.button6);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Back = new Intent(AddtoPhoto.this, MainActivity.class);
                startActivity(Back);
            }
        });
    }
}