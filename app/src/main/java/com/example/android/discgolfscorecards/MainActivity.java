package com.example.android.discgolfscorecards;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.android.discgolfscorecards.R;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;
    int holeA = 1;
    int holeB = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void add1holeA(View v) {
        holeA = holeA + 1;
        displayhole1(holeA);
    }

    public void add1holeB(View v) {
        holeB = holeB + 1;
        displayhole2(holeB);
    }

    public void add1ScoreA(View v) {
        scoreA = scoreA + 1;
        displayScoreA(scoreA);
    }

    public void dec1ScoreA(View v) {
        scoreA = scoreA - 1;
        displayScoreA(scoreA);
    }

    public void add1ScoreB(View v) {
        scoreB = scoreB + 1;
        displayScoreB(scoreB);
    }

    public void dec1ScoreB(View v) {
        scoreB = scoreB - 1;
        displayScoreB(scoreB);
    }

    public void reset(View v) {
        scoreA = 0;
        scoreB = 0;
        holeA = 0;
        holeB = 0;
        displayScoreA(scoreA);
        displayScoreB(scoreB);
        displayhole1(holeA);
        displayhole2(holeB);
    }

    /**
     * Displays the given score for Team A and B.
     */
    public void displayScoreA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayScoreB(int score2) {
        TextView scoreView = (TextView) findViewById(R.id.score2);
        scoreView.setText(String.valueOf(score2));
    }

    /**
     * Displays the given hole for Team A and B.
     */
    public void displayhole1(int hole1) {
        TextView scoreView = (TextView) findViewById(R.id.hole1);
        scoreView.setText(String.valueOf(hole1));
    }

    public void displayhole2(int hole2) {
        TextView scoreView = (TextView) findViewById(R.id.hole2);
        scoreView.setText(String.valueOf(hole2));
    }
}









