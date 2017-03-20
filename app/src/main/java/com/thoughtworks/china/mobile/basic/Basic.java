package com.thoughtworks.china.mobile.basic;


public class Basic {

    public static void main(String[] args) {
        SessionFactory factory = SessionFactory.getInstance();
        System.out.println(factory.provideKotlinSession());

        BasicFunction function = new BasicFunction();
        System.out.println("1+1=" + function.sum(1, 1));
        System.out.println(function.sum(null, 1));
    }
}
