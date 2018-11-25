package com.guessme.guessme.Science;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.os.CountDownTimer;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

import com.guessme.guessme.English.English5;
import com.guessme.guessme.MainActivity;
import com.guessme.guessme.Math.Math1;
import com.guessme.guessme.Math.MathQuestions;
import com.guessme.guessme.R;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class ScienceB2 extends AppCompatActivity {

    private ScienceQuestions Questions = new ScienceQuestions();
    private ArrayList<Integer> randomlist = new ArrayList<>();
    private Dialog dialog;
    static MediaPlayer csounds;

    private TextView timer,score,questions,questionNumber,qnumber;
    private Button ans1,ans2,ans3;
    private CountDownTimer CountDownTimer;

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
        setContentView(R.layout.activity_science_b2);

        init();
        dialog();
//        startTimer();
        Buttons();
        nextQuestion();
    }
    //initialize
    private void init(){

        questions = (TextView) findViewById(R.id.sb2question);
        timer = (TextView) findViewById(R.id.sb2Timer);
        score = (TextView) findViewById(R.id.sb2score);
        questionNumber = (TextView) findViewById(R.id.sb2questionNumber);

        ans1 = (Button) findViewById(R.id.sb2ans1);
        ans2 = (Button) findViewById(R.id.sb2ans2);
        ans3 = (Button) findViewById(R.id.sb2ans3);

//        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/fascinate.ttf");
//        questionNumber.setTypeface(custom_font);
//        timer.setTypeface(custom_font);
//        questions.setTypeface(custom_font);
//
//        ans1.setTypeface(custom_font);
//        ans2.setTypeface(custom_font);
//        ans3.setTypeface(custom_font);

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
//                    Score = Score + 1;
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
            Intent i = new Intent(getApplicationContext(),ScienceScoreB2.class);
            trials = getIntent().getIntExtra("tries",1);
            i.putExtra("tries", trials);
            i.putExtra("score",Score);
//            bgmusic =MediaPlayer.create(getApplicationContext(),R.raw.congratulations);
//            bgmusic.start();
            startActivity(i);
            finish();
        }else{
            questionNumber.setText(QuestionNum+ 1 +"/15");
            Random generator = new Random();
            int number = generator.nextInt(randomlist.size());
            randomnum = randomlist.get(number);

            randomlist.remove(number);
        }

        //Selecting random questions
        questions.setText(Questions.getS2G1Questions(randomnum));
        ans1.setText(Questions.getS2G1Choice1(randomnum));
        ans2.setText(Questions.getS2G1Choice2(randomnum));
        ans3.setText(Questions.getS2G1Choice3(randomnum));

        Answer = Questions.getS2G1Answer(randomnum);
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
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(ScienceB2.this);

        alertDialog.setTitle("Learning Objective:");
        alertDialog.setMessage("Children will be able to identify and describe the five senses.");
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




//        final AlertDialog alertDialog = new AlertDialog.Builder(this).setTitle("Instruction").setMessage(ins).show();
////        View mView = getLayoutInflater().inflate(R.layout.instruction, null);
////        AlertDialog dialog = AlertDialog.Builder.create();
//        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/fascinate.ttf");
////        TextView textView1 = (TextView) alertDialog.findViewById(android.R.id.title);
//        TextView textView = (TextView) alertDialog.findViewById(android.R.id.message);
//        Button yes = (Button)alertDialog.findViewById(R.id.);
////        textView.setTextSize(25);
//        textView.setTypeface(custom_font);
////        textView1.setTypeface(custom_font);
//        alertDialog.setCancelable(true);
//
//
//        // Setting Dialog Message
//
//        // Setting Positive "Yes" Button
////        alertDialog.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
////            public void onClick(DialogInterface dialog, int which) {
////                // Write your code here to invoke YES event
////                startTimer();
////            }
////        });
//
//        alertDialog.show();

}




