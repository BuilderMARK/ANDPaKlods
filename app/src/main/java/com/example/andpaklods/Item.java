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

    public String getInfo() {
        return Info;
    }

    public void setInfo(String info) {
        Info = info;
    }

    public String getCatagory() {
        return Catagory;
    }

    public void setCatagory(String catagory) {
        Catagory = catagory;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }
}