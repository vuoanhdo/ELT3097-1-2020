package com.example.duolingo_cover;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Choose_Correct extends AppCompatActivity {
    Button btn_check;
    Button btn_opt1;
    Button btn_opt2;
    Button btn_opt3;
    int choose=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.xml_choose_corect);

        btn_check =  findViewById(R.id.Check);
        btn_check.setEnabled(false);

        btn_opt1 = findViewById(R.id.option1);
        btn_opt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetBtn(btn_opt1,btn_opt2,btn_opt3);
                choose=1;
            }
        });
        btn_opt2 = findViewById(R.id.option2);
        btn_opt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetBtn(btn_opt2,btn_opt1,btn_opt3);
                choose=2;
            }
        });
        btn_opt3 = findViewById(R.id.option3);
        btn_opt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SetBtn(btn_opt3,btn_opt2,btn_opt1);
                choose=3;
            }
        });
        btn_check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(Choose_Correct.this);
                if(choose==3){
                    builder.setMessage("Congratulation! That's a correct answer");
                }else{
                    builder.setMessage("Wrong answer :((");
                }

                builder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int i) {
                        startActivity(new Intent(Choose_Correct.this, Them_or_they.class));
                    }
                });
                builder.show();
            }
        });
    }

    protected void SetBtn(Button change, Button otr1, Button otr2) {
        change.setBackgroundColor(Color.parseColor("#92ebff"));
        otr1.setBackgroundColor(Color.parseColor("white"));
        otr2.setBackgroundColor(Color.parseColor("white"));
        btn_check.setEnabled(true);
        btn_check.setBackgroundColor(Color.parseColor("#31cb06"));
    }
}