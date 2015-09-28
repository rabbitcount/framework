package com.ocelot.scaffold.framework.entity;

import com.ocelot.scaffold.framework.entity.status.UserStatus;

import java.io.Serializable;

public class User implements Serializable {
    private int id;
    private String name;
    private UserStatus status;

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

    public UserStatus getUserStatus(){ return this.status; }

    public void setStatus(UserStatus status) { this.status = status; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

//        if (id != null ? !id.equals(user.id) : user.id != null) return false;
        if(id != user.id) return false;
        return true;
    }

    @Override
    public int hashCode() {
//        return id != null ? id.hashCode() : 0;
        return super.hashCode();
    }
}
