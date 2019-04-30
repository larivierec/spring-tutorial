package com.spring.basics.tutorial.basics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BinarySearchImpl
{

    @Autowired
    private ISortAlgorithm m_sort_algorithm;

    public BinarySearchImpl(ISortAlgorithm algo)
    {
        super();
        this.m_sort_algorithm = algo;
    }

    public int search(int[] numbers, int number_to_search)
    {
        int[] sorted = m_sort_algorithm.sort(numbers);
        return sorted[1];
    }

    public void setSortAlgorithm(ISortAlgorithm m_sort_algorithm) {
        this.m_sort_algorithm = m_sort_algorithm;
    }
}
