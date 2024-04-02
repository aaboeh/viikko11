package com.example.notes;

import java.io.Serializable;

public class Grocery implements Serializable {
    protected String name;
    protected String note;

    public Grocery(String name, String note) {
        this.name = name;
        this.note = note;
    }

    public String getName() {
        return name;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
