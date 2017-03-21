package com.thoughtworks.china.mobile.extension;


public class Test {

    public static void main(String[] args) {
        double value = 2.0f;
        System.out.println(String.format("km: %f\nm: %f\ncm: %f\nmm: %f\nft: %f",
                DoubleExtension.km(value),
                DoubleExtension.m(value),
                DoubleExtension.cm(value),
                DoubleExtension.mm(value),
                DoubleExtension.ft(value)));
    }
}
