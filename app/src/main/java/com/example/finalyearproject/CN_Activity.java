package com.example.finalyearproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class CN_Activity extends AppCompatActivity {
    RecyclerView dataList;
    List<String> titles;
    List<Integer> images;
    ImgAdapter imgAdapter;
    CNVideo[] cnList;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cn);

        getSupportActionBar().setTitle("");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        dataList = findViewById(R.id.dataList);

        titles = new ArrayList<>();
        images = new ArrayList<>();

        titles.add("Introduction\nand OSI");
        titles.add("Network\nLayer");
        titles.add("Transport\nLayer");
        titles.add("Application\nLayer");
        titles.add("Networking\nHardware");
        titles.add("Important\nTopics");

        images.add(R.drawable.cn_osi_logo);
        images.add(R.drawable.cn_net_logo);
        images.add(R.drawable.cn_transport_logo);
        images.add(R.drawable.cn_appn_logo);
        images.add(R.drawable.cn_hard_logo);
        images.add(R.drawable.imp_logo);

        imgAdapter = new ImgAdapter(this,titles,images);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this,2,GridLayoutManager.VERTICAL,false);
        dataList.setLayoutManager(gridLayoutManager);
        dataList.setAdapter(imgAdapter);


        firebaseDatabase = FirebaseDatabase.getInstance();

        getdata();

        int len = 48;
        cnList = new CNVideo[len];
    }

    private void getdata() {


        databaseReference = firebaseDatabase.getReference("1IL6i76gybxaOxrej-_TBohnaToLffNfgE82_zhOhyBY").child("CN");
        cnList = new CNVideo()
        // calling add value event listener method
        // for getting the values from database.
        databaseReference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                String value = snapshot.getValue(String.class);
                retrieveTV.setText(value);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {
                Toast.makeText(CN_Activity.this, "Fail to get data.", Toast.LENGTH_SHORT).show();
            }
        });
    }
}