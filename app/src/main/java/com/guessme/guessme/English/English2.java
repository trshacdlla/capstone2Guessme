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

public class English2 extends AppCompatActivity {

    private EnglishQuestions e2Questions = new EnglishQuestions();
    private ArrayList<Integer> randomlist = new ArrayList<>();

    static MediaPlayer csounds;

    private TextView timer,score,questions,questionNumber,qnumber;
    private Button ans1,ans2,ans3;
    private android.os.CountDownTimer CountDownTimer;

    private int e2Score = 0;
    private int e2QuestionNum = 0;
    private String e2Answer;
    private int randomnum = 0;
    private int trials=1;

    private Vibrator vibe;
//    static MediaPlayer quiz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_english2);
//        quiz = MediaPlayer.create(English2.this, R.raw.quiz);
//        quiz.start();
        init();
        dialog();
        nextQuestion();
        Buttons();

    }
    //initialize
    private void init(){

        questions = (TextView) findViewById(R.id.e2question);
        timer = (TextView) findViewById(R.id.e2Timer);
        score = (TextView) findViewById(R.id.e2score);
        questionNumber = (TextView) findViewById(R.id.e2questionNumber);

        ans1 = (Button) findViewById(R.id.e2ans1);
        ans2 = (Button) findViewById(R.id.e2ans2);
//        ans3 = (Button) findViewById(R.id.e2ans3);

        csounds =MediaPlayer.create(English2.this,R.raw.score);

        vibe = (Vibrator) getSystemService(getApplicationContext().VIBRATOR_SERVICE);

        int i;
        for(i = 0; i < 15; i++){
            randomlist.add(i);
        }
    }

    //Countdown timer code
    private void startTimer() {
        //how long the timer in milliseconds
        CountDownTimer = new CountDownTimer(21000, 1000) {

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

                if (ans1.getText() == e2Answer) {
                    e2Score = e2Score + 1;
                    updateScore(e2Score);
                    csounds.start();
                    nextQuestion();
                }else{
//                    e2Score = e2Score + 1;
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

                if (ans2.getText() == e2Answer) {
                    e2Score = e2Score + 1;
                    updateScore(e2Score);
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
//                if (ans3.getText() == e2Answer) {
//                    e2Score = e2Score + 1;
//                    updateScore(e2Score);
//                    csounds.start();
//                    nextQuestion();
//                }else{
//                    nextQuestion();
//                    e2Score = e2Score + 1;
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
            Intent i = new Intent(getApplicationContext(),EnglishScore2.class);
            trials = getIntent().getIntExtra("Engl2tries",1);
            i.putExtra("Engl2tries", trials);
            i.putExtra("score",e2Score);
//            bgmusic =MediaPlayer.create(getApplicationContext(),R.raw.congratulations);
//            bgmusic.start();
            startActivity(i);
            finish();
        }else{
            questionNumber.setText(e2QuestionNum+1 +"/15");
            Random generator = new Random();
            int number = generator.nextInt(randomlist.size());
            randomnum = randomlist.get(number);

            randomlist.remove(number);
        }

        //Selecting random questions
        questions.setText(e2Questions.getE2Questions(randomnum));
        ans1.setText(e2Questions.getE2Choice1(randomnum));
        ans2.setText(e2Questions.getE2Choice2(randomnum));
//        ans3.setText(e2Questions.getE2Choice3(randomnum));

        e2Answer = e2Questions.getE2Answer(randomnum);
        e2QuestionNum++;

    }

    //Code for updating the score
    private void updateScore(int points){
        score.setText(""+e2Score);
    }

    //When phone back button is click
    public void onBackPressed() {
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);
        finish();
    }

    public void dialog(){
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(English2.this);

        alertDialog.setTitle("Learning Objective: ");
        alertDialog.setMessage("Hello there, by the end of this level you are expected to identify ryhming words.\n");
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

