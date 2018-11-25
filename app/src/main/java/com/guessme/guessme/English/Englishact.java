package com.guessme.guessme.English;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import com.guessme.guessme.Difficulty;
import com.guessme.guessme.R;

public class Englishact extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_englishact);
        btn = (Button) findViewById(R.id.Proceng);
        buttons();
    }

    private void buttons(){


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), EnglishDifficulty.class);
//               
                startActivity(i);
                Englishact.this.finish();

            }
        });


    }

}
