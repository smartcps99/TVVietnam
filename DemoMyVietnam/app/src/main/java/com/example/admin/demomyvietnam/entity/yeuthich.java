package com.example.admin.demomyvietnam.entity;

public class yeuthich {
    private int id;
    private int likeid;

    public yeuthich(int id, String likeid) {
    }

    public yeuthich(int id, int likeid) {
        this.id = id;
        this.likeid = likeid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLikeid() {
        return likeid;
    }

    public void setLikeid(int likeid) {
        this.likeid = likeid;
    }
}
