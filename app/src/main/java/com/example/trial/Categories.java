package com.example.trial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Categories extends AppCompatActivity {

    Button AnimalBtn, MathBtn, SpellingBtn, TimeBtn, RandomBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categories);

        AnimalBtn = findViewById(R.id.animal_btn);
        MathBtn = findViewById(R.id.number_btn);
        SpellingBtn = findViewById(R.id.spelling_btn);
        TimeBtn = findViewById(R.id.time_btn);


        AnimalBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Categories.this, Animals_Level1.class));
            }
        });

    }
}