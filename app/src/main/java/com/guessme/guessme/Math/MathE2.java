package com.guessme.guessme.Math;

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
import android.widget.ImageView;
import android.widget.TextView;

import com.guessme.guessme.MainActivity;
import com.guessme.guessme.R;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class MathE2 extends AppCompatActivity {
    private MathQuestions Questions = new MathQuestions();
    private ArrayList<Integer> randomlist = new ArrayList<>();

    static MediaPlayer csounds;

    private TextView timer,score,questionNumber,qnumber;
    private Button ans1,ans2,ans3;
    private android.os.CountDownTimer CountDownTimer;
    private ImageView questions;

    private int Score = 0;
    private int QuestionNum = 0;
    private String Answer;
    private int randomnum = 0;
    private int trials=1;

    private Vibrator vibe;
//    static MediaPlayer bgmusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math_e2);

        init();
        dialog();
        nextQuestion();
        Buttons();
    }
    //initialize
    private void init(){

        questions = (ImageView) findViewById(R.id.me2question);
        timer = (TextView) findViewById(R.id.me2Timer);
        score = (TextView) findViewById(R.id.me2score);
        questionNumber = (TextView) findViewById(R.id.me2questionNumber);

        ans1 = (Button) findViewById(R.id.me2ans1);
        ans2 = (Button) findViewById(R.id.me2ans2);
        ans3 = (Button) findViewById(R.id.me2ans3);

        csounds =MediaPlayer.create(getApplicationContext(),R.raw.score);

        vibe = (Vibrator) getSystemService(getApplicationContext().VIBRATOR_SERVICE);

        int i;
        for(i = 0; i < 15; i++){
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

                if (ans1.getText() == Answer) {
                    Score = Score + 1;
                    updateScore(Score);
                    csounds.start();
                    nextQuestion();
                }else{
//                    Score = Score + 1;
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

                if (ans2.getText() == Answer) {
                    Score = Score + 1;
                    updateScore(Score);
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

                if (ans3.getText() == Answer) {
                    Score = Score + 1;
                    updateScore(Score);
                    csounds.start();
                    nextQuestion();
                }else{
                    nextQuestion();
                    Score = Score + 1;
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
            Intent i = new Intent(getApplicationContext(),MathE2Score.class);
            trials = getIntent().getIntExtra("tries",1);
            i.putExtra("tries", trials);
            i.putExtra("score",Score);
//            bgmusic =MediaPlayer.create(getApplicationContext(),R.raw.congratulations);
//            bgmusic.start();
            startActivity(i);
            finish();
        }else{
            questionNumber.setText(QuestionNum+1 +"/15");
            Random generator = new Random();
            int number = generator.nextInt(randomlist.size());
            randomnum = randomlist.get(number);

            randomlist.remove(number);
        }

        //Selecting random questions
        questions.setImageResource(Questions.getME2Questions(randomnum));
        ans1.setText(Questions.getME2Choice1(randomnum));
        ans2.setText(Questions.getME2Choice2(randomnum));
        ans3.setText(Questions.getME2Choice3(randomnum));

        Answer = Questions.getME2Answer(randomnum);
        QuestionNum++;

    }

    //Code for updating the score
    private void updateScore(int points){
        score.setText(""+Score);

    }

    //When phone back button is click
    public void onBackPressed() {
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);
        finish();
    }

    public void dialog(){
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(MathE2.this);

        alertDialog.setTitle("Learning objective:");
        alertDialog.setMessage("By the end of this level, the childen are expected to learn how to count from 1 up to 10.\n");
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

