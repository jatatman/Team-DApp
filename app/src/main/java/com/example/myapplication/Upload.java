package com.example.myapplication;

public class Upload {
    private String Name;
    private String ImageUrl;

    public Upload() {
        //empty constructor needed

    }

    public Upload(String name, String imageUrl) {
        if(name.trim().equals("")) {
            name = "No Name";
        }

        Name = name;
        ImageUrl = imageUrl;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getImageUrl() {
        return ImageUrl;

    }

    public void setmImageUrl(String imageUrl)
    {
        ImageUrl = imageUrl;
    }
}
