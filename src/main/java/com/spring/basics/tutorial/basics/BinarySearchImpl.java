package com.spring.basics.tutorial.basics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearchImpl
{

    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Autowired
    private ISortAlgorithm m_sort_algorithm;

    @PostConstruct
    public void BeanConstruction()
    {
        logger.info("BeanConstruction starting postConstruct");
    }

    @PreDestroy
    public void BeanDestruction()
    {
        logger.info("Bean Destruction starting preDestroy");
    }

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
