package com.example.customizedarrayadapter.Models;

public class HumanModel {
    private String name ;
    private int avatarReference;

    public HumanModel(String name, int avatarReference) {
        this.name = name;
        this.avatarReference = avatarReference;
    }

    public String getName() {
        return name;
    }

    public int getAvatarReference() {
        return avatarReference;
    }




}
