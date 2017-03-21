package com.thoughtworks.china.mobile.delegation.java;

interface Base {
    void print();
}

class BaseImpl implements Base {
    private int value;

    public BaseImpl(int value) {
        this.value = value;
    }

    @Override
    public void print() {
        System.out.println(value);
    }
}

class Derived implements Base {
    private BaseImpl base;

    public Derived(BaseImpl base) {
        this.base = base;
    }

    @Override
    public void print() {
        base.print();
    }
}
