package com.example.notes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GroceryListAdapter extends RecyclerView.Adapter<GroceryViewHolder> {

    private Context context;

    private ArrayList<Grocery> groceries = new ArrayList<>();
    public GroceryListAdapter(Context context, ArrayList<Grocery> groceries) {
        this.context = context;
        this.groceries = groceries;
    }

    @NonNull
    @Override
    public GroceryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new GroceryViewHolder(LayoutInflater.from(context).inflate(R.layout.grocery_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull GroceryViewHolder holder, int position) {
        holder.textGroceryName.setText(String.valueOf(groceries.get(position).getName()));
        holder.textGroceryNote.setText(String.valueOf(groceries.get(position).getNote()));
        holder.editTextGroceryNote.setText(groceries.get(position).getNote());

        holder.imageDelete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = holder.getAdapterPosition();
                ListGrocery.getInstance().removeGrocery(groceries.get(pos).getName());
                notifyItemRemoved(pos);
            }
        });

        holder.imageEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = holder.getAdapterPosition();
                String name = groceries.get(pos).getName();
                if (holder.editTextGroceryNote.getVisibility() == View.VISIBLE) {
                    Grocery grocery = ListGrocery.getInstance().getGroceryByName(name);
                    grocery.setNote(holder.editTextGroceryNote.getText().toString());
                    holder.editTextGroceryNote.setVisibility(View.GONE);
                    notifyDataSetChanged();
                } else {
                    holder.editTextGroceryNote.setVisibility(View.VISIBLE);
                }
            }
        });

    }

    public int getItemCount() {
        return groceries.size();
    }

}
