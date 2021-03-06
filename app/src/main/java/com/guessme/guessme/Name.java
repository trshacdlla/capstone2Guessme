package com.guessme.guessme;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import com.guessme.guessme.Math.M3G1;
import com.guessme.guessme.Tech.Terms;

public class Name extends AppCompatActivity{
    Context context = this;

    Button age1,age2,exit;
    EditText name1;
    CheckBox check;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        init();
        buttons();

    }


    //Initialize
    private void init(){
        exit = (Button) findViewById(R.id.btnexit);
        age2 = (Button) findViewById(R.id.agebtn2);
        name1 = (EditText) findViewById(R.id.name);

        //Get the save name
        SharedPreferences mPref = PreferenceManager.getDefaultSharedPreferences(Name.this);
        name1.setText(mPref.getString("KeyName", " "));

        //If there is no name retrieve it will allow the user to enter a name
        if (name1.getText().toString().equals(" ")){
            name1.setEnabled(true);
        }else{
            name1.setEnabled(false);
//            Intent intent = new Intent
//                    (getApplicationContext(), MainMenu.class);
//            startActivity(intent);
//            Name.this.finish();
        }

    }

    //Buttons functions
    private void buttons(){

        age2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                        if (name1.getText().toString().trim().length()==0) {
                            Toast.makeText(getApplicationContext(), "Please enter your name.",
                                    Toast.LENGTH_LONG).show();
                        } else {

                            SharedPreferences mPref = PreferenceManager.getDefaultSharedPreferences(Name.this);
                            String myname = name1.getText().toString();
                            SharedPreferences.Editor mEditor = mPref.edit();
                            mEditor.putString("KeyName", myname);
                            mEditor.commit();
                            Intent intent = new Intent
                                    (getApplicationContext(), MainMenu.class);
                            intent.putExtra("Name", name1.getText().toString());
                            startActivity(intent);
                            Name.this.finish();
                            name1.setFocusable(false);

                        }
            }
        });


        exit.setOnClickListener(new View.OnClickListener() {


            @Override

            public void onClick(View v) {


                new android.app.AlertDialog.Builder(Name.this)
                        .setMessage("Are you sure you want to exit?")
                        .setCancelable(false)
                        .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                Agreement.mix.stop();
                                finish();
                                System.exit(0);
                            }
                        })
                        .setNegativeButton("No", null)
                        .show();

            }});}




    public void onBackPressed() {

    }


}
