package com.ocelot.scaffold.framework.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

public class Role implements Serializable{

    private int id;
    private String name;
    private LocalDateTime crtTime;

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

    public LocalDateTime getCrtTime() {
        return crtTime;
    }

    public void setCrtTime(LocalDateTime crtTime) {
        this.crtTime = crtTime;
    }
}
