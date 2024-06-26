package com.example.notes;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ListGrocery groceryList;
    private RecyclerView recyclerView;

    private GroceryListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        groceryList = ListGrocery.getInstance();
        adapter = new GroceryListAdapter(getApplicationContext(), groceryList.getGroceries());
        //ArrayList<Grocery> groceries = groceryList.getGroceries();
        recyclerView = findViewById(R.id.rvGroceries);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
        //onResume();

    }

    @Override
    public void onResume() {
        super.onResume();
        adapter.notifyDataSetChanged();
    }

    public void switchToAddGrocery(View view) {
        Intent intent = new Intent(this, AddGroceryActivity.class);
        startActivity(intent);
    }
}
