package com.example.trial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ScorePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_page);

        TextView scoring = findViewById(R.id.scoreText);
        TextView comment = findViewById(R.id.scoreCommentText);

        int score = getIntent().getIntExtra("RIGHT_ANSWER_COUNT", 0);

        if (score > 3) {
            comment.setText("YOU'RE A STAR!");
            scoring.setText(score + " " + "/10");
            // showing correctness
        }
        else {
            comment.setText("YOU CAN DO BETTER!");
            scoring.setText(score + " " + "/10");
        }
    }
}