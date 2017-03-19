package com.nekofar.milad.persianpoems.models;

import com.google.gson.annotations.Expose;

public class Poet {

    @Expose
    int id;

    @Expose
    int categoryId;

    @Expose
    String name;

    @Expose
    String description;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
