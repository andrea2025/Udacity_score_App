package com.example.scoreapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView scoreViewA;
    TextView scoreViewB;
    int scoreA;
    int scoreB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void teamAScore(int score) {
        scoreViewA = findViewById(R.id.team_a_score);
        scoreViewA.setText(String.valueOf(score));
    }

    private void teamBScore(int score) {
        scoreViewB = findViewById(R.id.team_b_score);
        scoreViewB.setText(String.valueOf(score));
    }

    public void teamAFreeThrow(View view) {
        scoreA += 1;
        teamAScore(scoreA);
    }

    public void teamBFreeThrow(View view) {
        scoreB += 1;
        teamBScore(scoreB);

    }

    public void resetScore(View view) {
        scoreA = 0;
        scoreB = 0;
        teamAScore(0);
        teamBScore(0);
    }

    public void teamBPointTwo(View view) {
        scoreB += 2;
        teamBScore(scoreB);
    }

    public void teamBPointThree(View view) {
        scoreB += 3;
        teamBScore(scoreB);
    }

    public void teamAPointTwo(View view) {
        scoreA += 2;
        teamAScore(scoreA);
    }

    public void teamAPointThree(View view) {
        scoreA  += 3;
        teamAScore(scoreA);
    }
}