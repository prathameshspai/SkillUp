package com.example.finalyearproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class DBMS_Activity extends AppCompatActivity {
    RecyclerView dataList;
    List<String> titles;
    List<Integer> images;
    ImgAdapter imgAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dbms);
        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        dataList = findViewById(R.id.dataList);

        titles = new ArrayList<>();
        images = new ArrayList<>();

        titles.add("Introduction\nto DBMS");
        titles.add("Keys and\nRelationships");
        titles.add("SQL\nQueries");
        titles.add("Normalization\nin Database");
        titles.add("Transactions\nand Schedules");
        titles.add("Important\nTopics");

        images.add(R.drawable.dbms_intro_logo);
        images.add(R.drawable.dbms_keys_logo);
        images.add(R.drawable.dbms_sql_logo);
        images.add(R.drawable.dbms_normal_logo);
        images.add(R.drawable.dbms_trans_logo);
        images.add(R.drawable.imp_logo);

        imgAdapter = new ImgAdapter(this,titles,images);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false);
        dataList.setLayoutManager(gridLayoutManager);
        dataList.setAdapter(imgAdapter);
    }
}