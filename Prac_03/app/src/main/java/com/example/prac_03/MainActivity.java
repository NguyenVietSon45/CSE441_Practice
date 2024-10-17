package com.example.prac_03;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private CountryAdapter countryAdapter;
    private List<Country> countryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Dữ liệu mẫu
        countryList = new ArrayList<>();
        countryList.add(new Country("China", 1400000000));
        countryList.add(new Country("India", 1380000000));
        // Thêm các quốc gia khác vào đây...

        countryAdapter = new CountryAdapter(countryList, this);
        recyclerView.setAdapter(countryAdapter);
    }
}