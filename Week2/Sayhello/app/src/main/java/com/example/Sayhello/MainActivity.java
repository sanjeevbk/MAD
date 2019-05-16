package com.example.Sayhello;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.Sayhello.extra.MESSAGE";
    public static final String EXTRA_MESSAGE2 = "com.example.Sayhello.extra.MESSAGE2";


    private int mcount = 0;
    private TextView mShowCount;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.Show_count);
    }



    public void show_toast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showCount(View view) {
        ++mcount;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mcount));


    }

    public void launchSecondActivity(View view) {
        Intent intent = new Intent(this, Secondactivity.class);

        String message = "Hello";
        intent.putExtra(EXTRA_MESSAGE,message);
        intent.putExtra(EXTRA_MESSAGE2,mcount);
        startActivity(intent);
    }
}
