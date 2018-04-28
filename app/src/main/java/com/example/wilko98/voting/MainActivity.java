package com.example.wilko98.voting;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button logIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView signIn=(TextView)findViewById(R.id.signIn);
        signIn.setMovementMethod(LinkMovementMethod.getInstance());

        TextView forgotPass=(TextView)findViewById(R.id.ForgotPass);
        forgotPass.setMovementMethod(LinkMovementMethod.getInstance());

        logIn=(Button)findViewById(R.id.LogIn);
        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
                Toast.makeText(MainActivity.this,"Вы вошли !!!",Toast.LENGTH_LONG).show();
            }
        });
    }
    public void openActivity2(){
        Intent intent=new Intent(this,Main2Activity.class);
        startActivity(intent);
    }

}
