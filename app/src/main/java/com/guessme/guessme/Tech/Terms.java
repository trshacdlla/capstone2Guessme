package com.guessme.guessme.Tech;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;

import com.guessme.guessme.MainMenu;
import com.guessme.guessme.R;

public class Terms extends AppCompatActivity  {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms);
  }

    public void goToAnActivity(View view) {
        Intent intent = new Intent(this, MainMenu.class);
        startActivity(intent);
        showTermsandConditions();
    }

    public void exit(View v) {
        finish();
        System.exit(0);
    }

    private void showTermsandConditions() {


        SharedPreferences prefs = getSharedPreferences("prefs", MODE_PRIVATE);
        SharedPreferences.Editor editor = prefs.edit();
        editor.putBoolean("agreed", true);
        editor.apply();
    }
//    @Override
//    public void (View view){
//
//        Intent intent = new Intent(getApplicationContext(), MainMenu.class);
//        startActivity(intent);
//        finish();
//  }




}
