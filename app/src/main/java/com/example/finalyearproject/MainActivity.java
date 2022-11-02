package com.example.finalyearproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView dataList;
    List<String> titles;
    List<Integer> images;
    ImgAdapter imgAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        dataList = findViewById(R.id.dataList);

        titles = new ArrayList<>();
        images = new ArrayList<>();

        titles.add("Computer\nNetworks");
        titles.add("DBMS &\nSQL");
        titles.add("Operating\nSystem");
        titles.add("OOPS\nConcepts");

        images.add(R.drawable.cn_logo);
        images.add(R.drawable.dbms_logo);
        images.add(R.drawable.os_logo);
        images.add(R.drawable.oops_logo);

        imgAdapter = new ImgAdapter(this,titles,images);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false);
        dataList.setLayoutManager(gridLayoutManager);
        dataList.setAdapter(imgAdapter);
    }
}