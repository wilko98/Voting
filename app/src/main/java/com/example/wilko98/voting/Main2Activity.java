package com.example.wilko98.voting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends AppCompatActivity {

    Button vote;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        vote=(Button)findViewById(R.id.voting);
        vote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openVoteActivity();
            }
        });

    }
    public void openVoteActivity(){
        Intent intent=new Intent(this,VoteActivity.class);
        startActivity(intent);
    }
}
