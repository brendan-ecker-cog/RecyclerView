package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    RecyclerView recView;
    String[] sports = new String[]{"Basketball", "Soccer", "Football", "Tennis", "Golf", "Baseball", "Swimming", "Running", "Skiing", "Hockey"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recView = findViewById(R.id.recyclerView);
        int gridCount = getResources().getInteger(R.integer.gridCount);
        recView.setLayoutManager(new GridLayoutManager(this, gridCount));
        ViewAdapter adapter = new ViewAdapter(sports);
        recView.setAdapter(adapter);
    }
}