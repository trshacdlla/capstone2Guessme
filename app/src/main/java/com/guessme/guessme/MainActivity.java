package com.guessme.guessme;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.guessme.guessme.English.English1;
import com.guessme.guessme.English.Englishact;
import com.guessme.guessme.Math.Matchact;
import com.guessme.guessme.Math.MathDifficulty;
import com.guessme.guessme.Science.ScienceDifficulty;
import com.guessme.guessme.Science.Scienceact;
import com.guessme.guessme.Tech.TechDifficulty;
import com.guessme.guessme.Tech.Techact;
import com.guessme.guessme.Trivia.Trivia1;
import com.guessme.guessme.Trivia.Trivia10;
import com.guessme.guessme.Trivia.Trivia2;
import com.guessme.guessme.Trivia.Trivia3;
import com.guessme.guessme.Trivia.Trivia4;
import com.guessme.guessme.Trivia.Trivia5;
import com.guessme.guessme.Trivia.Trivia6;
import com.guessme.guessme.Trivia.Trivia7;
import com.guessme.guessme.Trivia.Trivia8;
import com.guessme.guessme.Trivia.Trivia9;

import java.io.IOException;


public class MainActivity extends AppCompatActivity{
    public static MediaPlayer correct;
    public static MediaPlayer error;
    Button math,engl,science,comp;
    ImageView one,two,three,four,five,six,seven,eight,nine,ten;
    TextView text;
    static MediaPlayer quiz;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        if (quiz==null)
//            quiz=MediaPlayer.create(MainActivity.this,R.raw.quiz);
//
//        if (!quiz.isPlaying())
//            quiz.start();
//            quiz.setLooping(true);
//        error = MediaPlayer.create(MainActivity.this, R.raw.error);
//        correct = MediaPlayer.create(MainActivity.this, R.raw.correct);
        init();
        buttons();
        imageClicked();
//        stopplayers();
    }

//    public void stopplayers(){
//        if (quiz.isPlaying()){
//
//            quiz.stop();
//        }
//
//
//    }
    private void init(){
        math = (Button) findViewById(R.id.Mathbtn);
        engl = (Button) findViewById(R.id.Engbtn);
        science = (Button) findViewById(R.id.Sciencebtn);
        comp = (Button) findViewById(R.id.Compbtn);
//        name = (TextView) findViewById(R.id.name);
//        name.setText(getIntent().getStringExtra("Name"));

        one = (ImageView) findViewById(R.id.one);
        two = (ImageView) findViewById(R.id.two);
        three = (ImageView) findViewById(R.id.three);
        four = (ImageView) findViewById(R.id.four);
        five = (ImageView) findViewById(R.id.five);
        six = (ImageView) findViewById(R.id.six);
        seven = (ImageView) findViewById(R.id.seven);
        eight = (ImageView) findViewById(R.id.eight);
        nine = (ImageView) findViewById(R.id.nine);
        ten = (ImageView) findViewById(R.id.ten);

        Animation animation = AnimationUtils.loadAnimation(this,R.anim.shake);
        one.startAnimation(animation);
        two.startAnimation(animation);
        three.startAnimation(animation);
        four.startAnimation(animation);
        five.startAnimation(animation);
        six.startAnimation(animation);
        seven.startAnimation(animation);
        eight.startAnimation(animation);
        nine.startAnimation(animation);
        ten.startAnimation(animation);

        text = (TextView) findViewById(R.id.clickObject);
        Animation animation1 = AnimationUtils.loadAnimation(this,R.anim.blink);
        text.startAnimation(animation1);

    }

    private void buttons(){
        math.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Agreement.bgmusic.stop();
                Intent i = new Intent(getApplicationContext(), Matchact.class);
                i.putExtra("subject","Math");
                startActivity(i);
                MainActivity.this.finish();
            }
        });

        engl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Agreement.bgmusic.stop();
                Intent i = new Intent(getApplicationContext(),Englishact.class);
                i.putExtra("subject","Engl");
                startActivity(i);
                MainActivity.this.finish();
            }
        });

        science.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Agreement.bgmusic.stop();
                Intent i = new Intent(getApplicationContext(),Scienceact.class);
                startActivity(i);
                MainActivity.this.finish();
            }
        });

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Agreement.bgmusic.stop();
                Intent i = new Intent(getApplicationContext(), Techact.class);
                i.putExtra("subject","Tech");
                startActivity(i);
                MainActivity.this.finish();
            }
        });

    }

    private void imageClicked(){
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Trivia1.class);
                startActivity(i);
                finish();
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Trivia2.class);
                startActivity(i);
                finish();
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Trivia3.class);
                startActivity(i);
                finish();
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Trivia4.class);
                startActivity(i);
                finish();
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Trivia5.class);
                startActivity(i);
                finish();
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Trivia6.class);
                startActivity(i);
                finish();
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Trivia7.class);
                startActivity(i);
                finish();
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Trivia8.class);
                startActivity(i);
                finish();
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Trivia9.class);
                startActivity(i);
                finish();
            }
        });
        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Trivia10.class);
                startActivity(i);
                finish();
            }
        });
    }

    public void onBackPressed() {
        Intent i = new Intent(getApplicationContext(), MainMenu.class);
        startActivity(i);
        MainActivity.this.finish();
//        quiz.stop();

    }

}
