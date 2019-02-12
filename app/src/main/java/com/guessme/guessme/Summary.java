package com.guessme.guessme;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Summary extends AppCompatActivity {

    public Button procceed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);




        init();
        buttons();
        Context context = this;

        final SharedPreferences sharedPreferences = PreferenceManager.getDefaultSharedPreferences(this);

        boolean agreed = sharedPreferences.getBoolean("agreed", false);


        if (!agreed) {


            new android.support.v7.app.AlertDialog.Builder(context)
                    .setTitle("Hello, Welcome to GuessMe, A mobile quiz app" +
                            "")
                    .setPositiveButton("AGREE", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            SharedPreferences.Editor editor = sharedPreferences.edit();
                            editor.putBoolean("agreed", true);
                            editor.commit();
//                            startActivity(new Intent(Name.this, MainMenu.class));
                        }
                    }).setNegativeButton("DISAGREE", new DialogInterface.OnClickListener() {

                @Override
                public void onClick(DialogInterface dialog, int which) {
                    Agreement.mix.stop();
                    finish();
                    System.exit(0);
                }
            })

                    .setMessage("The terms of this agreement (EULA) (\\\"Terms of Use\\\") govern the relationship between you and GuessMe, regarding your use of GuessMe games, websites and related services (the \\\"Service\\\"), including all information, text, graphics, software, and services, available for your use. By using this application and the services offered on it, downloading any software, or browsing the website, as well as by downloading any of our mobile games from app stores, you accept the following Terms of Use. If you do NOT agree to all these Terms of Use, please do NOT use this website and/or download any of our games. \n" +
                            "GuessMe is authorized to amend the Terms of Use at any time, with the amended Terms of Use effective as soon as they are posted on this website. Please check the most current Terms of Use to ensure that you are aware of all the terms and conditions regulating your use of this website and our game.\n" +
                            "YOU AGREE THAT YOUR USE OF THE INFORMATION, CONTENT, OR SERVICES ACKNOWLEDGES THAT YOU HAVE READ THIS AGREEMENT, UNDERSTAND IT, AND AGREE TO BE BOUND BY ITS TERMS AND CONDITIONS. \n" +
                            "If you have any questions or comments, please contact us at support@ GuessMe.com..")
                    .show();
        }

    }

    private void init(){
        procceed = (Button) findViewById(R.id.proc);
}

    private void buttons(){
        procceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(), Name.class);
                startActivity(i);
                finish();


            }
        });


}}
