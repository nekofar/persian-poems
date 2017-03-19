package com.nekofar.milad.persianpoems.models;

import com.google.gson.annotations.Expose;

public class Verse {

    @Expose
    int id;

    @Expose
    int poemId;

    @Expose
    int order;

    @Expose
    int position;

    @Expose
    String text;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPoemId() {
        return poemId;
    }

    public void setPoemId(int poemId) {
        this.poemId = poemId;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
