package com.spring.basics.tutorial.basics;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BubbleSortAlgorithm implements ISortAlgorithm {
    @Override
    public int[] sort(int[] numbers) {
        return numbers;
    }
}
