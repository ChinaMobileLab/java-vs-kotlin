package com.thoughtworks.china.mobile.basic;

public class BasicFunction {

    public int sum(int a, int b) {
        return a + b;
    }

    public Integer sum(Integer a, Integer b) {
        if (a == null) {
            throw new IllegalArgumentException("a == null");
        }
        if (b == null) {
            throw new IllegalArgumentException("b == null");
        }
        return a + b;
    }
}
