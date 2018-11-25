package com.guessme.guessme.Trivia;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.guessme.guessme.MainActivity;
import com.guessme.guessme.MainMenu;
import com.guessme.guessme.R;

public class Trivia1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trivia1);

        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/fascinate.ttf");
        TextView trivia = (TextView) findViewById(R.id.trivia);
        trivia.setTypeface(custom_font);

        Button back = (Button) findViewById(R.id.Trivia1Back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
                finish();
            }
        });

    }
    public void onBackPressed() {

    }
}
