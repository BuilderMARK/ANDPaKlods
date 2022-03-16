package com.example.andpaklods;
import com.google.firebase.database.IgnoreExtraProperties;
@IgnoreExtraProperties

public class Item
{
    public String Info, Catagory, ProductName,Price;


    public Item(String info, String catagory, String productName, String price) {
        this.Info = info;
        this.Catagory = catagory;
        this.ProductName = productName;
        this.Price = price;
    }

    public Item() {
        // Default constructor required for calls to DataSnapshot.getValue(Item.class)
    }

}