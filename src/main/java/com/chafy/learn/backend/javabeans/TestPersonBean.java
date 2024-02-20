package com.chafy.learn.backend.javabeans;

public class TestPersonBean {
    public static void main(String[] args) {
        final PersonBean personBean = new PersonBean();

        // Setter를 이용하여 이름과 행복여부를 저장합니다.
        personBean.setName("Bread");
        personBean.setHappiness(true);

        // Getter를 이용하여 저장된 데이터를 출력합니다.
        System.out.println("Person name is : " + personBean.getName());
        System.out.println("Are you happy? : " + personBean.isHappiness());

    }
}
