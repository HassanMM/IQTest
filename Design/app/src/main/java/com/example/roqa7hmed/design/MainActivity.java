package com.example.roqa7hmed.design;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button PlayGame,Help,Exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

   /*     final MediaPlayer media = MediaPlayer.create(this, R.raw.music);
        media.setLooping(true);
      //  media.start();
        Button PlayGame = findViewById(R.id.Play);
        PlayGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Quiz();
                Intent intent = new Intent(MainActivity.this, MyQuestion.class);
                startActivity(intent);
            }
        });
*/


    /* final ImageView mute = (ImageView) findViewById(R.id.mute);
     mute.setOnClickListener(new View.OnClickListener() {

         public void onClick(View v) {
             media.stop();
         }
     });*/

        PlayGame=findViewById(R.id.Play);
        PlayGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startQuiz();
            }
        });

        Help=findViewById(R.id.Help);
        Help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Myhelp.class);
                startActivity(intent);
            }
        });

        Exit=findViewById(R.id.Exit);
        Exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
    }

    private void startQuiz(){
        Intent intent=new Intent(MainActivity.this,Circle.class);
        startActivity(intent);
    }



}
