package com.example.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
RecyclerView rv;
String[] titre;
String[] soust;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rv = findViewById(R.id.RecyckeV);
        titre = getResources().getStringArray(R.array.titre);
        soust = getResources().getStringArray(R.array.stit);
        ListAdapter ad;
        Integer[] img ={R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,R.drawable.img5,R.drawable.img6,R.drawable.img7};

        ad = new ListAdapter(MainActivity.this,titre,soust,img);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(ad);


    }
}