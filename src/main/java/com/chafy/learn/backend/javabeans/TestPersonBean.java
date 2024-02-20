package com.chafy.learn.backend.javabeans;

public class TestPersonBean {
    public static void main(String[] args) {
        final PersonBean personBean = new PersonBean();

        personBean.setName("Bread");
        personBean.setDeceased(false);

        System.out.println("Person name is : " + personBean.getName());
        System.out.println("Person is deceased? : " + personBean.isDeceased());

    }
}
