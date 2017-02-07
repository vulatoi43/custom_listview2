package com.example.thanhvu.custom_listview2.model;

public class Contact {
    private String mName;
    private int mColor;
    private String mNumber;

    public int getmColor() {
        return mColor;
    }

    public void setmColor(int mColor) {
        this.mColor = mColor;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmNumber() {
        return mNumber;
    }

    public void setmNumber(String mNumber) {
        this.mNumber = mNumber;
    }

    public Contact(String mName, int mColor, String mNumber) {
        this.mName = mName;
        this.mColor = mColor;
        this.mNumber = mNumber;
    }
}
