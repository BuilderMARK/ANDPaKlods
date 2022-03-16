package com.example.andpaklods;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class CreateSaleOffer extends AppCompatActivity {
Button createSaleOfferBtn;
EditText productName, Info,Price,Catagory;
DatabaseReference firebaseRefernce;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_sale_offer);

        createSaleOfferBtn.findViewById(R.id.BtnCreate);
        productName.findViewById(R.id.WriteProductName);
        Info.findViewById(R.id.WriteInfo);
        Price.findViewById(R.id.WritePrice);
        Catagory.findViewById(R.id.Writecatagory);
        firebaseRefernce = FirebaseDatabase.getInstance().getReference();



        createSaleOfferBtn.setOnClickListener(view ->
                System.out.println(productName.getText()));
                System.out.println(Info.getText());
                System.out.println(Catagory.getText());
                System.out.println(Price.getText());
                Item item = new Item();
                item.Catagory = Catagory.getText().toString();
                item.Info = Info.getText().toString();
                item.ProductName = productName.getText().toString();
                item.Price = Integer.parseInt(Price.getText().toString());
                firebaseRefernce.child("SaleOffers").child("CreateOfferTest").setValue(item);
    }
}