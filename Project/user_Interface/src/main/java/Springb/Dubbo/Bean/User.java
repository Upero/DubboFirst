package Springb.Dubbo.Bean;

import java.io.Serializable;

public class User implements Serializable {
    private Integer id;
    private String name;
    private Integer age;
    private String password;
    private String sex;

    @Override
    public String toString() {
        return "{" + "id: " + id + ",name: " + name + ",age: " + age + ",password " + password + ",sex :" + sex + "}";
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
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
}
