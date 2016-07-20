package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
    }

    /**
     * Called when the user touches the Team A +3 button
     */
    public void addThreeForTeamA(View view) {
        // Set score to 3 in response to button click
        scoreTeamA = scoreTeamA + 3;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Called when the user touches the Team A +2 button
     */
    public void addTwoForTeamA(View view) {
        // Set score to 2 in response to button click
        scoreTeamA = scoreTeamA + 2;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Called when the user touches the Team A Free throw button
     */
    public void addOneForTeamA(View view) {
        // Set score to 1 in response to button click
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Called when the user touches the Team B +3 button
     */
    public void addThreeForTeamB(View view) {
        // Set score to 3 in response to button click
        scoreTeamB = scoreTeamB + 3;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Called when the user touches the Team B +2 button
     */
    public void addTwoForTeamB(View view) {
        // Set score to 2 in response to button click
        scoreTeamB = scoreTeamB + 2;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Called when the user touches the Team A Free throw button
     */
    public void addOneForTeamB(View view) {
        // Set score to 1 in response to button click
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Called when the user touches the Reset button
     */
    public void resetTeamScores(View view) {
        // Set Team A & Team B scores to 0 in response to button click
        scoreTeamA = 0;
        displayForTeamA(scoreTeamA);

        scoreTeamB = 0;
        displayForTeamB(scoreTeamB);
    }

}
