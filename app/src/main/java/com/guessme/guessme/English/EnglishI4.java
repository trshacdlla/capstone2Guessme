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

public class EnglishI4 extends AppCompatActivity {

    private EnglishQuestions EI4question = new EnglishQuestions();
    private ArrayList<Integer> randomlist = new ArrayList<>();

    static MediaPlayer csounds;

    private TextView timer, score, questions, questionNumber, qnumber;
    private Button ans1, ans2, ans3;
    private android.os.CountDownTimer CountDownTimer;

    private int ei4Score = 0;
    private int ei4QuestionNum = 0;
    private String ei4Answer;
    private int randomnum = 0;
    private int trials = 1;



    private Vibrator vibe;

    static MediaPlayer bgmusic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_i4);

        dialog();
        init();
        nextQuestion();
        Buttons();

    }


    //initializex
    private void init() {

        questions = (TextView) findViewById(R.id.ei4question);
        timer = (TextView) findViewById(R.id.ei4Timer);
        score = (TextView) findViewById(R.id.ei4score);
        questionNumber = (TextView) findViewById(R.id.ei4questionNumber);

        ans1 = (Button) findViewById(R.id.ei4ans1);
        ans2 = (Button) findViewById(R.id.ei4ans2);
        ans3 = (Button) findViewById(R.id.ei4ans3);

        csounds = MediaPlayer.create(EnglishI4.this, R.raw.score);

        vibe = (Vibrator) getSystemService(getApplicationContext().VIBRATOR_SERVICE);

        int i;
        for (i = 0; i < 25; i++) {
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

                if (ans1.getText() == ei4Answer) {
                    ei4Score = ei4Score + 1;
                    updateScore(ei4Score);
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

                if (ans2.getText() == ei4Answer) {
                    ei4Score = ei4Score + 1;
                    updateScore(ei4Score);
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

                if (ans3.getText() == ei4Answer) {
                    ei4Score = ei4Score + 1;
                    updateScore(ei4Score);
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
            Intent i = new Intent(getApplicationContext(), EnglishIScore4.class);
            trials = getIntent().getIntExtra("Engli4tries", 1);
            i.putExtra("Engli4tries", trials);
            i.putExtra("score", ei4Score);
//            bgmusic =MediaPlayer.create(getApplicationContext(),R.raw.congratulations);
//            bgmusic.start();
            startActivity(i);
            finish();
        } else {
            questionNumber.setText(ei4QuestionNum + 1 + "/20 ");
            Random generator = new Random();
            int number = generator.nextInt(randomlist.size());
            randomnum = randomlist.get(number);

            randomlist.remove(number);
        }

        //Selecting random questions
        questions.setText(EI4question.getEI4question(randomnum));

        ans1.setText(EI4question.getEI4Choice1(randomnum));
        ans2.setText(EI4question.getEI4Choice2(randomnum));
        ans3.setText(EI4question.getEI4Choice3(randomnum));

        ei4Answer = EI4question.getEI4Answer(randomnum);
        ei4QuestionNum++;

    }

    //Code for updating the score
    private void updateScore(int points) {
        score.setText("" + ei4Score);

    }

    //When phone back button is click
    public void onBackPressed() {
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
        finish();
    }

    public void dialog(){
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(EnglishI4.this);

        alertDialog.setTitle("Direction:");
        alertDialog.setMessage(" Choose the correct missing letter or letters for each word. Choose the letter of the correct answer.");
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

