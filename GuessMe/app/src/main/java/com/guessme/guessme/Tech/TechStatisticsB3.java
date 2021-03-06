package com.guessme.guessme.Tech;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.github.mikephil.charting.charts.BarChart;
import com.github.mikephil.charting.data.BarData;
import com.github.mikephil.charting.data.BarDataSet;
import com.github.mikephil.charting.data.BarEntry;
import com.guessme.guessme.R;

import java.util.ArrayList;

public class TechStatisticsB3 extends AppCompatActivity {

    BarChart barChart;
    Button back;

    int slevel1=0;
    int slevel2=0;
    int slevel3=0;
    int slevel4=0;
    int slevel5=0;
    String level1,level2,level3,level4,level5;

    int congratss;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tech_statistics_b3);

        init();
        graph();
        button();
    }

    //Initialize
    public void init(){
        barChart=(BarChart) findViewById(R.id.TTB3barchart);
        back=(Button) findViewById(R.id.TTB3back);
        congratss = getIntent().getIntExtra("congratss",0);
        SharedPreferences mPref = PreferenceManager.getDefaultSharedPreferences(TechStatisticsB3.this);
        level1 = mPref.getString("ScienceB3Score", " ");
        slevel1 = Integer.parseInt(level1.toString());
    }

    //Functions of the graph
    public void graph(){
        //Graph content
        ArrayList<BarEntry> barEntries = new ArrayList<>();
        barEntries.add(new BarEntry(slevel1,0));
        barEntries.add(new BarEntry(slevel2,1));
        barEntries.add(new BarEntry(slevel3,2));
        barEntries.add(new BarEntry(slevel4,3));
        barEntries.add(new BarEntry(slevel5,4));
        BarDataSet barDataSet = new BarDataSet(barEntries,"Levels");

        //Graph top label
        ArrayList<String> levels = new ArrayList<>();
        levels.add("Lvl 1");
        levels.add("Lvl 2");
        levels.add("Lvl 3");
        levels.add("Lvl 4");
        levels.add("Lvl 5");

        BarData data = new BarData(levels,barDataSet);
        barChart.setData(data);
        barChart.setDescription("");
        barChart.setDragEnabled(false);
        barChart.setTouchEnabled(false);
        barChart.getLegend().setEnabled(false);
        barChart.getAxisRight().setEnabled(false);
        barChart.getAxisLeft().setAxisMaxValue(59);
        barChart.getAxisLeft().setAxisMinValue(0);
    }

    //Functions of the buttons
    public void button(){
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), TechScoreB3.class);
                i.putExtra("score",slevel1);
                int trials = getIntent().getIntExtra("tries", 1);
                i.putExtra("tries", trials);
                i.putExtra("congratss", 1);
                startActivity(i);
                finish();
            }
        });
    }


    public void onBackPressed() {

    }


}