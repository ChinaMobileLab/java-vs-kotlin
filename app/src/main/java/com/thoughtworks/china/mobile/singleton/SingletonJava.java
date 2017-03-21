package com.thoughtworks.china.mobile.singleton;

class SingletonImpl1 {
    private static final SingletonImpl1 INSTANCE = new SingletonImpl1();

    private SingletonImpl1() {
    }

    public static SingletonImpl1 getInstance() {
        return INSTANCE;
    }
}

class SingletonImpl2 {
    private volatile static SingletonImpl2 instance;

    private SingletonImpl2() {
    }

    public static SingletonImpl2 getInstance() {
        if (instance == null) {
            synchronized (SingletonImpl2.class) {
                if (instance == null)
                    instance = new SingletonImpl2();
            }
        }
        return instance;
    }
}

class SingletonImpl3 {
    private static class InstanceHolder {
        static SingletonImpl3 instance = new SingletonImpl3();
    }

    private SingletonImpl3() {
    }

    public static SingletonImpl3 getInstance() {
        return InstanceHolder.instance;
    }
}

enum SingletonImpl4 {
    INSTANCE;
}
