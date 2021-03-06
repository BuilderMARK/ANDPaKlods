package com.example.andpaklods;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class CreateSaleOffer extends AppCompatActivity implements View.OnClickListener {
    DatabaseReference firebaseRefernce;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_sale_offer);
        Button goToAllItems = findViewById(R.id.BtnCreateSaleGoToAllItems);
        goToAllItems.setOnClickListener(this);
        Button createSaleOfferBtn = findViewById(R.id.BtnCreateSaleOffers);
        EditText productName = findViewById(R.id.WriteProductName);
        EditText Info = findViewById(R.id.WriteInfo);
        EditText Price = findViewById(R.id.WritePrice);
        EditText Category = findViewById(R.id.Writecatagory);
        firebaseRefernce = FirebaseDatabase.getInstance().getReference();

        createSaleOfferBtn.setOnClickListener(view -> {
            Item item = new Item();
            item.category = Category.getText().toString();
            item.info = Info.getText().toString();
            item.productName = productName.getText().toString();
            item.price = Price.getText().toString();
            //Need somekind of ID
            firebaseRefernce.child("SaleOffers").child("CreateOfferTest").setValue(item);

        });
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.BtnCreateSaleGoToAllItems:
                startActivity(new Intent(this, allItems.class));
        }
    }


}