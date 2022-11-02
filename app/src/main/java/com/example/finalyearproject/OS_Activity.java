package com.example.finalyearproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class OS_Activity extends AppCompatActivity {
    RecyclerView dataList;
    List<String> titles;
    List<Integer> images;
    ImgAdapter imgAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_os);

        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        dataList = findViewById(R.id.dataList);

        titles = new ArrayList<>();
        images = new ArrayList<>();

        titles.add("Introduction\nto OS");
        titles.add("Processes\nand Threads");
        titles.add("Process\nScheduling");
        titles.add("Process\nSync");
        titles.add("Memory\nManagement");
        titles.add("Page\nReplacement");
        titles.add("UNIX\nCommands");
        titles.add("Important\nTopics");

        images.add(R.drawable.os_intro_logo);
        images.add(R.drawable.os_process_logo);
        images.add(R.drawable.os_schedule_logo);
        images.add(R.drawable.os_sync_logo);
        images.add(R.drawable.os_memory_logo);
        images.add(R.drawable.os_page_logo);
        images.add(R.drawable.os_command_logo);
        images.add(R.drawable.imp_logo);

        imgAdapter = new ImgAdapter(this,titles,images);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false);
        dataList.setLayoutManager(gridLayoutManager);
        dataList.setAdapter(imgAdapter);
    }
}