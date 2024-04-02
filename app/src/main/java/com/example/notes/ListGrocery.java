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

    public Grocery getGroceryByName(String name) {
        int i = 0;
        for (Grocery g : groceries) {
            if (g.getName().equals(name)) {
                return g;
            }
            i++;
        }
        return null;
    }

    public void removeGrocery(String name) {
        int i = 0;
        for (Grocery g : groceries) {
            if(g.getName().equals(name)) {
                break;
            }
            i++;
        }
        groceries.remove(i);
    }


}
