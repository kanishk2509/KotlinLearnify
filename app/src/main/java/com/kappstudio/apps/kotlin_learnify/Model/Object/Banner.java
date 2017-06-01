package com.kappstudio.apps.kotlin_learnify.Model.Object;

/**
 * Created by kanishk on 1/6/17.
 */

public class Banner {
    private String title;
    private String description;
    private String imagePath;

    public Banner(String title, String description, String imagePath) {
        this.title = title;
        this.description = description;
        this.imagePath = imagePath;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getImagePath() {
        return imagePath;
    }
}
