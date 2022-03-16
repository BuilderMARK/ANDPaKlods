package com.example.andpaklods;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class CreateSaleOffer extends AppCompatActivity {
DatabaseReference firebaseRefernce;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_sale_offer);

        Button createSaleOfferBtn = findViewById(R.id.BtnCreateSaleOffers);
        EditText productName= findViewById(R.id.WriteProductName);
        EditText Info = findViewById(R.id.WriteInfo);
        EditText Price = findViewById(R.id.WritePrice);
        EditText Catagory = findViewById(R.id.Writecatagory);
        firebaseRefernce = FirebaseDatabase.getInstance().getReference();

        createSaleOfferBtn.setOnClickListener(view ->{
                Item item = new Item();
                item.Catagory = Catagory.getText().toString();
                item.Info = Info.getText().toString();
                item.ProductName = productName.getText().toString();
                item.Price = Price.getText().toString();
                firebaseRefernce.child("SaleOffers").child("CreateOfferTest").setValue(item);
    });
    }
}