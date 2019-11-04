package com.example.jokesandroidlib;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;

public class JokesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);

        TextView jokeTextVIew = findViewById(R.id.joke_passed_tv);

        Intent intent = getIntent();
        if (intent != null && intent.hasExtra("joke")) {
            String joke = intent.getStringExtra("joke");
            if (!TextUtils.isEmpty(joke)) {
                jokeTextVIew.setText(joke);
            }
        }
    }
}
