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
import android.widget.TextView;

import com.guessme.guessme.MainActivity;
import com.guessme.guessme.R;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Math2 extends AppCompatActivity {

    private MathQuestions m2Questions = new MathQuestions();
    private ArrayList<Integer> randomlist = new ArrayList<>();

    private TextView timer,score,questions,questionNumber,qnumber;
    private Button ans1,ans2,ans3;
    private CountDownTimer CountDownTimer;

    private int m2Score = 0;
    private int m2QuestionNum = 0;
    private String m2Answer;
    private int randomnum = 0;
    private int trials=1;

    private Vibrator vibe;
    static MediaPlayer bgmusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math2);

        init();
        dialog();
        nextQuestion();
        Buttons();
    }
    private void init(){

        questions = (TextView) findViewById(R.id.m2question);
        timer = (TextView) findViewById(R.id.m2Timer);
        score = (TextView) findViewById(R.id.m2score);
        questionNumber = (TextView) findViewById(R.id.m2questionNumber);


        ans1 = (Button) findViewById(R.id.m2ans1);
        ans2 = (Button) findViewById(R.id.m2ans2);
        ans3 = (Button) findViewById(R.id.m2ans3);

        vibe = (Vibrator) getSystemService(getApplicationContext().VIBRATOR_SERVICE);

        int i;
        for(i = 0; i < 15; i++){
            randomlist.add(i);
        }
    }

    private void startTimer() {
        //how long the timer in milliseconds
        CountDownTimer = new CountDownTimer(46000, 1000) {

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

    private void restartTimer(){
        CountDownTimer.cancel();
        CountDownTimer.start();
    }

    public void Buttons(){
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restartTimer();
                if (ans1.getText() == m2Answer) {
                    m2Score = m2Score + 1;
                    updateScore(m2Score);
                    nextQuestion();
//                        Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                }else{
//                    m2Score = m2Score + 1;
                    nextQuestion();
                    vibe.vibrate(100);
//                        Toast.makeText(getApplicationContext(), "Incorrect", Toast.LENGTH_SHORT).show();
                }

            }
        });

        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restartTimer();

                if (ans2.getText() == m2Answer) {
                    m2Score = m2Score + 1;
                    updateScore(m2Score);
                    nextQuestion();
//                        Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                }else{
                    nextQuestion();
                    vibe.vibrate(100);
//                        Toast.makeText(getApplicationContext(), "Incorrect", Toast.LENGTH_SHORT).show();
                }

            }
        });

        ans3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                restartTimer();

                if (ans3.getText() == m2Answer) {
                    m2Score = m2Score + 1;
                    updateScore(m2Score);
                    nextQuestion();
//                        Toast.makeText(getApplicationContext(), "Correct", Toast.LENGTH_SHORT).show();
                }else{
                    nextQuestion();
//                    m2Score = m2Score + 1;
                    vibe.vibrate(100);
//                        Toast.makeText(getApplicationContext(), "Incorrect", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }

    private void nextQuestion(){
    if (randomlist.isEmpty()){
            CountDownTimer.cancel();
            Intent i = new Intent(getApplicationContext(),Math2Score.class);
            trials = getIntent().getIntExtra("Math2tries",1);
            i.putExtra("Math2tries", trials);
            i.putExtra("score",m2Score);
//            bgmusic = MediaPlayer.create(getApplicationContext(),R.raw.congratulations);
//            bgmusic.start();
            startActivity(i);
        finish();
        }else{
            questionNumber.setText(m2QuestionNum+1 +". ");
            Random generator = new Random();
            int number = generator.nextInt(randomlist.size());
            randomnum = randomlist.get(number);
            randomlist.remove(number);
        }
        questions.setText(m2Questions.getM2Questions(randomnum));
        ans1.setText(m2Questions.getM2Choice1(randomnum));
        ans2.setText(m2Questions.getM2Choice2(randomnum));
        ans3.setText(m2Questions.getM2Choice3(randomnum));

        m2Answer = m2Questions.getM2Answer(randomnum);
        m2QuestionNum++;

    }

    private void updateScore(int points){
        score.setText(""+m2Score);

    }

    public void onBackPressed() {
        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);
        finish();
    }
    public void dialog(){
        final AlertDialog.Builder alertDialog = new AlertDialog.Builder(Math2.this);

        alertDialog.setTitle("Instructions");
        alertDialog.setMessage("Answer the ff equation");
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