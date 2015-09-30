package com.ocelot.scaffold.framework.entity.view;

import java.time.LocalDateTime;

public class RoleView {

    private String name;
    private LocalDateTime crtTime;

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
