package com.example.uassalman;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String bintang = "";
        TextView pengulangan = (TextView)
                findViewById(R.id.textView);

        for (int i = 1; i <= 10; i++) {
            String temp = "";

            for (int j = 0; j < i; j++) {
                temp = temp + "* ";
            }
            bintang = bintang + temp + "\n";
        }

        pengulangan.setText(bintang);
    }
}