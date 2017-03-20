package com.thoughtworks.china.mobile.basic;


public class Basic {

    public static void main(String[] args) {
        SessionFactory factory = SessionFactory.getInstance();
        System.out.println(factory.provideKotlinSession());
    }
}
