package com.streamliners.scrollingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        b=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(R.layout.activity_main);
        setupLink();
    }

    private void setupLink() {
        b.article.setMovementMethod(LinkMovementMethod.getInstance());
    }
}