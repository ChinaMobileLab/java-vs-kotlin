package com.thoughtworks.china.mobile.collection;


import com.google.common.base.Function;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;

import java.util.ArrayList;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

public class Collections {

    public static void main(String[] args) {
        List<Integer> integers = newArrayList(1, 2, 3);
        integers.add(4);
        System.out.println(integers);

        ArrayList<Integer> range = newArrayList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        FluentIterable<Integer> temps = FluentIterable.from(range)
                .filter(new Predicate<Integer>() {
                    @Override
                    public boolean apply(Integer input) {
                        return input % 2 == 1;
                    }
                })
                .transform(new Function<Integer, Integer>() {
                    @Override
                    public Integer apply(Integer input) {
                        return input * input;
                    }
                });
        int sum = 0;
        for (int temp : temps) {
            sum += temp;
        }
        System.out.println(sum);
    }
}
