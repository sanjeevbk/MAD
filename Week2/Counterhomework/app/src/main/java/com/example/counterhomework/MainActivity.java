package com.example.counterhomework;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int mcount=0;
    private TextView mShowCount;
    private EditText mMessageEditText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount= (TextView) findViewById(R.id.Show_count);

        // Initialize all the view variables.
        mMessageEditText = findViewById(R.id.editText);
        // Restore the saved state.
        // See onSaveInstanceState() for what gets saved.
        if (savedInstanceState != null) {

            mShowCount.setText(savedInstanceState.getString("reply_text"));
        }
    }
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
            outState.putString("reply_text",mShowCount.getText().toString());

    }


    public void showCount(View view) {
        ++mcount;
        if (mShowCount != null)
            mShowCount.setText(Integer.toString(mcount));


    }
    public void reset(View view) {
        mcount=0;
        mShowCount.setText(Integer.toString(mcount));

    }
}
