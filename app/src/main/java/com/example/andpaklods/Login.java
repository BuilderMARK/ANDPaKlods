package com.example.andpaklods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Login extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        Button login = findViewById(R.id.Login);
        Button signUp = findViewById(R.id.SignUP);
        login.setOnClickListener(this);
        signUp.setOnClickListener(this);
    }


//On click skifter view her, og det gør den ved en switch, Kig startActivity
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.Login:
                startActivity(new Intent(this,Items.class));
                Toast.makeText(this, "Login",Toast.LENGTH_SHORT).show();
                break;
            case R.id.SignUP:
                startActivity(new Intent(this,SignUp.class));
                Toast.makeText(this, "Signup",Toast.LENGTH_SHORT).show();

        }
    }
}