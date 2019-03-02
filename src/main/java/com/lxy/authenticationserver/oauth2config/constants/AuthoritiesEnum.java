package com.lxy.authenticationserver.oauth2config.constants;

/**
 * @author: 李雪洋
 * @date: 2019/3/2
 * @description: 权限常量
 */
public enum AuthoritiesEnum {
    ADMIN("ROLE_ADMIN"),
    USER("ROLE_USER"),
    ANONYMOUS("ROLE_ANONYMOUS");

    private String role;

    AuthoritiesEnum(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

}
