package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreCountA = 0;
    int scoreCountB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayteamA(int num) {
        TextView t1 = (TextView) findViewById(R.id.teamA_score);
        t1.setText("" + num);
    }

    public void displayteamB(int no) {
        TextView t2 = (TextView) findViewById(R.id.teamB_score);
        t2.setText("" + no);
    }

    public void threePoints(View view) {
        scoreCountA += 3;
        displayteamA(scoreCountA);
    }

    public void twoPoints(View view) {
        scoreCountA += 2;
        displayteamA(scoreCountA);
    }

    public void freeThrow(View view) {
        scoreCountA += 1;
        displayteamA(scoreCountA);
    }

    public void threePoints_teamB(View view) {
        scoreCountB += 3;
        displayteamB(scoreCountB);
    }

    public void twoPoints_teamB(View view) {
        scoreCountA += 2;
        displayteamB(scoreCountA);
    }

    public void freeThrow_teamB(View view) {
        scoreCountA += 1;
        displayteamB(scoreCountA);
    }

    //reset button code
    public void reset(View view) {
        scoreCountA = 0;
        scoreCountB = 0;
        displayteamA(scoreCountA);
        displayteamB(scoreCountB);
    }


}