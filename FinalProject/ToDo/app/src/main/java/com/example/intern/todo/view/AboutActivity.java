package com.example.intern.todo.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.widget.TextView;

import com.example.intern.todo.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AboutActivity extends AppCompatActivity {

    @BindView(R.id.repo)
    TextView repoLink;

    @BindView(R.id.github)
    TextView github;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ButterKnife.bind(this);


        Intent intent = getIntent();

        Linkify.addLinks(repoLink, Linkify.ALL);
        Linkify.addLinks(github, Linkify.ALL);



    }
}
