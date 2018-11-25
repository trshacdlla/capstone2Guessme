package com.guessme.guessme.English;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.guessme.guessme.MainActivity;
import com.guessme.guessme.Math.M1G1;
import com.guessme.guessme.Math.Math1;
import com.guessme.guessme.Math.MathDifficulty;
import com.guessme.guessme.R;

public class EnglishDifficulty extends AppCompatActivity {
    private Button Beginner,Intermediate,Expert, back;
    private String a,b;
    private Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_difficulty);

        init();
        buttons();
    }

    private void init(){
        Beginner = (Button) findViewById(R.id.beginner);
        Intermediate = (Button) findViewById(R.id.intermediate);
        Expert = (Button) findViewById(R.id.expert);
        back = (Button) findViewById(R.id.back);
        SharedPreferences mPref = PreferenceManager.getDefaultSharedPreferences(EnglishDifficulty.this);
        a = mPref.getString("Engl5Score", " ");
        b = mPref.getString("EnglishI5Score", " ");

        if (a == " "){

        }else{
            Intermediate.setBackgroundResource(R.drawable.btnintermediate);
        }
        if (b == " "){

        }else{
            Expert.setBackgroundResource(R.drawable.btnexpert);
        }
    }

    private void buttons(){
        Beginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), English1.class);
                startActivity(i);


            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });
        Intermediate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (a == " "){
                    Toast.makeText(getApplicationContext(), "Finish the Beginner mode first.", Toast.LENGTH_SHORT).show();
                }else{
                    i = new Intent(getApplicationContext(), EnglishI1.class);
                    startActivity(i);
                }
            }
        });

        Expert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b == " "){
                    Toast.makeText(getApplicationContext(), "Finish the Intermediate mode first.", Toast.LENGTH_SHORT).show();
                }else{
                    i = new Intent(getApplicationContext(), English1.class);
                    startActivity(i);                }
            }
        });
    }
    public void onBackPressed() {
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
        finish();
    }
}
