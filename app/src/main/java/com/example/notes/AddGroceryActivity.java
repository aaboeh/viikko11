package com.example.notes;

import android.os.Bundle;
import android.widget.EditText;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

public class AddGroceryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_grocery);
    }

    public void addGrocery(View view) {
        EditText editGroceryName = findViewById(R.id.editGroceryName);
        EditText editGroceryNote = findViewById(R.id.editGroceryNote);

        String groceryName = editGroceryName.getText().toString();
        String groceryNote = editGroceryNote.getText().toString();

        Grocery grocery = new Grocery(groceryName, groceryNote);
        ListGrocery.getInstance().addGrocery(grocery);


    }
}
