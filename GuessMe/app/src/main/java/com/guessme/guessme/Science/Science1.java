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

public class Science1 extends AppCompatActivity {

    private ScienceQuestions s1Questions = new ScienceQuestions();
    private ArrayList<Integer> randomlist = new ArrayList<>();

    static MediaPlayer csounds;

    private TextView timer,score,questions,questionNumber,qnumber;
    private Button ans1,ans2,ans3;
    private CountDownTimer CountDownTimer;

    private int Score = 0;
    private int QuestionNum = 0;
    private String Answer;
    private int randomnum = 0;
    private int trials=1;
    private Dialog dialog;

    private Vibrator vibe;
//    static MediaPlayer bgmusic;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science1);

        init();
        dialog();
        nextQuestion();
        Buttons();
    }
    //initialize
    private void init(){

        questions = (TextView) findViewById(R.id.s1question);
        timer = (TextView) findViewById(R.id.s1Timer);
        score = (TextView) findViewById(R.id.s1score);
        questionNumber = (TextView) findViewById(R.id.s1questionNumber);

        ans1 = (Button) findViewById(R.id.s1ans1);
        ans2 = (Button) findViewById(R.id.s1ans2);
        ans3 = (Button) findViewById(R.id.s1ans3);

        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/fascinate.ttf");
        questionNumber.setTypeface(custom_font);
        timer.setTypeface(custom_font);
        questions.setTypeface(custom_font);

        ans1.setTypeface(custom_font);
        ans2.setTypeface(custom_font);
        ans3.setTypeface(custom_font);


        csounds =MediaPlayer.create(getApplicationContext(),R.raw.score);

        vibe = (Vibrator) getSystemService(getApplicationContext().VIBRATOR_SERVICE);

        int i;
        for(i = 0; i < 10; i++){
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
            Intent i = new Intent(getApplicationContext(),ScienceScore1.class);
            trials = getIntent().getIntExtra("tries",1);
            i.putExtra("tries", trials);
            i.putExtra("score",Score);
//            bgmusic =MediaPlayer.create(getApplicationContext(),R.raw.congratulations);
//            bgmusic.start();
            startActivity(i);
            finish();
        }else{
            questionNumber.setText(QuestionNum+1 +". ");
            Random generator = new Random();
            int number = generator.nextInt(randomlist.size());
            randomnum = randomlist.get(number);

            randomlist.remove(number);
        }

        //Selecting random questions
        questions.setText(s1Questions.getS1Questions(randomnum));
        ans1.setText(s1Questions.getS1Choice1(randomnum));
        ans2.setText(s1Questions.getS1Choice2(randomnum));
        ans3.setText(s1Questions.getS1Choice3(randomnum));

        Answer = s1Questions.getS1Answer(randomnum);
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
        String ins = "Choose the best answer for the following questions.";
        dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.instruction);
        dialog.show();
        dialog.setCancelable(false);
        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/fascinate.ttf");

        TextView tv_title = (TextView) dialog.findViewById(R.id.title);
        TextView tv_message = (TextView) dialog .findViewById(R.id.instruc);
        tv_message.setTypeface(custom_font);
        tv_title.setTypeface(custom_font);
        tv_message.setText(ins);

        Button bt_yes = (Button)dialog.findViewById(R.id.ok);

        bt_yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startTimer();
                dialog.cancel();
            }
        });
    }


}

