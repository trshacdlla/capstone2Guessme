package com.guessme.guessme.Math;


import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import com.guessme.guessme.MainActivity;
import com.guessme.guessme.R;
import com.luolc.emojirain.EmojiRainLayout;

public class Math5Score extends AppCompatActivity {


    TextView score,right,wrong,numtry,name;
    Button retry,next,stat;
    int correct =0;
    int incorrect =0;
    int totalquestion = 30;
    int trials =1;
    int percent;
    String Next = "Next";
    String Retry = "Retry";

    int confetti = 0;
    static MediaPlayer bgmusic;
    private EmojiRainLayout container;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_math5_score);
        init();
        sharedPreference();
        buttons();
    }

    private void init(){

        TextView congrats = (TextView) findViewById(R.id.MT5Congrats);

        score = (TextView) findViewById(R.id.MT5score);
        right = (TextView) findViewById(R.id.MT5correct);
        wrong = (TextView) findViewById(R.id.MT5mistake);
        numtry = (TextView) findViewById(R.id.MT5try);
        trials = getIntent().getIntExtra("Math5tries",1);
        numtry.setText(String.valueOf(trials));

        name = (TextView) findViewById(R.id.MT5name);

        retry=(Button) findViewById(R.id.MT5retry);
        next=(Button) findViewById(R.id.MT5next);
        stat=(Button) findViewById(R.id.MT5Stats);

        correct = getIntent().getIntExtra("score",0);
        incorrect = totalquestion-(correct);
        percent = (correct*10);

        SharedPreferences mPref = PreferenceManager.getDefaultSharedPreferences(Math5Score.this);
        name.setText(mPref.getString("KeyName1", " Score"));
        score.setText(String.valueOf(percent));
        right.setText(String.valueOf(correct));
        wrong.setText(String.valueOf(incorrect));

        MediaPlayer bggreat = MediaPlayer.create(getApplicationContext(), R.raw.great);
        MediaPlayer bgout = MediaPlayer.create(getApplicationContext(), R.raw.outstanding);
        MediaPlayer bgkeepitup = MediaPlayer.create(getApplicationContext(), R.raw.keepitup);
        MediaPlayer bggoodjob = MediaPlayer.create(getApplicationContext(), R.raw.goodjob);
        MediaPlayer bgtryagain = MediaPlayer.create(getApplicationContext(), R.raw.tryagain);

        confetti = getIntent().getIntExtra("congratss",0);
        if (correct >= totalquestion*.7){
            Animation animation = AnimationUtils.loadAnimation(this,R.anim.shake);
            score.startAnimation(animation);
            right.startAnimation(animation);
            wrong.startAnimation(animation);
            if(confetti == 0){

                if (correct == totalquestion*.7){
                    bgkeepitup.start();
                }
                else if (correct == totalquestion*.8){
                    bggreat.start();
                }
                else if (correct == totalquestion*.9){
                    bggoodjob.start();
                }
                else {
                    confetti();
                    bgout.start();
                }
            }else{
            }
            next.setText(Next);
        }else{
            if (confetti == 0){
                bgtryagain.start();
            }else{

            }
            congrats.setText("Try Again!");
//            bgtryagain.start();
            next.setText(Retry);
        }
    }
    private void confetti(){

        container = (EmojiRainLayout) findViewById(R.id.math5activity);

//            container.addEmoji(R.drawable.a);
        container.addEmoji(R.drawable.b);
//            container.addEmoji(R.drawable.cblue);
        container.addEmoji(R.drawable.d);
        container.addEmoji(R.drawable.e);
//        container.addEmoji(R.drawable.cgreen);

        container.stopDropping();
        container.setPer(10);
        container.setDuration(5000);
        container.setDropDuration(2400);
        container.setDropFrequency(500);
        container.startDropping();

    }

    private void buttons(){
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (next.getText() == Next) {
                        Intent i = new Intent(getApplicationContext(), MathE1.class);
                        startActivity(i);
                        Math5Score.this.finish();

                }else{
                    Intent i = new Intent(getApplicationContext(), Math5.class);
                    trials++;
                    i.putExtra("Math5tries", trials);
                    startActivity(i);
                    Math5Score.this.finish();
                }
            }
        });
        stat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),Math5Statistics.class);
                i.putExtra("score",correct);
                i.putExtra("congratss", 1);
                i.putExtra("Math5tries", trials);
                startActivity(i);
                finish();

            }
        });
    }

    public void dialog(){

        AlertDialog.Builder alertDialog = new AlertDialog.Builder(Math5Score.this);

        alertDialog.setCancelable(false);
        // Setting Dialog Title
        alertDialog.setTitle("Exit");

//         Setting Dialog Message
        alertDialog.setMessage("Are you sure you want to stop taking the quiz? \nYour progress will not be saved\n");

        // Setting Positive "Yes" Button
        alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
                finish();
            }
        });

        // Setting Negative "Decline" Button
        alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                // Write your code here to invoke NO event
                //Exit the Application
                dialog.cancel();
            }
        });

        // Showing Alert Message
        alertDialog.show();
    }

    private void sharedPreference(){
        String myScore = right.getText().toString();
        SharedPreferences mPref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor mEditor = mPref.edit();
        mEditor.putString("Math5Score", myScore);
        mEditor.commit();
    }

    public void onBackPressed() {

    }

}
