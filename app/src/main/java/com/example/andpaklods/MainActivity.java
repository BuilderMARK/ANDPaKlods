package com.example.andpaklods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private Button LoginBtn,CreateSale;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LoginBtn = findViewById(R.id.LoginBtn);
        CreateSale = findViewById(R.id.BtnCreateSale);
        LoginBtn.setOnClickListener(this);
        CreateSale.setOnClickListener(this);
            }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.BtnCreateSale:
                startActivity(new Intent(this,CreateSaleOffer.class));
                break;
            case R.id.LoginBtn:
                startActivity(new Intent(this,SignUp.class));
        }
    }
}