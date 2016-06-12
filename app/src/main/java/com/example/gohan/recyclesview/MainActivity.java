package com.example.gohan.recyclesview;

import  android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.test.ApplicationTestCase;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<ListProvider> arrayList= new ArrayList<ListProvider>();
    String[] Name,Capital;
    int[] img_id = {R.drawable.c,R.drawable.a,R.drawable.b};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView= (RecyclerView) findViewById(R.id.recyclerView);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
        Name = getResources().getStringArray(R.array.countryName);
        Capital = getResources().getStringArray(R.array.capital);
        int count = 0;
        for(String NAME:Name)
        {
            ListProvider listProvider=new ListProvider(img_id[count],NAME,Capital[count]);
                arrayList.add(listProvider);
                count++;

        }
        adapter = new RecyclerAdapter(arrayList);
        recyclerView.setAdapter(adapter);
    }


}
