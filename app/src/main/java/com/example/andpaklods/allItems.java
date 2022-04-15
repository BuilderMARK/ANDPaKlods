package com.example.andpaklods;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class allItems extends AppCompatActivity {

    RecyclerView carRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_items);
        carRecyclerView = findViewById(R.id.rvAllItem);
        carRecyclerView.hasFixedSize();
        carRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        List<Item> itemPost = new ArrayList<>();
        itemPost.add(new Item("Testinfo 1","TestCategory1","TestProductName1","TestPrice1"));
        itemPost.add(new Item("Testinfo 2","TestCategory2","TestProductName2","TestPrice2"));
        itemPost.add(new Item("Testinfo 3","TestCategory3","TestProductName3","TestPrice3"));
        itemPost.add(new Item("Testinfo 4","TestCategory4","TestProductName4","TestPrice4"));
        itemPost.add(new Item("Testinfo 5","TestCategory5","TestProductName5","TestPrice5"));
        CarAdapter adapter = new CarAdapter(itemPost);
        carRecyclerView.setAdapter(adapter);

    }
}