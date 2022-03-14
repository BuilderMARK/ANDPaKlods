package com.example.andpaklods;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Items extends AppCompatActivity
{
        private ImageButton MentaBtn, VodkaRedbullBtn, Ol, Cola, Mokai;
        @Override
        protected void onCreate (Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_items);
            MentaBtn.findViewById(R.id.searchImageButtonMenta);
            VodkaRedbullBtn.findViewById(R.id.searchImageButtonVodkaRedbull);
            Ol.findViewById(R.id.searchImageButtonØl);
            Cola.findViewById(R.id.searchImageButtonCola);
            Mokai.findViewById(R.id.searchImageButtonMokai);

            Mokai.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String toast = "";
                    switch (view.getId()) {
                        case R.id.searchImageButtonCola:
                            toast = "Cola";
                            System.out.printf("Cola");
                            break;
                        case R.id.searchImageButtonMenta:
                            toast = "Menta";
                            System.out.printf("Menta");
                            break;
                        case R.id.searchImageButtonMokai:
                            toast = "Mokai";
                            System.out.printf("Mokai");
                            break;
                        case R.id.searchImageButtonVodkaRedbull:
                            toast = "VodkaRedbull";
                            System.out.printf("VodkaRedbull");
                            break;
                        case R.id.searchImageButtonØl:
                            toast = "Øl";
                            System.out.printf("Øl");
                    }
                }

            });
        }}


