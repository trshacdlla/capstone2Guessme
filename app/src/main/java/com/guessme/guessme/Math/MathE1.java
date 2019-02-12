package com.guessme.guessme.Math;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.os.Vibrator;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.guessme.guessme.MainActivity;
import com.guessme.guessme.R;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class MathE1 extends AppCompatActivity {
    private MathQuestions m1Questions = new MathQuestions();
    private ArrayList<Integer> randomlist = new ArrayList<>();

    static MediaPlayer csounds;

    private TextView timer,score,questions,questionNumber,qnumber;
    private Button ans1,ans2,ans3;
    private android.os.CountDownTimer CountDownTimer;

    private int m1Score = 0;
    private int m1QuestionNum = 0;
    private String m1Answer;
    private int randomnum = 0;
    private int trials=1;

    private Vibrator vibe;
//    static MediaPlayer bgmusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_e1);

        init();
        dialog();
        nextQuestion();
        Buttons();
    }
    //initialize
    private void init(){

        questions = (TextView) findViewById(R.id.me1question);
        timer = (TextView) findViewById(R.id.me1Timer);
        score = (TextView) findViewById(R.id.me1score);
        questionNumber = (TextView) findViewById(R.id.me1questionNumber);

        ans1 = (Button) findViewById(R.id.me1ans1);
        ans2 = (Button) findViewById(R.id.me1ans2);
        ans3 = (Button) findViewById(R.id.me1ans3);

        csounds =MediaPlayer.create(MathE1.this,R.raw.score);

        vibe = (Vibrator) getSystemService(getApplicationContext().VIBRATOR_SERVICE);

        int i;
        for(i = 0; i < 10; i++){
            randomlist.add(i);
        }
    }

    //Countdown timer code
    private void startTimer() {
        //how long the timer in milliseconds
        CountDownTimer = new CountDownTimer(31000, 1000) {

            public void onTick(long millisUntilFinished) {
                timer.setText("" + String.format("%02d",
                        TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) - TimeUnit.MINUTES.toSeconds(
                                TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished))));
            }
            //What will happen if the timer is finish
            public void onFinish() {
                nextQuestion();
                restartTimer();
            }

        }.start();
    }

    //Code for countdown timer restart
    private void restartTimer(){
        CountDownTimer.cancel();
        CountDownTimer.start();
    }

    //Buttons functions
    public void Buttons(){
        //When choice 1 is clicked
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restartTimer();

                if (ans1.getText() == m1Answer) {
                    m1Score = m1Score + 1;
                    updateScore(m1Score);
                    csounds.start();
                    nextQuestion();
                }else{
//                        m1Score = m1Score + 1;
                    nextQuestion();
                    vibe.vibrate(100);
                }

            }
        });

        //When choice 1 is clicked
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restartTimer();

                if (ans2.getText() == m1Answer) {
                    m1Score = m1Score + 1;
                    updateScore(m1Score);
                    csounds.start();
                    nextQuestion();
                }else{
                    nextQuestion();

                    vibe.vibrate(100);
                }

            }
        });

        //When choice 1 is clicked

        ans3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restartTimer();

                if (ans3.getText() == m1Answer) {
                    m1Score = m1Score + 1;
                    updateScore(m1Score);
                    csounds.start();
                    nextQuestion();
                }else{
                    nextQuestion();
//                        m1Score = m1Score + 1;
                    vibe.vibrate(100);
                }

            }
        });

    }

    //Code for the next question
    private void nextQuestion(){

        //Used to randomized the questions
        if (randomlist.isEmpty()){
            CountDownTimer.cancel();
            Intent i = new Intent(getApplicationContext(),MathE1Score.class);
            trials = getIntent().getIntExtra("MathE1tries",1);
            i.putExtra("MathE1tries", trials);
            i.putExtra("score",m1Score);
//            bgmusic =MediaPlayer.create(getApplicationContext(),R.raw.congratulations);
//            bgmusic.start();
            startActivity(i);
            finish();
        }else{
            questionNumber.setText(m1QuestionNum + 1 +"/10");
            Random generator = new Random();
            int number = generator.nextInt(randomlist.size());
            randomnum = randomlist.get(number);

            randomlist.remove(number);
        }

        //Selecting random questions
        questions.setText(m1Questions.getME1Questions(randomnum));
        ans1.setText(m1Questions.getME1Choice1(randomnum));
        ans2.setText(m1Questions.getME1Choice2(randomnum));
        ans3.setText(m1Questions.getME1Choice3(randomnum));

        m1Answer = m1Questions.getME1Answer(randomnum);
        m1QuestionNum++;

    }

    //Code for updating the score
    private void updateScore(int points){
        score.setText(""+m1Score);

    }

    //When phone back button is click
    public void onBackPressed() {
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);
        finish();
    }

    public void dialog(){
        final android.app.AlertDialog.Builder alertDialog = new android.app.AlertDialog.Builder(MathE1.this);

        alertDialog.setTitle("You are now in Epert!");
        alertDialog.setMessage("Direction: Choose the correct number that is missing on the number line. Use skip counting by 2, 3s, and 4s.");
        alertDialog.setCancelable(false);
        // Setting Dialog Message

        // Setting Positive "Yes" Button
        alertDialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // Write your code here to invoke YES event
                startTimer();
            }
        });

        alertDialog.show();
    }

}

