package com.ocelot.scaffold.framework.entity.status;

public enum UserStatus implements IntEnum<UserStatus>{

    /** 无效*/
    DISABLED(0),
    /** 有效 */
    AVAILABLE(1);

    private int status;

    UserStatus(int status){
        this.status = status;
    }

    @Override
    public int getIntValue() {
        return status;
    }
}

