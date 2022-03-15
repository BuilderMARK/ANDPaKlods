package com.example.andpaklods;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Items extends AppCompatActivity implements View.OnClickListener{
    int Mokai = 0;
    int cola = 0;
    int Vodka = 0;
    int ol =0;
    int Menta = 0;
        @Override
        protected void onCreate (Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_items);
            ImageButton button1 = findViewById(R.id.searchImageButtonMokai);
            ImageButton button2 = findViewById(R.id.searchImageButtonCola);
            ImageButton button3 = findViewById(R.id.searchImageButtonØl);
            ImageButton button4 = findViewById(R.id.searchImageButtonMenta);
            ImageButton button5 = findViewById(R.id.searchImageButtonVodkaRedbull);
            button1.setOnClickListener(this);
            button2.setOnClickListener(this);
            button3.setOnClickListener(this);
            button4.setOnClickListener(this);
            button5.setOnClickListener(this);



        }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.searchImageButtonCola:
                cola++;
                Toast.makeText(this, "Antal Cola "+cola,Toast.LENGTH_SHORT).show();
                System.out.printf("Antal Cola" + cola );
                break;
            case R.id.searchImageButtonMenta:
                Menta++;
                Toast.makeText(this, "Antal Menta " + Menta,Toast.LENGTH_SHORT).show();
                System.out.printf("Menta");
                break;
            case R.id.searchImageButtonMokai:
                Mokai++;
                Toast.makeText(this, "Antal Mokai "+Mokai,Toast.LENGTH_SHORT).show();
                System.out.printf("Mokai");
                break;
            case R.id.searchImageButtonVodkaRedbull:
                Vodka++;
                Toast.makeText(this, "Antal VodkaRedbull "+Vodka,Toast.LENGTH_SHORT).show();
                System.out.printf("VodkaRedbull");
                break;
            case R.id.searchImageButtonØl:
                ol++;
                Toast.makeText(this, "antal ØL " + ol,Toast.LENGTH_SHORT).show();
                System.out.printf("ØL");
    }

    }
}


