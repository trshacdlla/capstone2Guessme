package com.guessme.guessme;

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

import java.util.ArrayList;

public class Scores extends AppCompatActivity{

    private BarChart ebchart, echart,mchart,schart,tchart, sciichart, mbchart, tichart;
    private Button back;
    private SharedPreferences mPref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scores);

        init();
        englgraph();
        englbgraph();
        mathgraph();
        sciencegraph();
        techgraph();
        sciencebgraph();
        mathbgraph();
        tichartgraph();
    }

    public void init(){
        ebchart = (BarChart) findViewById(R.id.EnglINTbarchart);
        echart = (BarChart) findViewById(R.id.EnglBEGbarchart);
        mchart = (BarChart) findViewById(R.id.Mathbarchart);
        schart = (BarChart) findViewById(R.id.Sciencebarchart);
        tchart = (BarChart) findViewById(R.id.Techbarchart);
        sciichart = (BarChart) findViewById(R.id.ScienceIbarchart);
        mbchart = (BarChart) findViewById(R.id.Mathbbarchart);
        tichart = (BarChart) findViewById(R.id.TechIbarchart);

        mPref = PreferenceManager.getDefaultSharedPreferences(Scores.this);
        back = (Button) findViewById(R.id.score_back_btn);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), MainMenu.class);
                startActivity(i);
                finish();
            }
        });

    }
    private void englbgraph(){
        //Graph content
        int elevel1 = 0;
        int elevel2 = 0;
        int elevel3 = 0;
        int elevel4 = 0;
        int elevel5 = 0;

        String selevel1,selevel2,selevel3,selevel4,selevel5;

        selevel1 = mPref.getString("Engl1Score", "0");
        selevel2 = mPref.getString("Engl2Score", "0");
        selevel3 = mPref.getString("Engl3Score", "0");
        selevel4 = mPref.getString("Engl4Score", "0");
        selevel5 = mPref.getString("Engl5Score", "0");


        elevel1 = Integer.parseInt(selevel1.toString());
        elevel2 = Integer.parseInt(selevel2.toString());
        elevel3 = Integer.parseInt(selevel3.toString());
        elevel4 = Integer.parseInt(selevel4.toString());
        elevel5 = Integer.parseInt(selevel5.toString());

        ArrayList<BarEntry> barEntries = new ArrayList<>();
        barEntries.add(new BarEntry(elevel1,0));
        barEntries.add(new BarEntry(elevel2,1));
        barEntries.add(new BarEntry(elevel3,2));
        barEntries.add(new BarEntry(elevel4,3));
        barEntries.add(new BarEntry(elevel5,4));
        BarDataSet barDataSet = new BarDataSet(barEntries,"Levels");


        //Graph top label
        ArrayList<String> levels = new ArrayList<>();
        levels.add("Lvl 1");
        levels.add("Lvl 2");
        levels.add("Lvl 3");
        levels.add("Lvl 4");
        levels.add("Lvl 5");

        BarData data = new BarData(levels,barDataSet);
        ebchart.setData(data);
        ebchart.setDescription("");
        ebchart.setDragEnabled(false);
        ebchart.setTouchEnabled(false);
        ebchart.getLegend().setEnabled(false);
        ebchart.getAxisRight().setEnabled(false);
        ebchart.getAxisLeft().setAxisMaxValue(59);
        ebchart.getAxisLeft().setAxisMinValue(0);
    }

    private void englgraph(){
        //Graph content
        int elevel1 = 0;
        int elevel2 = 0;
        int elevel3 = 0;
        int elevel4 = 0;
        int elevel5 = 0;

        String selevel1,selevel2,selevel3,selevel4,selevel5;

        selevel1 = mPref.getString("EnglI1Score", "0");
        selevel2 = mPref.getString("EnglI2Score", "0");
        selevel3 = mPref.getString("EnglI3Score", "0");
        selevel4 = mPref.getString("EnglI4Score", "0");
        selevel5 = mPref.getString("EnglI5Score", "0");


        elevel1 = Integer.parseInt(selevel1.toString());
        elevel2 = Integer.parseInt(selevel2.toString());
        elevel3 = Integer.parseInt(selevel3.toString());
        elevel4 = Integer.parseInt(selevel4.toString());
        elevel5 = Integer.parseInt(selevel5.toString());

        ArrayList<BarEntry> barEntries = new ArrayList<>();
        barEntries.add(new BarEntry(elevel1,0));
        barEntries.add(new BarEntry(elevel2,1));
        barEntries.add(new BarEntry(elevel3,2));
        barEntries.add(new BarEntry(elevel4,3));
        barEntries.add(new BarEntry(elevel5,4));
        BarDataSet barDataSet = new BarDataSet(barEntries,"Levels");


        //Graph top label
        ArrayList<String> levels = new ArrayList<>();
        levels.add("Lvl 1");
        levels.add("Lvl 2");
        levels.add("Lvl 3");
        levels.add("Lvl 4");
        levels.add("Lvl 5");

        BarData data = new BarData(levels,barDataSet);
        echart.setData(data);
        echart.setDescription("");
        echart.setDragEnabled(false);
        echart.setTouchEnabled(false);
        echart.getLegend().setEnabled(false);
        echart.getAxisRight().setEnabled(false);
        echart.getAxisLeft().setAxisMaxValue(59);
        echart.getAxisLeft().setAxisMinValue(0);
    }
    private void mathbgraph(){
        int mlevel1 = 0;
        int mlevel2 = 0;
        int mlevel3 = 0;
        int mlevel4 = 0;
        int mlevel5 = 0;


        String smlevel1,smlevel2,smlevel3,smlevel4,smlevel5;

        smlevel1 = mPref.getString("MathB1Score", "0");
        smlevel2 = mPref.getString("MathB2Score", "0");
        smlevel3 = mPref.getString("MathB3Score", "0");
        smlevel4 = mPref.getString("MathB4Score", "0");
        smlevel5 = mPref.getString("MathB5Score", "0");


        mlevel1 = Integer.parseInt(smlevel1.toString());
        mlevel2 = Integer.parseInt(smlevel2.toString());
        mlevel3 = Integer.parseInt(smlevel3.toString());
        mlevel4 = Integer.parseInt(smlevel4.toString());
        mlevel5 = Integer.parseInt(smlevel5.toString());

        //Graph content
        ArrayList<BarEntry> barEntries = new ArrayList<>();
        barEntries.add(new BarEntry(mlevel1,0));
        barEntries.add(new BarEntry(mlevel2,1));
        barEntries.add(new BarEntry(mlevel3,2));
        barEntries.add(new BarEntry(mlevel4,3));
        barEntries.add(new BarEntry(mlevel5,4));
        BarDataSet barDataSet = new BarDataSet(barEntries,"Levels");

        //Graph top label
        ArrayList<String> levels = new ArrayList<>();
        levels.add("Lvl 1");
        levels.add("Lvl 2");
        levels.add("Lvl 3");
        levels.add("Lvl 4");
        levels.add("Lvl 5");

        BarData data = new BarData(levels,barDataSet);
        mbchart.setData(data);
        mbchart.setDescription("");
        mbchart.setDragEnabled(false);
        mbchart.setTouchEnabled(false);
        mbchart.getLegend().setEnabled(false);
        mbchart.getAxisRight().setEnabled(false);
        mbchart.getAxisLeft().setAxisMaxValue(59);
        mbchart.getAxisLeft().setAxisMinValue(0);
    }
    private void mathgraph(){
        int mlevel1 = 0;
        int mlevel2 = 0;
        int mlevel3 = 0;
        int mlevel4 = 0;
        int mlevel5 = 0;


        String smlevel1,smlevel2,smlevel3,smlevel4,smlevel5;

        smlevel1 = mPref.getString("Math1Score", "0");
        smlevel2 = mPref.getString("Math2Score", "0");
        smlevel3 = mPref.getString("Math3Score", "0");
        smlevel4 = mPref.getString("Math4Score", "0");
        smlevel5 = mPref.getString("Math5Score", "0");


        mlevel1 = Integer.parseInt(smlevel1.toString());
        mlevel2 = Integer.parseInt(smlevel2.toString());
        mlevel3 = Integer.parseInt(smlevel3.toString());
        mlevel4 = Integer.parseInt(smlevel4.toString());
        mlevel5 = Integer.parseInt(smlevel5.toString());

        //Graph content
        ArrayList<BarEntry> barEntries = new ArrayList<>();
        barEntries.add(new BarEntry(mlevel1,0));
        barEntries.add(new BarEntry(mlevel2,1));
        barEntries.add(new BarEntry(mlevel3,2));
        barEntries.add(new BarEntry(mlevel4,3));
        barEntries.add(new BarEntry(mlevel5,4));
        BarDataSet barDataSet = new BarDataSet(barEntries,"Levels");

        //Graph top label
        ArrayList<String> levels = new ArrayList<>();
        levels.add("Lvl 1");
        levels.add("Lvl 2");
        levels.add("Lvl 3");
        levels.add("Lvl 4");
        levels.add("Lvl 5");

        BarData data = new BarData(levels,barDataSet);
        mchart.setData(data);
        mchart.setDescription("");
        mchart.setDragEnabled(false);
        mchart.setTouchEnabled(false);
        mchart.getLegend().setEnabled(false);
        mchart.getAxisRight().setEnabled(false);
        mchart.getAxisLeft().setAxisMaxValue(59);
        mchart.getAxisLeft().setAxisMinValue(0);
    }
    private void sciencebgraph(){
        int slevel1 = 0;
        int slevel2 = 0;
        int slevel3 = 0;
        int slevel4 = 0;
        int slevel5 = 0;

        String sslevel1,sslevel2,sslevel3,sslevel4,sslevel5;

        sslevel1 = mPref.getString("ScienceB1Score", "0");
        sslevel2 = mPref.getString("ScienceB2Score", "0");
        sslevel3 = mPref.getString("ScienceB3Score", "0");
        sslevel4 = mPref.getString("ScienceB4Score", "0");
        sslevel5 = mPref.getString("ScienceB5Score", "0");

        slevel1 = Integer.parseInt(sslevel1.toString());
        slevel2 = Integer.parseInt(sslevel2.toString());
        slevel3 = Integer.parseInt(sslevel3.toString());
        slevel4 = Integer.parseInt(sslevel4.toString());
        slevel5 = Integer.parseInt(sslevel5.toString());

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
        sciichart.setData(data);
        sciichart.setDescription("");
        sciichart.setDragEnabled(false);
        sciichart.setTouchEnabled(false);
        sciichart.getLegend().setEnabled(false);
        sciichart.getAxisRight().setEnabled(false);
        sciichart.getAxisLeft().setAxisMaxValue(59);
        sciichart.getAxisLeft().setAxisMinValue(0);
    }
    private void sciencegraph(){
        int slevel1 = 0;
        int slevel2 = 0;
        int slevel3 = 0;
        int slevel4 = 0;
        int slevel5 = 0;

        String sslevel1,sslevel2,sslevel3,sslevel4,sslevel5;

        sslevel1 = mPref.getString("Science1Score", "0");
        sslevel2 = mPref.getString("Science2Score", "0");
        sslevel3 = mPref.getString("Science3Score", "0");
        sslevel4 = mPref.getString("Science4Score", "0");
        sslevel5 = mPref.getString("Science5Score", "0");

        slevel1 = Integer.parseInt(sslevel1.toString());
        slevel2 = Integer.parseInt(sslevel2.toString());
        slevel3 = Integer.parseInt(sslevel3.toString());
        slevel4 = Integer.parseInt(sslevel4.toString());
        slevel5 = Integer.parseInt(sslevel5.toString());

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
        schart.setData(data);
        schart.setDescription("");
        schart.setDragEnabled(false);
        schart.setTouchEnabled(false);
        schart.getLegend().setEnabled(false);
        schart.getAxisRight().setEnabled(false);
        schart.getAxisLeft().setAxisMaxValue(59);
        schart.getAxisLeft().setAxisMinValue(0);
    }

    private void tichartgraph(){
        int tlevel1 = 0;
        int tlevel2 = 0;
        int tlevel3 = 0;
        int tlevel4 = 0;
        int tlevel5 = 0;

        String stlevel1,stlevel2,stlevel3,stlevel4,stlevel5;

        stlevel1 = mPref.getString("Tech1Score", "0");
        stlevel2 = mPref.getString("Tech2Score", "0");
        stlevel3 = mPref.getString("Tech3Score", "0");
        stlevel4 = mPref.getString("Tech4Score", "0");
        stlevel5 = mPref.getString("Tech5Score", "0");

        tlevel1 = Integer.parseInt(stlevel1.toString());
        tlevel2 = Integer.parseInt(stlevel2.toString());
        tlevel3 = Integer.parseInt(stlevel3.toString());
        tlevel4 = Integer.parseInt(stlevel4.toString());
        tlevel5 = Integer.parseInt(stlevel5.toString());

        //Graph content
        ArrayList<BarEntry> barEntries = new ArrayList<>();
        barEntries.add(new BarEntry(tlevel1,0));
        barEntries.add(new BarEntry(tlevel2,1));
        barEntries.add(new BarEntry(tlevel3,2));
        barEntries.add(new BarEntry(tlevel4,3));
        barEntries.add(new BarEntry(tlevel5,4));
        BarDataSet barDataSet = new BarDataSet(barEntries,"Levels");

        //Graph top label
        ArrayList<String> levels = new ArrayList<>();
        levels.add("Lvl 1");
        levels.add("Lvl 2");
        levels.add("Lvl 3");
        levels.add("Lvl 4");
        levels.add("Lvl 5");

        BarData data = new BarData(levels,barDataSet);
        tichart.setData(data);
        tichart.setDescription("");
        tichart.setDragEnabled(false);
        tichart.setTouchEnabled(false);
        tichart.getLegend().setEnabled(false);
        tichart.getAxisRight().setEnabled(false);
        tichart.getAxisLeft().setAxisMaxValue(59);
        tichart.getAxisLeft().setAxisMinValue(0);
    }
    private void techgraph(){
        int tlevel1 = 0;
        int tlevel2 = 0;
        int tlevel3 = 0;
        int tlevel4 = 0;
        int tlevel5 = 0;

        String stlevel1,stlevel2,stlevel3,stlevel4,stlevel5;

        stlevel1 = mPref.getString("TechB1Score", "0");
        stlevel2 = mPref.getString("TechB2Score", "0");
        stlevel3 = mPref.getString("TechB3Score", "0");
        stlevel4 = mPref.getString("TechB4Score", "0");
        stlevel5 = mPref.getString("TechB5Score", "0");

        tlevel1 = Integer.parseInt(stlevel1.toString());
        tlevel2 = Integer.parseInt(stlevel2.toString());
        tlevel3 = Integer.parseInt(stlevel3.toString());
        tlevel4 = Integer.parseInt(stlevel4.toString());
        tlevel5 = Integer.parseInt(stlevel5.toString());

        //Graph content
        ArrayList<BarEntry> barEntries = new ArrayList<>();
        barEntries.add(new BarEntry(tlevel1,0));
        barEntries.add(new BarEntry(tlevel2,1));
        barEntries.add(new BarEntry(tlevel3,2));
        barEntries.add(new BarEntry(tlevel4,3));
        barEntries.add(new BarEntry(tlevel5,4));
        BarDataSet barDataSet = new BarDataSet(barEntries,"Levels");

        //Graph top label
        ArrayList<String> levels = new ArrayList<>();
        levels.add("Lvl 1");
        levels.add("Lvl 2");
        levels.add("Lvl 3");
        levels.add("Lvl 4");
        levels.add("Lvl 5");

        BarData data = new BarData(levels,barDataSet);
        tchart.setData(data);
        tchart.setDescription("");
        tchart.setDragEnabled(false);
        tchart.setTouchEnabled(false);
        tchart.getLegend().setEnabled(false);
        tchart.getAxisRight().setEnabled(false);
        tchart.getAxisLeft().setAxisMaxValue(59);
        tchart.getAxisLeft().setAxisMinValue(0);
    }


    public void onBackPressed() {

    }
}
