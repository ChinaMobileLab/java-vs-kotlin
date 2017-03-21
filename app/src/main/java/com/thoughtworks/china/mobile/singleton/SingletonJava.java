package com.thoughtworks.china.mobile.singleton;

class SingleTonImpl1 {
    private static final SingleTonImpl1 INSTANCE = new SingleTonImpl1();

    private SingleTonImpl1() {
    }

    public SingleTonImpl1 getInstance() {
        return INSTANCE;
    }
}

class SingleTonImpl2 {
    private volatile static SingleTonImpl2 instance;

    private SingleTonImpl2() {
    }

    public SingleTonImpl2 getInstance() {
        if (instance == null) {
            synchronized (SingleTonImpl2.class) {
                if (instance == null)
                    instance = new SingleTonImpl2();
            }
        }
        return instance;
    }
}

class SingleTonImpl3 {
    private static class InstanceHolder {
        static SingleTonImpl3 instance = new SingleTonImpl3();
    }

    private SingleTonImpl3() {
    }

    public SingleTonImpl3 getInstance() {
        return InstanceHolder.instance;
    }
}

enum SingleTonImpl4 {
    INSTANCE;
}
