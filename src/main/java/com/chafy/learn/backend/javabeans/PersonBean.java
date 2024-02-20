package com.chafy.learn.backend.javabeans;

import java.io.*;

/*
    JavaBeans는 반드시 Serializable 인터페이스를 구현합니다.
 */
public class PersonBean implements Serializable {

    // private으로 필드를 선언합니다.
    private boolean happiness = false;
    private String name = null;

    // JavaBeans를 사용하기 위해서는 기본생성자가 반드시 필요합니다.
    public PersonBean() {
    }

    // Getter와 Setter를 이용하여 private으로 선언된 필드에 public으로 접근할 수 있게 합니다.

    public boolean isHappiness() {
        return happiness;
    }

    public void setHappiness(boolean happiness) {
        this.happiness = happiness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
