package com.guessme.guessme.Math;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.guessme.guessme.R;

public class Matchact extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_matchact);
        btn = (Button) findViewById(R.id.Procmath);
        buttons();
    }

    private void buttons(){


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),MathDifficulty.class);
                startActivity(i);
                Matchact.this.finish();
            }
        });


    }
}
