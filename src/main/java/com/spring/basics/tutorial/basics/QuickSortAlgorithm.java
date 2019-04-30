package com.spring.basics.tutorial.basics;

import org.springframework.stereotype.Component;

@Component
public class QuickSortAlgorithm implements ISortAlgorithm {
    @Override
    public int[] sort(int[] numbers) {
        return numbers;
    }
}
