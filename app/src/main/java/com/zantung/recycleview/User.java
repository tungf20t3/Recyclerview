package com.zantung.recycleview;

public class User {
    private int ImageUser;
    private String name;

    public User(int imageUser, String name) {
        ImageUser = imageUser;
        this.name = name;
    }

    public int getImageUser() {
        return ImageUser;
    }

    public void setImageUser(int imageUser) {
        ImageUser = imageUser;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
