package com.thoughtworks.china.mobile.varval;

public class ValVar {

    private String phase;
    private static final String mobileOpenDay = "Mobile Open Day";
    private String topics = "《三生三世iOS布局》\n"
            + "《移动测试的Mock实践》\n"
            + "《Getting Start with Kotlin on Android》";

    public static void main(String[] args) {
        ValVar valVar = new ValVar();
        valVar.phase = "4th";
        System.out.println("Welcome to "
                + mobileOpenDay
                + " "
                + valVar.phase);
        System.out.println(String.format("Welcome to %s %s",
                mobileOpenDay, valVar.phase));
        System.out.println(valVar.topics);
    }
}
