package me.skrhrasel.recyclerviewproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<ExampleItem> exampleList = new ArrayList<>();
        exampleList.add(new ExampleItem(R.drawable.ic_android,"Line 1","Line 2"));
        exampleList.add(new ExampleItem(R.drawable.ic_audiotrack,"Line 3","Line 4"));
        exampleList.add(new ExampleItem(R.drawable.ic_wb_sunny,"Line 5","Line 6"));
        exampleList.add(new ExampleItem(R.drawable.ic_android,"Line 7","Line 8"));
        exampleList.add(new ExampleItem(R.drawable.ic_audiotrack,"Line 9","Line 10"));
        exampleList.add(new ExampleItem(R.drawable.ic_wb_sunny,"Line 11","Line 12"));
        exampleList.add(new ExampleItem(R.drawable.ic_android,"Line 1","Line 2"));
        exampleList.add(new ExampleItem(R.drawable.ic_audiotrack,"Line 3","Line 4"));
        exampleList.add(new ExampleItem(R.drawable.ic_wb_sunny,"Line 5","Line 6"));
        exampleList.add(new ExampleItem(R.drawable.ic_android,"Line 7","Line 8"));
        exampleList.add(new ExampleItem(R.drawable.ic_audiotrack,"Line 9","Line 10"));
        exampleList.add(new ExampleItem(R.drawable.ic_wb_sunny,"Line 11","Line 12"));
        exampleList.add(new ExampleItem(R.drawable.ic_android,"Line 1","Line 2"));
        exampleList.add(new ExampleItem(R.drawable.ic_audiotrack,"Line 3","Line 4"));
        exampleList.add(new ExampleItem(R.drawable.ic_wb_sunny,"Line 5","Line 6"));
        exampleList.add(new ExampleItem(R.drawable.ic_android,"Line 7","Line 8"));
        exampleList.add(new ExampleItem(R.drawable.ic_audiotrack,"Line 9","Line 10"));
        exampleList.add(new ExampleItem(R.drawable.ic_wb_sunny,"Line 11","Line 12"));
        exampleList.add(new ExampleItem(R.drawable.ic_android,"Line 1","Line 2"));
        exampleList.add(new ExampleItem(R.drawable.ic_audiotrack,"Line 3","Line 4"));
        exampleList.add(new ExampleItem(R.drawable.ic_wb_sunny,"Line 5","Line 6"));
        exampleList.add(new ExampleItem(R.drawable.ic_android,"Line 7","Line 8"));
        exampleList.add(new ExampleItem(R.drawable.ic_audiotrack,"Line 9","Line 10"));
        exampleList.add(new ExampleItem(R.drawable.ic_wb_sunny,"Line 11","Line 12"));
        exampleList.add(new ExampleItem(R.drawable.ic_android,"Line 1","Line 2"));
        exampleList.add(new ExampleItem(R.drawable.ic_audiotrack,"Line 3","Line 4"));
        exampleList.add(new ExampleItem(R.drawable.ic_wb_sunny,"Line 5","Line 6"));
        exampleList.add(new ExampleItem(R.drawable.ic_android,"Line 7","Line 8"));
        exampleList.add(new ExampleItem(R.drawable.ic_audiotrack,"Line 9","Line 10"));
        exampleList.add(new ExampleItem(R.drawable.ic_wb_sunny,"Line 11","Line 12"));

        mRecyclerView = findViewById(R.id.recyclerview);
        mRecyclerView.setHasFixedSize(true);
        mLayoutManager = new LinearLayoutManager(this);
        mAdapter = new ExampleAdapter(exampleList);

        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setAdapter(mAdapter);

    }
}
