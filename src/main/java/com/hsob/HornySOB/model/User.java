package com.hsob.HornySOB.model;

import org.bson.json.JsonObject;
import org.springframework.data.annotation.Id;

public class User {
    private int id;
    private String name;
    private String list;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }
}
