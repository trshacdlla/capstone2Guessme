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

public class EnglishI2 extends AppCompatActivity {

    private EnglishQuestions EI2question = new EnglishQuestions();
    private ArrayList<Integer> randomlist = new ArrayList<>();

    static MediaPlayer csounds;

    private TextView timer, score, questions, questionNumber, qnumber;
    private Button ans1, ans2, ans3;
    private android.os.CountDownTimer CountDownTimer;

    private int ei2Score = 0;
    private int ei2QuestionNum = 0;
    private String ei2Answer;
    private int randomnum = 0;
    private int trials = 1;



    private Vibrator vibe;

    static MediaPlayer bgmusic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english_i2);

        dialog();
        init();
        nextQuestion();
        Buttons();

    }


    //initializex
    private void init() {

        questions = (TextView) findViewById(R.id.ei2question);
        timer = (TextView) findViewById(R.id.ei2Timer);
        score = (TextView) findViewById(R.id.ei2score);
        questionNumber = (TextView) findViewById(R.id.ei2questionNumber);

        ans1 = (Button) findViewById(R.id.ei2ans1);
        ans2 = (Button) findViewById(R.id.ei2ans2);
//        ans3 = (Button) findViewById(R.id.ei2ans3);

        csounds = MediaPlayer.create(EnglishI2.this, R.raw.score);

        vibe = (Vibrator) getSystemService(getApplicationContext().VIBRATOR_SERVICE);

        int i;
        for (i = 0; i < 15; i++) {
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

                if (ans1.getText() == ei2Answer) {
                    ei2Score = ei2Score + 1;
                    updateScore(ei2Score);
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

                if (ans2.getText() == ei2Answer) {
                    ei2Score = ei2Score + 1;
                    updateScore(ei2Score);
                    csounds.start();
                    nextQuestion();
                } else {
                    nextQuestion();

                    vibe.vibrate(100);
                }

            }
        });

        //When choice 1 is clicked

//        ans3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                restartTimer();
//
//                if (ans3.getText() == ei2Answer) {
//                    ei2Score = ei2Score + 1;
//                    updateScore(ei2Score);
//                    csounds.start();
//                    nextQuestion();
//                } else {
//                    nextQuestion();
//                    vibe.vibrate(100);
//                }
//
//            }
//        });

    }

    //Code for the next question
    private void nextQuestion() {

        //Used to randomized the questions
        if (randomlist.isEmpty()) {
            CountDownTimer.cancel();
            Intent i = new Intent(getApplicationContext(), EnglishIScore2.class);
            trials = getIntent().getIntExtra("Engli2tries", 1);
            i.putExtra("Engli2tries", trials);
            i.putExtra("score", ei2Score);
//            bgmusic =MediaPlayer.create(getApplicationContext(),R.raw.congratulations);
//            bgmusic.start();
            startActivity(i);
            finish();
        } else {
            questionNumber.setText(ei2QuestionNum + 1 + "/15 ");
            Random generator = new Random();
            int number = generator.nextInt(randomlist.size());
            randomnum = randomlist.get(number);

            randomlist.remove(number);
        }

        //Selecting random questions
        questions.setText(EI2question.getEI2question(randomnum));

        ans1.setText(EI2question.getEI2Choice1(randomnum));
        ans2.setText(EI2question.getEI2Choice2(randomnum));
//        ans3.setText(EI2question.getEI2Choice3(randomnum));

        ei2Answer = EI2question.getEI2Answer(randomnum);
        ei2QuestionNum++;

    }

    //Code for updating the score
    private void updateScore(int points) {
        score.setText("" + ei2Score);

    }

    //When phone back button is click
    public void onBackPressed() {
        Intent i = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(i);
        finish();
    }

    public void dialog(){
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(EnglishI2.this);

        alertDialog.setTitle("Learning Objective:");
        alertDialog.setMessage(" Change the word or words in the parentheses with the correct pronouns He, She, or They. Remember to begin your sentence with the capital letter. Choose the letter or the correct answer.");
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

