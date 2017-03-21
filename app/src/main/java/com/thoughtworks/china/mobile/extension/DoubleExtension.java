package com.thoughtworks.china.mobile.extension;


public class DoubleExtension {

    public static double km(double value) {
        return value * 1000.0;
    }

    public static double m(double value) {
        return value;
    }

    public static double cm(double value) {
        return value / 100.0;
    }

    public static double mm(double value) {
        return value / 1000.0;
    }

    public static double ft(double value) {
        return value / 3.28084;
    }
}
