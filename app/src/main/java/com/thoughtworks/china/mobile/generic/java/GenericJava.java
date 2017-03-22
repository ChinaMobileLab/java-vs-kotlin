package com.thoughtworks.china.mobile.generic.java;

import java.util.ArrayList;
import java.util.List;

public class GenericJava {

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>();
        List<? extends CharSequence> charSequences = strings;

    }

    private static void arrays() {
        String[] strings = new String[]{"a"};
        CharSequence[] charSequences = strings;


        charSequences[0] = new StringBuffer("abc");
    }

    public <T> void addAll(List<? super T> to,
                           List<? extends T> from) {
        to.addAll(from);
    }


}
