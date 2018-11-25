package com.guessme.guessme.Science;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.guessme.guessme.Math.Matchact;
import com.guessme.guessme.Math.MathDifficulty;
import com.guessme.guessme.R;

public class Scienceact extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scienceact);
        btn = (Button) findViewById(R.id.Procsci);
        buttons();
    }

    private void buttons(){


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),ScienceDifficulty.class);
                startActivity(i);
                Scienceact.this.finish();
            }
        });


    }}