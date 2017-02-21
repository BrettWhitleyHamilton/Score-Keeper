package brettwhitleyhamilton.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int pointsTeamA,pointsTeamB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays the given score for Team A.
     */
    public void touchdownTeamA(View view) {
        final int TOUCHDOWN = 6;
        pointsTeamA=pointsTeamA+TOUCHDOWN;
        displayForTeamA(pointsTeamA);
    }
    public void fieldGoalTeamA(View view) {
        final int FIELD_GOAL= 3;
        pointsTeamA=pointsTeamA+FIELD_GOAL;
        displayForTeamA(pointsTeamA);
    }
    public void patTeamA(View view) {
        final int PAT = 1;
        pointsTeamA=pointsTeamA+PAT;
        displayForTeamA(pointsTeamA);
    }

    public void pointconversion2TeamA(View view) {
        final int POINT_CONVERSION_2 = 2;
        pointsTeamA=pointsTeamA+POINT_CONVERSION_2;
        displayForTeamA(pointsTeamA);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team A.
     */
    public void touchdownTeamB(View view) {
        final int TOUCHDOWN = 6;
        pointsTeamB=pointsTeamB+TOUCHDOWN;
        displayForTeamB(pointsTeamB);
    }
    public void fieldGoalTeamB(View view) {
        final int FIELD_GOAL= 3;
        pointsTeamB=pointsTeamB+FIELD_GOAL;
        displayForTeamB(pointsTeamB);
    }
    public void patTeamB(View view) {
        final int PAT = 1;
        pointsTeamB=pointsTeamB+PAT;
        displayForTeamB(pointsTeamB);
    }
    public void pointconversion2TeamB(View view) {
        final int POINT_CONVERSION_2 = 2;
        pointsTeamB=pointsTeamB+POINT_CONVERSION_2;
        displayForTeamB(pointsTeamB);
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void resetScores(View view) {
        TextView scoreViewa = (TextView) findViewById(R.id.team_a_score);
        TextView scoreViewb = (TextView) findViewById(R.id.team_b_score);
        scoreViewa.setText(String.valueOf(0));
        scoreViewb.setText(String.valueOf(0));
        pointsTeamA=0;
        pointsTeamB=0;
    }

}
