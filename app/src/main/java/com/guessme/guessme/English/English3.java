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

public class English3 extends AppCompatActivity {

    private EnglishQuestions e3Questions = new EnglishQuestions();
    private ArrayList<Integer> randomlist = new ArrayList<>();

    static MediaPlayer csounds;

    private TextView timer,score,questions,questionNumber,qnumber;
    private Button ans1,ans2,ans3;
    private android.os.CountDownTimer CountDownTimer;

    private int e3Score = 0;
    private int e3QuestionNum = 0;
    private String e3Answer;
    private int randomnum = 0;
    private int trials=1;

    private Vibrator vibe;
//    static MediaPlayer quiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english3);
//        quiz = MediaPlayer.create(English3.this, R.raw.quiz);
//        quiz.start();

        init();
        dialog();
        nextQuestion();
        Buttons();

    }
    //initialize
    private void init(){

        questions = (TextView) findViewById(R.id.e3question);
        timer = (TextView) findViewById(R.id.e3Timer);
        score = (TextView) findViewById(R.id.e3score);
        questionNumber = (TextView) findViewById(R.id.e3questionNumber);

        ans1 = (Button) findViewById(R.id.e3ans1);
        ans2 = (Button) findViewById(R.id.e3ans2);
//        ans3 = (Button) findViewById(R.id.e3ans3);

        csounds =MediaPlayer.create(English3.this,R.raw.score);

        vibe = (Vibrator) getSystemService(getApplicationContext().VIBRATOR_SERVICE);

        int i;
        for(i = 0; i < 20; i++){
            randomlist.add(i);
        }
    }

    //Countdown timer code
    private void startTimer() {
        //how long the timer in milliseconds
        CountDownTimer = new CountDownTimer(26000, 1000) {

            public void onTick(long millisUntilFinished) {
                timer.setText("" + String.format("%02d:%02d",
                        TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished),
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

                if (ans1.getText() == e3Answer) {
                    e3Score = e3Score + 1;
                    updateScore(e3Score);
                    csounds.start();
                    nextQuestion();
                }else{
//                    e3Score = e3Score + 1;
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

                if (ans2.getText() == e3Answer) {
                    e3Score = e3Score + 1;
                    updateScore(e3Score);
                    csounds.start();
                    nextQuestion();
                }else{
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
//                if (ans3.getText() == e3Answer) {
//                    e3Score = e3Score + 1;
//                    updateScore(e3Score);
//                    csounds.start();
//                    nextQuestion();
//                }else{
//                    nextQuestion();
//                    e3Score = e3Score + 1;
//                    vibe.vibrate(100);
//                }
//
//            }
//        });

    }

    //Code for the next question
    private void nextQuestion(){

        //Used to randomized the questions
        if (randomlist.isEmpty()){
            CountDownTimer.cancel();
            Intent i = new Intent(getApplicationContext(),EnglishScore3.class);
            trials = getIntent().getIntExtra("Engl3tries",1);
            i.putExtra("Engl3tries", trials);
            i.putExtra("score",e3Score);

//            bgmusic =MediaPlayer.create(getApplicationContext(),R.raw.congratulations);
//            bgmusic.start();
            startActivity(i);
            finish();
        }else{
            questionNumber.setText(e3QuestionNum+1 +"/20");
            Random generator = new Random();
            int number = generator.nextInt(randomlist.size());
            randomnum = randomlist.get(number);

            randomlist.remove(number);
        }

        //Selecting random questions
        questions.setText(e3Questions.getE3Questions(randomnum));
        ans1.setText(e3Questions.getE3Choice1(randomnum));
        ans2.setText(e3Questions.getE3Choice2(randomnum));
//        ans3.setText(e2Questions.getE2Choice3(randomnum));

        e3Answer = e3Questions.getE3Answer(randomnum);
        e3QuestionNum++;

    }

    //Code for updating the score
    private void updateScore(int points){
        score.setText(""+e3Score);
    }

    //When phone back button is click
    public void onBackPressed() {
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);
        finish();
    }

    public void dialog(){
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(English3.this);

        alertDialog.setTitle("Learning Objectives: ");
        alertDialog.setMessage("You will gain an understanding of the terms ‘singular’ and ‘plural’");
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

