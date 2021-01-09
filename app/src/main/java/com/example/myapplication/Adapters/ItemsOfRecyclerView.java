package com.example.myapplication.Adapters;

import com.example.myapplication.Adapters.RecyclerInterface;

public class ItemsOfRecyclerView {
    private String nameOfChar;
    private String famnousName;
    private int  imageView;
    private String attrbuteName;

    public ItemsOfRecyclerView(String attrbuteName) {
        this.attrbuteName = attrbuteName;
    }

    public String getAttrbuteName() {
        return attrbuteName;
    }

    public void setAttrbuteName(String attrbuteName) {
        this.attrbuteName = attrbuteName;
    }

    public ItemsOfRecyclerView(String nameOfChar, String famnousName, int imageView) {
        this.nameOfChar = nameOfChar;
        this.famnousName = famnousName;
        this.imageView = imageView;
    }

    public String getFamnousName() {
        return famnousName;
    }

    public void setFamnousName(String famnousName) {
        this.famnousName = famnousName;
    }

    public int getImageView() {
        return imageView;
    }

    public void setImageView(int imageView) {
        this.imageView = imageView;
    }

    public String getNameOfChar() {
        return nameOfChar;
    }

    public void setNameOfChar(String nameOfChar) {
        this.nameOfChar = nameOfChar;
    }
}
