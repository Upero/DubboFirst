package cn.springb.userBean;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 5873162291440534793L;
    private Integer id;
    private String username;
    private String password;
    private String sex;
    private Integer age;

    @Override
    public String toString() {
        return "username: " + username + ",password: " + password + ",sex: " + sex + ",age: " + age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
