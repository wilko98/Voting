package com.example.wilko98.voting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class partyActivity extends AppCompatActivity {

    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_party);
        b=findViewById(R.id.nurotan);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNurotan();
            }
        });
    }
    public void openNurotan(){
        Intent intent=new Intent(this,nurotanActivity.class);
        startActivity(intent);


    }
}
