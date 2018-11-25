package com.guessme.guessme.English;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.os.Vibrator;
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

public class English1 extends AppCompatActivity {

    private EnglishQuestions e1Questions = new EnglishQuestions();
    private ArrayList<Integer> randomlist = new ArrayList<>();

    static MediaPlayer csounds;

    private TextView timer, score, questions, questionNumber, qnumber;
    private Button ans1, ans2, ans3;
    private CountDownTimer CountDownTimer;

    private int e1Score = 0;
    private int e1QuestionNum = 0;
    private String e1Answer;
    private int randomnum = 0;
    private int trials = 1;



    private Vibrator vibe;

    static MediaPlayer bgmusic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english1);

        dialog();
        init();
        nextQuestion();
        Buttons();

    }


    //initializex
    private void init() {

        questions = (TextView) findViewById(R.id.e1question);
        timer = (TextView) findViewById(R.id.e1Timer);
        score = (TextView) findViewById(R.id.ei1score);
        questionNumber = (TextView) findViewById(R.id.e1questionNumber);

        ans1 = (Button) findViewById(R.id.e1ans1);
        ans2 = (Button) findViewById(R.id.e1ans2);
        ans3 = (Button) findViewById(R.id.e1ans3);

        csounds = MediaPlayer.create(English1.this, R.raw.score);

        vibe = (Vibrator) getSystemService(getApplicationContext().VIBRATOR_SERVICE);

        int i;
        for (i = 0; i < 10; i++) {
            randomlist.add(i);
        }
    }

    //Countdown timer code
    private void startTimer() {
        //how long the timer in milliseconds
        CountDownTimer = new CountDownTimer(16000, 1000) {

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
    private void restartTimer() {
        CountDownTimer.cancel();
        CountDownTimer.start();
    }

    //Buttons functions
    public void Buttons() {
        //When choice 1 is clicked
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restartTimer();

                if (ans1.getText() == e1Answer) {
                    e1Score = e1Score + 1;
                    updateScore(e1Score);
                    csounds.start();
                    nextQuestion();
                } else {
//                    e1Score = e1Score + 1;
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

                if (ans2.getText() == e1Answer) {
                    e1Score = e1Score + 1;
                    updateScore(e1Score);
                    csounds.start();
                    nextQuestion();
                } else {
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

                if (ans3.getText() == e1Answer) {
                    e1Score = e1Score + 1;
                    updateScore(e1Score);
                    csounds.start();
                    nextQuestion();
                } else {
                    nextQuestion();
                    vibe.vibrate(100);
                }

            }
        });

    }

    //Code for the next question
    private void nextQuestion() {

        //Used to randomized the questions
        if (randomlist.isEmpty()) {
            CountDownTimer.cancel();
            Intent i = new Intent(getApplicationContext(), EnglishScore1.class);
            trials = getIntent().getIntExtra("Engl1tries", 1);
            i.putExtra("Engl1tries", trials);
            i.putExtra("score", e1Score);
//            bgmusic =MediaPlayer.create(getApplicationContext(),R.raw.congratulations);
//            bgmusic.start();
            startActivity(i);
            finish();
        } else {
            questionNumber.setText(e1QuestionNum + 1 + "/10 ");
            Random generator = new Random();
            int number = generator.nextInt(randomlist.size());
            randomnum = randomlist.get(number);

            randomlist.remove(number);
        }

        //Selecting random questions
        questions.setText(e1Questions.getE1Questions(randomnum));
        ans1.setText(e1Questions.getE1Choice1(randomnum));
        ans2.setText(e1Questions.getE1Choice2(randomnum));
        ans3.setText(e1Questions.getE1Choice3(randomnum));

        e1Answer = e1Questions.getE1Answer(randomnum);
        e1QuestionNum++;

    }

    //Code for updating the score
    private void updateScore(int points) {
        score.setText("" + e1Score);

    }

    //When phone back button is click
    public void onBackPressed() {
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
        finish();
    }

        public void dialog(){
            final AlertDialog.Builder alertDialog = new AlertDialog.Builder(English1.this);

            alertDialog.setTitle("Learning Objective:");
            alertDialog.setMessage(" By the end of this level, the children are expected to know the proper usage of Is, Are, and Am.");
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

