package com.example.administrator.divideritemdecoration;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView rv = (RecyclerView)findViewById(R.id.rv);

        rv.setLayoutManager(new GridLayoutManager(this,3));
        rv.addItemDecoration(new DividerGridItemDecoration(this));
        rv.setAdapter(new MainPlanAdapter(this));
    }
}
