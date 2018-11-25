package com.guessme.guessme;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.guessme.guessme.English.EnglishStatistics1;

public class MainMenu extends AppCompatActivity {

    Button play,tnc,scores,exit;
    TextView terms;
    TextView txtplay,txtscores,txttnc,txtexit;
    String TNC;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);

        init();
        buttons();


    }

    public void init(){

        play = (Button) findViewById(R.id.btnplay);
        tnc = (Button) findViewById(R.id.btntnc);
        scores = (Button) findViewById(R.id.btnscores);
        exit = (Button) findViewById(R.id.btnexit);

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.rotate_clockwise);
        play.startAnimation(animation);
        tnc.startAnimation(animation);
        scores.startAnimation(animation);
        exit.startAnimation(animation);

        SharedPreferences mPref = PreferenceManager.getDefaultSharedPreferences(MainMenu.this);
        TNC = mPref.getString("TNC", "a");

        txtplay = (TextView) findViewById(R.id.txtPlay);
        txtscores = (TextView) findViewById(R.id.txtScores);
        txttnc = (TextView) findViewById(R.id.txtTNC);
        txtexit = (TextView) findViewById(R.id.txtExit);

        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/abc.ttf");
        txtplay.setTypeface(custom_font);
        txtscores.setTypeface(custom_font);
        txttnc.setTypeface(custom_font);
        txtexit.setTypeface(custom_font);

//        bgmusic.start();
//        bgmusic.setLooping(true);
    }

    public void buttons(){
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TNC == "a"){
                    Toast.makeText(getApplicationContext(), "Accept the terms and condition first.",Toast.LENGTH_SHORT).show();
                }else{
                    Intent i = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(i);
                    finish();
                }

            }
        });

        tnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialog();
            }
        });

        scores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Scores.class);
//                Agreement.bgmusic.stop();
                startActivity(i);
                finish();
            }
        });

        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Agreement.bgmusic.stop();
                finish();
                System.exit(0);
            }
        });
    }

    public void dialog(){
        terms = (TextView) findViewById(R.id.terms);
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainMenu.this);

        View mView = getLayoutInflater().inflate(R.layout.checkbox, null);
        alertDialog.setCancelable(false);
        // Setting Dialog Message
        alertDialog.setView(mView);

        // Setting Positive "Yes" Button
        alertDialog.setPositiveButton("Accept", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // Write your code here to invoke YES event
                SharedPreferences mPref = PreferenceManager.getDefaultSharedPreferences(MainMenu.this);
                String a = "1";
                SharedPreferences.Editor mEditor = mPref.edit();
                mEditor.putString("TNC", a);
                mEditor.commit();
                Intent i = new Intent(getApplicationContext(), MainMenu.class);
                startActivity(i);
                finish();

            }
        });

        alertDialog.setNegativeButton("Decline", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // Write your code here to invoke NO event
                //Exit the Application
                dialog.cancel();
            }
        });

        // Showing Alert Message
        alertDialog.show();
    }



    public void onBackPressed() {

    }

}
