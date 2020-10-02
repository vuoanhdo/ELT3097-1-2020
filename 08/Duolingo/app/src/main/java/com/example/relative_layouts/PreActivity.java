package com.example.npbi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PreActivity extends AppCompatActivity {

    Button confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pre);

        confirm = (Button) findViewById(R.id.Confirm);
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PreActivity.this, com.example.npbi.MainAcitivity.class);
                startActivity(intent);
            }

        });
    }
}