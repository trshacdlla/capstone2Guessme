package com.guessme.guessme.Tech;

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

public class TechEx1 extends AppCompatActivity {
    private TechQuestions t3Questions = new TechQuestions();
    private ArrayList<Integer> randomlist = new ArrayList<>();

    static MediaPlayer csounds;

    private TextView timer,score,questionNumber,qnumber;
    private Button ans1,ans2,ans3;
    private ImageView questions;
    private android.os.CountDownTimer CountDownTimer;

    private int t3Score = 0;
    private int t3QuestionNum = 0;
    private String t3Answer;
    private int randomnum = 0;
    private int trials=1;

    private Vibrator vibe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech_ex1);

        init();
        dialog();
        nextQuestion();
        Buttons();

    }
    //initialize
    private void init(){

        questions = (ImageView) findViewById(R.id.techImage);
        timer = (TextView) findViewById(R.id.tx1Timer);
        score = (TextView) findViewById(R.id.tx1score);

        ans1 = (Button) findViewById(R.id.tx1ans1);
        ans2 = (Button) findViewById(R.id.tx1ans2);
        ans3 = (Button) findViewById(R.id.tx1ans3);
        questionNumber = (TextView) findViewById(R.id.tx1questionNumber);
        csounds =MediaPlayer.create(TechEx1.this,R.raw.score);

        vibe = (Vibrator) getSystemService(getApplicationContext().VIBRATOR_SERVICE);

        int i;
        for(i = 0; i < 10; i++){
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

                if (ans1.getText() == t3Answer) {
                    t3Score = t3Score + 1;
                    updateScore(t3Score);
                    csounds.start();
                    nextQuestion();
                }else{
//                    t3Score = t3Score + 1;
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

                if (ans2.getText() == t3Answer) {
                    t3Score = t3Score + 1;
                    updateScore(t3Score);
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

                if (ans3.getText() == t3Answer) {
                    t3Score = t3Score + 1;
                    updateScore(t3Score);
                    csounds.start();
                    nextQuestion();
                }else{
                    nextQuestion();
//                    t1Score = t1Score + 1;
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
            Intent i = new Intent(getApplicationContext(), TechEx1Score.class);
            trials = getIntent().getIntExtra("TechEx1tries",1);
            i.putExtra("TechEx1tries", trials);
            i.putExtra("score",t3Score);
            startActivity(i);
            finish();
        }else{
            questionNumber.setText(t3QuestionNum + 1 +"/10");
            Random generator = new Random();
            int number = generator.nextInt(randomlist.size());
            randomnum = randomlist.get(number);

            randomlist.remove(number);
        }

        //Selecting random questions
        questions.setImageResource(t3Questions.getTex1Questions(randomnum));
        ans1.setText(t3Questions.getTex1Choice1(randomnum));
        ans2.setText(t3Questions.getTex1Choice2(randomnum));
        ans3.setText(t3Questions.getTex1Choice3(randomnum));

        t3Answer = t3Questions.getTex1Answer(randomnum);
        t3QuestionNum++;
    }

    //Code for updating the score
    private void updateScore(int points){
        score.setText(""+t3Score);

    }

    //When phone back button is click
    public void onBackPressed() {
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);
        finish();
    }

    public void dialog(){
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(TechEx1.this);

        alertDialog.setTitle("Congratulations, you are now in expert mode!");
        alertDialog.setMessage("Direction: Choose the best answer for the following questions.");
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
