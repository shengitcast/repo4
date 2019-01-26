package cn.itcast.domain;

import java.io.Serializable;

public class User implements Serializable {
    private String name;
    private int age;

    public static void main(String[] args) {
        test();
    }

    public static void test() {
        System.out.println("这是一个测试工程");
    }

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
