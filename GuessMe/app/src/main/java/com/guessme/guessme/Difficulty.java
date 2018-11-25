package com.guessme.guessme;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.guessme.guessme.English.English1;
import com.guessme.guessme.Math.Math1;
import com.guessme.guessme.Science.Science1;
import com.guessme.guessme.Science.ScienceB1;
import com.guessme.guessme.Tech.Tech1;

public class Difficulty extends AppCompatActivity {

    Button beginner,intermediate,expert;
    String subject;
    String s1,s2,s3,e1,e2,e3,m1,m2,m3,t1,t2,t3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_difficulty);

        shared();


        beginner = (Button) findViewById(R.id.beginner);
        intermediate = (Button) findViewById(R.id.intermediate);
        expert = (Button) findViewById(R.id.expert);
        final TextView asd = (TextView) findViewById(R.id.qwe);
        asd.setText(getIntent().getStringExtra("subject"));
//        subject = getIntent().getStringExtra("subject");

        difficulty();

        beginner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (asd.getText().toString().equals("Engl")){
                    Intent i = new Intent(getApplicationContext(), English1.class);
                    startActivity(i);
                    finish();
                }
                else if (asd.getText().toString().equals("Math")){
                    Intent i = new Intent(getApplicationContext(), Math1.class);
                    startActivity(i);
                    finish();
                }
                else if (asd.getText().toString().equals("Tech")){
                    Intent i = new Intent(getApplicationContext(), Tech1.class);
                    startActivity(i);
                    finish();
                }
                else if (asd.getText().toString().equals("Science")){
                    Intent i = new Intent(getApplicationContext(), ScienceB1.class);
                    startActivity(i);
                    finish();
                }
                else{

                }

            }
        });
        intermediate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (asd.getText().toString().equals("Engl")){
                    if (e1 == " "){
                        Toast.makeText(getApplicationContext(), "Finish the Beginner mode first.", Toast.LENGTH_SHORT).show();
                    }else{
                        Intent i = new Intent(getApplicationContext(), English1.class);
                        startActivity(i);
                        finish();
                    }
                }
                else if (asd.getText().toString().equals("Math")){
                    if (m1 == " "){

                    }else{
                        Intent i = new Intent(getApplicationContext(), Math1.class);
                        startActivity(i);
                        finish();
                    }
                }
                else if (asd.getText().toString().equals("Tech")){
                    if (t1 == " "){

                    }else{
                        Intent i = new Intent(getApplicationContext(), Tech1.class);
                        startActivity(i);
                        finish();
                    }
                }
                else if (asd.getText().toString().equals("Science")){
                    if (s1 == " "){

                    }else{
//                        Intent i = new Intent(getApplicationContext(), Science1.class);
//                        startActivity(i);
//                        finish();
                    }
                }
                else{

                }

            }
        });
        expert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent i = new Intent(getApplicationContext(), English1.class);
//                startActivity(i);
                if (asd.getText().toString().equals("Engl")){
                    if (e2 == " "){
                        Toast.makeText(getApplicationContext(), "Finish the Intermediate mode first.", Toast.LENGTH_SHORT).show();
                    }else{
                        Intent i = new Intent(getApplicationContext(), English1.class);
                        startActivity(i);
                        finish();
                    }
                }
                else if (asd.getText().toString().equals("Math")){
                    if (m2 == " "){

                    }else{
                        Intent i = new Intent(getApplicationContext(), Math1.class);
                        startActivity(i);
                        finish();
                    }
                }
                else if (asd.getText().toString().equals("Tech")){
                    if (t2 == " "){

                    }else{
                        Intent i = new Intent(getApplicationContext(), Tech1.class);
                        startActivity(i);
                        finish();
                    }
                }
                else if (asd.getText().toString().equals("Science")){
                    if (s2 == " "){

                    }else{
                        Intent i = new Intent(getApplicationContext(), Science1.class);
                        startActivity(i);
                        finish();
                    }
                }
                else{

                }
            }
        });

    }

    private void shared(){
        SharedPreferences mPref = PreferenceManager.getDefaultSharedPreferences(Difficulty.this);
        e1 = mPref.getString("englbeginner", " ");
        e2 = mPref.getString("englintermediate", " ");
    }

    private void difficulty(){
        if (e1 == " "){
        }
        else{
            intermediate.setBackgroundResource(R.drawable.btnintermediate);
        }
        if (e2 == " "){
        }else{
            expert.setBackgroundResource(R.drawable.btnexpert);
        }
        }


    public void onBackPressed() {
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
        finish();
    }
}
