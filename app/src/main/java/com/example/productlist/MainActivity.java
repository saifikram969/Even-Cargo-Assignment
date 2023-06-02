package com.example.productlist;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        MyProductData[] myProductData = new MyProductData[]{
                new MyProductData("Rolex","5999$",R.drawable.rolex),
                new MyProductData("Omega","4999$",R.drawable.omega),
                new MyProductData("Titan","99$",R.drawable.titan),
                new MyProductData("Fossil","999$",R.drawable.fossil),
                new MyProductData("Sonata","59$",R.drawable.sonata),
                new MyProductData("Rado","3999$",R.drawable.rado),
                new MyProductData("Armani","2999$",R.drawable.armani),
                new MyProductData("chanel","9999$",R.drawable.chanel),
                new MyProductData("LV","7999$",R.drawable.lv),
                new MyProductData("Monte Carlo","799$",R.drawable.monte),
                new MyProductData("Lacoste","99999$",R.drawable.lacoste),
        };
        MyProductAdapter myProductAdapter = new MyProductAdapter(myProductData,MainActivity.this);
        recyclerView.setAdapter(myProductAdapter);
    }
}