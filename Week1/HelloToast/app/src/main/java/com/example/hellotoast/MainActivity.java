package com.example.hellotoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mcount=0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.Show_count);
    }

    public void show_toast(View view) {
        Toast toast = Toast.makeText(this,R.string.toast,Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showCount(View view) {
        ++mcount;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mcount));


    }
}
