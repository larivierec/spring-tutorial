package com.spring.basics.tutorial;

import com.spring.basics.tutorial.basics.BinarySearchImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBinarySearchApplication {

    public static void main(String[] args) {
        //BinarySearchImpl search = new BinarySearchImpl(new QuickSortAlgorithm());
        //int result = search.search(new int[] { 124, 5,2,3,6}, 7);

        ApplicationContext app_context = SpringApplication.run(SpringBinarySearchApplication.class, args);
        BinarySearchImpl search = app_context.getBean(BinarySearchImpl.class);
        BinarySearchImpl search1 = app_context.getBean(BinarySearchImpl.class);

        System.out.println(search);
        System.out.println(search1);

        int result = search.search(new int[] { 125, 5,2,6,88}, 7);
        System.out.println(result);
    }

}
