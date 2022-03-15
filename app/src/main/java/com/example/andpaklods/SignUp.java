package com.example.andpaklods;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;

public class SignUp extends AppCompatActivity {
private FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        //Tjekker om der allrede findes en user som er ens
        firebaseAuth = FirebaseAuth.getInstance();
        if (firebaseAuth.getCurrentUser() != null){
            finish();
            return;
        }


        Button button = findViewById(R.id.Login);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                registerUser();
            }
        });
    }

    private void registerUser() {
        EditText editUsername = findViewById(R.id.editTextTextPersonName);
        EditText editPassword = findViewById(R.id.editTextTextPassword);
    }
}