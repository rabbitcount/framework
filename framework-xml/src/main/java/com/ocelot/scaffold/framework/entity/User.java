package com.ocelot.scaffold.framework.entity;

import com.ocelot.scaffold.framework.entity.status.UserStatus;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class User implements Serializable {


    private int id;
    private String name;
    private UserStatus status;
    private LocalDate createDate;
    private BigDecimal money;

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

    public void setStatus(UserStatus status) { this.status = status; }

    public UserStatus getStatus() {
        return status;
    }

    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

}
