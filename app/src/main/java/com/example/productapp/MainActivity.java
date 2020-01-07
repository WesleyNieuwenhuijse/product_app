package com.example.productapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements ProductRecyclerViewAdapter.ItemClickListener{

    ProductRecyclerViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // data to populate the RecyclerView with
        ArrayList<String> productNames = new ArrayList<>();
            productNames.add("Coke");
            productNames.add("Pepsi");
            productNames.add("Fanta orange");
            productNames.add("Fanta cassis");
            productNames.add("Grolsch");
            productNames.add("Heineken");
            productNames.add("Amstel");
            productNames.add("Bavaria");
            productNames.add("Kornuit");
            productNames.add("Cornet");
            productNames.add("La chouffe");
            productNames.add("Duvel");
            productNames.add("Spa blauw");
            productNames.add("Spa rood");
            productNames.add("Spa geel");
            productNames.add("Spa paars");

        // set up the RecyclerView
        RecyclerView recyclerView = findViewById(R.id.rvProducts);
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new ProductRecyclerViewAdapter(this, productNames);
            adapter.setClickListener(this);
            recyclerView.setAdapter(adapter);
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "You clicked " + adapter.getItem(position) + " on row number " + position, Toast.LENGTH_SHORT).show();
    }
}
