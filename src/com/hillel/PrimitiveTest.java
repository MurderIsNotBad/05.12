package com.hillel;

public class PrimitiveTest {
    public static void main(String[] args) {

        int age = 15;
        System.out.println("Age before change: " + age);

        changeAge(15);

        System.out.println("Age after change in methom main: " + age);
    }

    private static void changeAge(int age) {
        System.out.println("Age before changeAge: " + age);
        age += 100;
        System.out.println("Age after changeAge: " + age);


    }
}
