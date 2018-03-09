package com.example.android.fitbit.model;

/**
 * Created by PCB on 3/8/2018.
 */

public class Set {
    private String setName;
    private String setDay;
    private String author;
    private int setImage;

    //CTOR
    public Set(String setName, String setDay, String author, int setImage) {
        this.setName = setName;
        this.setDay = setDay;
        this.author = author;
        this.setImage = setImage;

    }

    //SETTERS
    public void setSetName(String setName) {
        this.setName = setName;
    }

    public void setSetDay(String setDay) {
        this.setDay = setDay;
    }
    public void setSetImage(int setImage) {
        this.setImage = setImage;
    }
    public void setAuthor(String author) {
        this.author = author;
    }


    //GETTERS

    public String getSetName() {
        return setName;
    }

    public String getSetDay() {
        return setDay;
    }

    public String getAuthor() {
        return author;
    }
    public int getSetImage() {
        return setImage;
    }
}
