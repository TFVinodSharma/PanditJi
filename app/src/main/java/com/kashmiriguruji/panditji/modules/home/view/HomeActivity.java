package com.kashmiriguruji.panditji.modules.home.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.kashmiriguruji.panditji.R;
import com.kashmiriguruji.panditji.modules.home.adapter.CategoriesAdapter;
import com.kashmiriguruji.panditji.viewutils.SpacesItemDecoration;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

public class HomeActivity extends AppCompatActivity {
    RecyclerView recyclerViewCategoies;

    public String[] Categories = {"Yagnopavit Sanskar", "Lagan", "Kahnether", "NeevPoojan", "Grahpravesh", "Navgarh Pooja", "Dhaim", "Shiv Ratri Pooja",
            "Birthday Pooja", "Sadmosh", "Varshik", "Kundli Milan","Navratra Path",};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        recyclerViewCategoies = findViewById(R.id.reccylercategory);


        StaggeredGridLayoutManager staggeredGridLayoutManager =
                new StaggeredGridLayoutManager(2, LinearLayoutManager.VERTICAL);
        recyclerViewCategoies.setLayoutManager(staggeredGridLayoutManager);
        recyclerViewCategoies.setAdapter(new CategoriesAdapter(Categories));
        SpacesItemDecoration decoration = new SpacesItemDecoration(12);
        recyclerViewCategoies.addItemDecoration(decoration);


    }
}
