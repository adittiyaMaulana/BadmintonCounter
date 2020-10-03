package com.example.badmintoncounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private int scoreTeamA = 0;
    private int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //koneksi ke xml
        final TextView teamA = findViewById(R.id.teamA);
        final TextView teamB = findViewById(R.id.teamB);
        Button plusTeamA = findViewById(R.id.plusTeamA);
        Button plusTeamB = findViewById(R.id.plusTeamB);
        Button minusTeamA = findViewById(R.id.minusTeamA);
        Button minusTeamB = findViewById(R.id.minusTeamB);
        Button resetScore = findViewById(R.id.resetScore);

        plusTeamA.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                scoreTeamA += 1;
                teamA.setText(String.valueOf(scoreTeamA));
            }
        });
        plusTeamB.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                scoreTeamB += 1;
                teamB.setText(String.valueOf(scoreTeamB));
            }
        });
        minusTeamA.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                scoreTeamA -= 1;
                if (scoreTeamA < 0)
                {
                    scoreTeamA = 0;
                }
                teamA.setText(String.valueOf(scoreTeamA));
            }
        });
        minusTeamB.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                scoreTeamB -= 1;
                if (scoreTeamB< 0)
                {
                    scoreTeamB = 0;
                }
                teamB.setText(String.valueOf(scoreTeamB));
            }
        });
        resetScore.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v)
            {
                scoreTeamA = 0;
                scoreTeamB = 0;
                teamA.setText(String.valueOf(scoreTeamA));
                teamB.setText(String.valueOf(scoreTeamB));
            }
        });
    }

}