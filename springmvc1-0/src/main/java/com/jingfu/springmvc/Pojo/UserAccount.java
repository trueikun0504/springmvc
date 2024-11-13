package com.jingfu.springmvc.Pojo;

import lombok.Data;

@Data
//public class UserAccount {
//    String username;
//    String password;
//}
public class UserAccount {
    private String username;
    private String password;

    // Getter 和 Setter 方法
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserAccount{username='" + username + "', password='" + password + "'}";
    }
}
