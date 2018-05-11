package com.example.roqa7hmed.design;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Myhelp extends AppCompatActivity {

    ImageButton BackArrow;
Button Start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myhelp);

        BackArrow = findViewById(R.id.backbutton);
        BackArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(Myhelp.this,MainActivity.class);
                startActivity(intent);
            }
        });

        Start = findViewById(R.id.Start);
        Start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Myhelp.this,Circle.class);
                startActivity(intent);
            }
        });
    }
}
