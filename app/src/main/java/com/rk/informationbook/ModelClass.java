package com.rk.informationbook;

public class ModelClass {

    private String imageNmme;
    private String categoryName;

    public ModelClass(String imageNmme, String categoryName) {
        this.imageNmme = imageNmme;
        this.categoryName = categoryName;
    }

    public String getImageNmme() {
        return imageNmme;
    }

    public String getCategoryName() {
        return categoryName;
    }
}
