package com.example.Sayhello;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

import static com.example.Sayhello.MainActivity.EXTRA_MESSAGE;
import static com.example.Sayhello.MainActivity.EXTRA_MESSAGE2;

public class Secondactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        int mCount = intent.getIntExtra(EXTRA_MESSAGE2,0);
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);
        TextView countView = findViewById(R.id.textView4);
        countView.setText(Integer.toString(mCount));


    }
}
