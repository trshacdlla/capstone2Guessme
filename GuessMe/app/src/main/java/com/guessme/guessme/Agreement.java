package com.guessme.guessme;


import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Agreement extends AppCompatActivity {

    public static MediaPlayer bgmusic;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agreement);
        bgmusic =MediaPlayer.create(Agreement.this,R.raw.bgmusic);
        bgmusic.start();
        bgmusic.setLooping(true);
        //Display the title page for 5 seconds
        Thread logoTimer = new Thread() {
            public void run() {
                try {
                    int logoTimer = 0;
                    while (logoTimer < 5000) {
                        sleep(100);
                        logoTimer = logoTimer + 100;
                    };
                    startActivity(new Intent(Agreement.this, Name.class));
                } catch (InterruptedException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } finally {
                    finish();
                }
            }

        };
        logoTimer.start();

    }

}