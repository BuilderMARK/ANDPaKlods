package com.example.andpaklods;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties

public class Item {
    public String info, category, productName, price;

    public Item(String info, String category, String productName, String price) {
        this.info = info;
        this.category = category;
        this.productName = productName;
        this.price = price;
    }

    public Item() {
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}