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
import android.widget.TextView;

import com.guessme.guessme.English.English5;
import com.guessme.guessme.MainActivity;
import com.guessme.guessme.R;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Tech2 extends AppCompatActivity {

    private TechQuestions t2Questions = new TechQuestions();
    private ArrayList<Integer> randomlist = new ArrayList<>();

    static MediaPlayer csounds;

    private TextView timer,score,questions,questionNumber,qnumber;
    private Button ans1,ans2,ans3;
    private CountDownTimer CountDownTimer;

    private int t2Score = 0;
    private int t2QuestionNum = 0;
    private String t2Answer;
    private int randomnum = 0;
    private int trials=1;

    private Vibrator vibe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech2);

        init();
        dialog();
        nextQuestion();
        Buttons();

    }
    //initialize
    private void init(){

        questions = (TextView) findViewById(R.id.t2question);
        timer = (TextView) findViewById(R.id.t2Timer);
        score = (TextView) findViewById(R.id.t2score);
        questionNumber = (TextView) findViewById(R.id.t2questionNumber);

        ans1 = (Button) findViewById(R.id.t2ans1);
        ans2 = (Button) findViewById(R.id.t2ans2);
        ans3 = (Button) findViewById(R.id.t2ans3);

        csounds =MediaPlayer.create(Tech2.this,R.raw.score);

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

                if (ans1.getText() == t2Answer) {
                    t2Score = t2Score + 1;
                    updateScore(t2Score);
                    csounds.start();
                    nextQuestion();
                }else{
//                    t2Score = t2Score + 1;
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

                if (ans2.getText() == t2Answer) {
                    t2Score = t2Score + 1;
                    updateScore(t2Score);
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

                if (ans3.getText() == t2Answer) {
                    t2Score = t2Score + 1;
                    updateScore(t2Score);
                    csounds.start();
                    nextQuestion();
                }else{
                    nextQuestion();
//                    t2Score = t2Score + 1;
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
            Intent i = new Intent(getApplicationContext(),TechScore2.class);
            trials = getIntent().getIntExtra("Tech2tries",1);
            i.putExtra("Tech2tries", trials);
            i.putExtra("score",t2Score);
            startActivity(i);
            finish();
        }else{
            questionNumber.setText(t2QuestionNum+1 +"/15");
            Random generator = new Random();
            int number = generator.nextInt(randomlist.size());
            randomnum = randomlist.get(number);

            randomlist.remove(number);
        }

        //Selecting random questions
        questions.setText(t2Questions.getT2Questions(randomnum));
        ans1.setText(t2Questions.getT2Choice1(randomnum));
        ans2.setText(t2Questions.getT2Choice2(randomnum));
        ans3.setText(t2Questions.getT2Choice3(randomnum));

        t2Answer = t2Questions.getT2Answer(randomnum);
        t2QuestionNum++;
    }

    //Code for updating the score
    private void updateScore(int points){
        score.setText(""+t2Score);

    }

    //When phone back button is click
    public void onBackPressed() {
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);
        finish();
    }
    public void dialog(){
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(Tech2.this);

        alertDialog.setTitle("Instructions");
        alertDialog.setMessage("Choose the best answer for the following questions.");
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
