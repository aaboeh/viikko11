package com.example.notes;

import java.util.ArrayList;

public class ListGrocery {
    private static ListGrocery groceryList = null;
    private ArrayList<Grocery> groceries = new ArrayList<>();

    public static ListGrocery getInstance() {
        if (groceryList == null) {
            groceryList = new ListGrocery();
        }
        return groceryList;
    }

    public ArrayList<Grocery> getGroceries() {
        return groceries;
    }

    public void addGrocery(Grocery grocery) {
        groceries.add(grocery);
    }


}
