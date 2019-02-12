package com.guessme.guessme.English;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.os.Vibrator;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.github.mikephil.charting.charts.BarChart;
import com.guessme.guessme.MainActivity;
import com.guessme.guessme.R;
import com.luolc.emojirain.EmojiRainLayout;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class EnglishEx3 extends AppCompatActivity {
    private EnglishQuestions e1Questions = new EnglishQuestions();
    private ArrayList<Integer> randomlist = new ArrayList<>();

    static MediaPlayer csounds;

    private TextView timer, score, questions, questionNumber, qnumber;
    private Button ans1, ans2, ans3;
    private android.os.CountDownTimer CountDownTimer;

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
        setContentView(R.layout.activity_english_ex3);
        dialog();
        init();
        nextQuestion();
        Buttons();

    }


    //initializex
    private void init() {

        questions = (TextView) findViewById(R.id.ex3question);
        timer = (TextView) findViewById(R.id.ex3Timer);
        score = (TextView) findViewById(R.id.ex3score);
        questionNumber = (TextView) findViewById(R.id.ex3questionNumber);

        ans1 = (Button) findViewById(R.id.ex3ans1);
        ans2 = (Button) findViewById(R.id.ex3ans2);
        ans3 = (Button) findViewById(R.id.ex3ans3);

        csounds = MediaPlayer.create(EnglishEx3.this, R.raw.score);

        vibe = (Vibrator) getSystemService(getApplicationContext().VIBRATOR_SERVICE);

        int i;
        for (i = 0; i < 20; i++) {
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
            Intent i = new Intent(getApplicationContext(), EnglishEx3Score.class);
            trials = getIntent().getIntExtra("Englx3tries", 1);
            i.putExtra("Englx3tries", trials);
            i.putExtra("score", e1Score);
//            bgmusic =MediaPlayer.create(getApplicationContext(),R.raw.congratulations);
//            bgmusic.start();
            startActivity(i);
            finish();
        } else {
            questionNumber.setText(e1QuestionNum + 1 + "/20 ");
            Random generator = new Random();
            int number = generator.nextInt(randomlist.size());
            randomnum = randomlist.get(number);

            randomlist.remove(number);
        }

        //Selecting random questions
        questions.setText(e1Questions.getEx3Questions(randomnum));
        ans1.setText(e1Questions.getEx3Choice1(randomnum));
        ans2.setText(e1Questions.getEx3Choice2(randomnum));
        ans3.setText(e1Questions.getEx3Choice3(randomnum));

        e1Answer = e1Questions.getEx3Answer(randomnum);
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
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(EnglishEx3.this);

        alertDialog.setTitle("Direction:");
        alertDialog.setMessage("Choose the correct answer");
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

