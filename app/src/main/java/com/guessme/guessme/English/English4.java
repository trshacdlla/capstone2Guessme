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

public class English4 extends AppCompatActivity {

    private EnglishQuestions e4Questions = new EnglishQuestions();
    private ArrayList<Integer> randomlist = new ArrayList<>();

    static MediaPlayer csounds;

    private TextView timer,score,questions,questionNumber,qnumber;
    private Button ans1,ans2,ans3;
    private android.os.CountDownTimer CountDownTimer;

    private int e4Score = 0;
    private int e4QuestionNum = 0;
    private String e4Answer;
    private int randomnum = 0;
    private int trials=1;

    private Vibrator vibe;
    static MediaPlayer bgmusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english4);

        init();
        dialog();
        nextQuestion();
        Buttons();

    }
    //initialize
    private void init(){

        questions = (TextView) findViewById(R.id.e4question);
        timer = (TextView) findViewById(R.id.e4Timer);
        score = (TextView) findViewById(R.id.e4score);
        questionNumber = (TextView) findViewById(R.id.e4questionNumber);

        ans1 = (Button) findViewById(R.id.e4ans1);
        ans2 = (Button) findViewById(R.id.e4ans2);
//        ans3 = (Button) findViewById(R.id.e4ans3);

        csounds =MediaPlayer.create(English4.this,R.raw.score);

        vibe = (Vibrator) getSystemService(getApplicationContext().VIBRATOR_SERVICE);

        int i;
        for(i = 0; i < 25; i++){
            randomlist.add(i);
        }
    }

    //Countdown timer code
    private void startTimer() {
        //how long the timer in milliseconds
        CountDownTimer = new CountDownTimer(31000, 1000) {

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

                if (ans1.getText() == e4Answer) {
                    e4Score = e4Score + 1;
                    updateScore(e4Score);
                    csounds.start();
                    nextQuestion();
                }else{
//                    e4Score = e4Score + 1;
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

                if (ans2.getText() == e4Answer) {
                    e4Score = e4Score + 1;
                    updateScore(e4Score);
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
//
    }

    //Code for the next question
    private void nextQuestion(){

        //Used to randomized the questions
        if (randomlist.isEmpty()){
            CountDownTimer.cancel();
            Intent i = new Intent(getApplicationContext(),EnglishScore4.class);
            trials = getIntent().getIntExtra("Engl4tries",1);
            i.putExtra("Engl4tries", trials);
            i.putExtra("score",e4Score);

//            bgmusic =MediaPlayer.create(getApplicationContext(),R.raw.congratulations);
//            bgmusic.start();
            startActivity(i);
            finish();
        }else{
            questionNumber.setText(e4QuestionNum + 1 +"/25");
            Random generator = new Random();
            int number = generator.nextInt(randomlist.size());
            randomnum = randomlist.get(number);

            randomlist.remove(number);
        }

        //Selecting random questions
        questions.setText(e4Questions.getE4Questions(randomnum));
        ans1.setText(e4Questions.getE4Choice1(randomnum));
        ans2.setText(e4Questions.getE4Choice2(randomnum));
//        ans3.setText(e2Questions.getE2Choice3(randomnum));

        e4Answer = e4Questions.getE4Answer(randomnum);
        e4QuestionNum++;

    }

    //Code for updating the score
    private void updateScore(int points){
        score.setText(""+e4Score);
    }

    //When phone back button is click
    public void onBackPressed() {
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);
        finish();
    }
    public void dialog(){
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(English4.this);

        alertDialog.setTitle("Learning Objectives: ");
        alertDialog.setMessage("1. The children will define 'adjective' as a describing word.\n" +
                "2.Students will identify adjectives in sentences.\n" +
                "\n");
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

