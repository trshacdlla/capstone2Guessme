package com.guessme.guessme.Tech;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.guessme.guessme.Difficulty;
import com.guessme.guessme.English.Englishact;
import com.guessme.guessme.R;

public class Techact extends AppCompatActivity {
Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_techact);
        btn = (Button) findViewById(R.id.Protech);
        buttons();
    }

    private void buttons(){


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),TechDifficulty.class);
                startActivity(i);
                Techact.this.finish();
            }
        });
}}
