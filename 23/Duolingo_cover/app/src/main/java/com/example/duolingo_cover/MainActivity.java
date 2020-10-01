package com.example.duolingo_cover;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button;
    TextView txtw;
    TextView message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        txtw = findViewById(R.id.textview);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String str = txtw.getText().toString();
                if(str.isEmpty()==false){
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    if(str.equals("hot")){
                        builder.setMessage("Congratulation! That's a correct answer");
                    }else{
                        builder.setMessage("Wrong answer :((");
                    }
                    builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int i) {
                            startActivity(new Intent(MainActivity.this, MainActivity2.class));
                        }
                    });
                    builder.show();
                }
            }
        });
    }
}