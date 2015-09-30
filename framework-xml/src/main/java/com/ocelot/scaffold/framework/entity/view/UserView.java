package com.ocelot.scaffold.framework.entity.view;

import com.ocelot.scaffold.framework.entity.Role;

import java.time.LocalDate;
import java.util.List;

public class UserView {

    private int id;
    private String userName;
    private LocalDate crtDate;
    private List<RoleView> roleViews;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public LocalDate getCrtDate() {
        return crtDate;
    }

    public void setCrtDate(LocalDate crtDate) {
        this.crtDate = crtDate;
    }

    public List<RoleView> getRoleViews() {
        return roleViews;
    }

    public void setRoleViews(List<RoleView> roleViews) {
        this.roleViews = roleViews;
    }
}
