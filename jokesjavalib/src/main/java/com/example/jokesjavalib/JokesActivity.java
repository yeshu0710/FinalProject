package com.example.jokesjavalib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokesActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);
        textView=findViewById(R.id.jokesTextview);
        String displayJoke=getIntent().getStringExtra("key");
        textView.setText(displayJoke);
    }
}
