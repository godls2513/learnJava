package com.chafy.learn.backend.javabeans;

import java.io.*;

public class PersonBean implements Serializable {
    private boolean deceased = false;
    private String name = null;

    public PersonBean() {
    }

    public boolean isDeceased() {
        return deceased;
    }

    public void setDeceased(boolean deceased) {
        this.deceased = deceased;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
