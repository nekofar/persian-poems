package com.nekofar.milad.persianpoems.models;

import com.google.gson.annotations.Expose;

public class Poem {

    @Expose
    int id;

    @Expose
    int categoryId;

    @Expose
    String title;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
