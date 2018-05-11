package com.example.roqa7hmed.design;

import android.content.Intent;
import android.graphics.Color;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;
import com.hitomi.cmlibrary.OnMenuStatusChangeListener;


public class Circle extends AppCompatActivity {

    Button B1,B2,B3,B4,B5;
    ImageButton backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);

        backButton=findViewById(R.id.backButtonLevels);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Circle.this,MainActivity.class);
                startActivity(intent);
            }
        });

//        B6 = findViewById(R.id.backButtonLevels);
//        B1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent=new Intent(Circle.this,MainActivity.class);
//                startActivity(intent);
//            }
//        });


        B1 = (Button)findViewById(R.id.level1);
        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Circle.this,MyQuestion.class);
                startActivity(intent);
            }
        });

        B2 = (Button)findViewById(R.id.level2);
        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Circle.this,MyQuestion2.class);
                startActivity(intent);
            }
        });

        B3 = (Button)findViewById(R.id.level3);
        B3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Circle.this,MyQuestion3.class);
                startActivity(intent);
            }
        });

        B4 = (Button)findViewById(R.id.level4);
        B4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Circle.this,MyQuestion4.class);
                startActivity(intent);
            }
        });

        B5 = (Button)findViewById(R.id.level5);
        B5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Circle.this,MyQuestion5.class);
                startActivity(intent);
            }
        });


    }
}


