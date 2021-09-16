package com.mytest.testgit.entity;

/**
 * @author Cyril.P
 * @description
 * @date 2021-09-16-17:49
 */
public class UserEntity {
    /**
     * 用户名
     */
    private String name;

    /**
     * 年龄
     */
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
