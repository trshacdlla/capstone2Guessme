package com.guessme.guessme.Science;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.media.MediaPlayer;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.github.mikephil.charting.charts.BarChart;
import com.guessme.guessme.MainActivity;
import com.guessme.guessme.R;
import com.luolc.emojirain.EmojiRainLayout;

public class ScienceScoreI5 extends AppCompatActivity {

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

    private EmojiRainLayout container;

    private TextView txtscore,txtcorrect,txtwrong;


    MediaPlayer bggreat;
    MediaPlayer bgout;
    MediaPlayer bgkeepitup;
    MediaPlayer bggoodjob;
    MediaPlayer bgtryagain;

    BarChart barChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science_score_i5);

        init();
        sharedPreference();
        buttons();
    }

    //Initialize
    private void init(){
        score = (TextView) findViewById(R.id.STI5score);
        right = (TextView) findViewById(R.id.STI5correct);
        wrong = (TextView) findViewById(R.id.STI5mistake);
        numtry = (TextView) findViewById(R.id.STI5try);
        trials = getIntent().getIntExtra("tries",1);
        numtry.setText(String.valueOf(trials));

        txtcorrect = (TextView) findViewById(R.id.STI5txtCorrect);
        txtwrong = (TextView) findViewById(R.id.STI5txtWrong);
        txtscore = (TextView) findViewById(R.id.STI5txtScore);

        name = (TextView) findViewById(R.id.STI5name);

        retry=(Button) findViewById(R.id.STI5retry);
        next=(Button) findViewById(R.id.STI5next);
        stat=(Button) findViewById(R.id.STI5Stats);

        correct = getIntent().getIntExtra("score",0);
        incorrect = totalquestion-(correct);
        percent = correct*10;

        SharedPreferences mPref = PreferenceManager.getDefaultSharedPreferences(ScienceScoreI5.this);
        name.setText(mPref.getString("KeyName", " Score"));

        score.setText(String.valueOf(percent));
        right.setText(String.valueOf(correct));
        wrong.setText(String.valueOf(incorrect));

        TextView congrats = (TextView) findViewById(R.id.STI5Congrats);
        bggreat = MediaPlayer.create(getApplicationContext(), R.raw.great);
        bgout = MediaPlayer.create(getApplicationContext(), R.raw.outstanding);
        bgkeepitup = MediaPlayer.create(getApplicationContext(), R.raw.keepitup);
        bggoodjob = MediaPlayer.create(getApplicationContext(), R.raw.goodjob);
        bgtryagain = MediaPlayer.create(getApplicationContext(), R.raw.tryagain);


        Typeface custom_font = Typeface.createFromAsset(getAssets(),  "fonts/fascinate.ttf");
        score.setTypeface(custom_font);
        right.setTypeface(custom_font);
        wrong.setTypeface(custom_font);
        numtry.setTypeface(custom_font);
        congrats.setTypeface(custom_font);
        name.setTypeface(custom_font);

        retry.setTypeface(custom_font);
        next.setTypeface(custom_font);
        stat.setTypeface(custom_font);
        txtscore.setTypeface(custom_font);
        txtwrong.setTypeface(custom_font);
        txtcorrect.setTypeface(custom_font);

        TextView level = (TextView) findViewById(R.id.level);
        level.setTypeface(custom_font);
        TextView trytxt = (TextView) findViewById(R.id.textView2);
        trytxt.setTypeface(custom_font);

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
                else if (correct == totalquestion){
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

        container = (EmojiRainLayout) findViewById(R.id.scienceI5activity);

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

    //Buttons function
    private void buttons(){
        retry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
                finish();

            }
        });
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (next.getText() == Next){
                    if (correct >= totalquestion*.7){
                        if(confetti == 0){
                            confetti();
                            if (correct == totalquestion*.7){
                                bgkeepitup.stop();
                            }
                            else if (correct == totalquestion*.8){
                                bggreat.stop();
                            }
                            else if (correct == totalquestion*.9){
                                bggoodjob.stop();
                            }
                            else {
                                bgout.stop();
                            }
                        }else{
                        }
                        Intent i = new Intent(getApplicationContext(),MainActivity.class);
                        startActivity(i);
                        finish();
                    }else {
                        Toast.makeText(getApplicationContext(), "You need to pass first",
                                Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Intent i = new Intent(getApplicationContext(), ScienceI5.class);
                    trials++;
                    i.putExtra("tries", trials);
                    startActivity(i);
                    finish();
                }

            }
        });

        stat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),ScienceStatisticsI5.class);
                i.putExtra("score",correct);
                i.putExtra("tries", trials);
                i.putExtra("congratss", 1);
                startActivity(i);
                finish();

            }
        });

    }

    //Save the score
    private void sharedPreference(){
        String myScore = right.getText().toString();
        SharedPreferences mPref = PreferenceManager.getDefaultSharedPreferences(getApplicationContext());
        SharedPreferences.Editor mEditor = mPref.edit();
        mEditor.putString("ScienceI5Score", myScore);
        mEditor.commit();
    }

    //Pop up dialog box
    public void dialog(){

        AlertDialog.Builder alertDialog = new AlertDialog.Builder(ScienceScoreI5.this);

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

    public void onBackPressed() {

    }

}
