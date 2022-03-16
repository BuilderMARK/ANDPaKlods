package com.example.andpaklods;

public class Item {
    public String Info, Catagory, ProductName;
    public int Price;

    public Item(String info, String catagory, String productName, int price) {
        this.Info = info;
        this.Catagory = catagory;
        this.ProductName = productName;
        this.Price = price;
    }

    public Item() {
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

    public int getPrice() {
        return Price;
    }

    public void setPrice(int price) {
        Price = price;
    }
}