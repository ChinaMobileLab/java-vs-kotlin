package com.thoughtworks.china.mobile.basic;


import static com.google.common.collect.Lists.newArrayList;

public class SessionFactory {

    private static SessionFactory factory = new SessionFactory();

    private SessionFactory() {
    }

    public static SessionFactory getInstance() {
        return factory;
    }

    public Session provideKotlinSession() {
        Session session = new Session();
        session.setTopic("《Getting Start with Kotlin on Android》");
        session.setType("Android");
        session.setSpeakers(newArrayList("Zhang Shuai", "Wang Zhiyong"));
        return session;
    }
}
