package com.example.mynotefirebase;

import com.google.firebase.firestore.Exclude;

import java.security.Timestamp;

public class Note {

    @Exclude
    private String id;
    private Timestamp data;
    private  String content;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Timestamp getData() {
        return data;
    }

    public void setData(Timestamp data) {
        this.data = data;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public com.google.firebase.Timestamp getDate() {
        return null;
    }

    public void setDate(com.google.firebase.Timestamp timestamp) {

    }
}
