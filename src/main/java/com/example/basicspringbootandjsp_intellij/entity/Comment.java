package com.example.basicspringbootandjsp_intellij.entity;

public class Comment {
    private String name;
    private String comment;

    public Comment() {
    }

    public Comment(String name, String comment) {
        this.name = name;
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public String getComment() {
        return comment;
    }
}
