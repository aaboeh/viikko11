package com.example.notes;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class GroceryViewHolder extends RecyclerView.ViewHolder {
    TextView textGroceryName, textGroceryNote;
    ImageView imageDelete, imageEdit;
    EditText editTextGroceryNote;

    public GroceryViewHolder(@NonNull View itemView) {
        super(itemView);
        textGroceryName = itemView.findViewById(R.id.textGroceryName);
        textGroceryNote = itemView.findViewById(R.id.textGroceryNote);
        imageDelete = itemView.findViewById(R.id.imageDelete);
        imageEdit = itemView.findViewById(R.id.imageEdit);
        editTextGroceryNote = itemView.findViewById(R.id.editTextGroceryNote);
    }
}
