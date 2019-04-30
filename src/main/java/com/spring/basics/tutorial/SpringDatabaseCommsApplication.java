package com.spring.basics.tutorial;

import com.spring.basics.tutorial.dbcomms.PersonDAO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDatabaseCommsApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringDatabaseCommsApplication.class);

    public static void main(String[] args) {
        //BinarySearchImpl search = new BinarySearchImpl(new QuickSortAlgorithm());
        //int result = search.search(new int[] { 124, 5,2,3,6}, 7);

        ApplicationContext app_context = SpringApplication.run(SpringDatabaseCommsApplication.class, args);
        PersonDAO dao0 = app_context.getBean(PersonDAO.class);

        LOGGER.debug("{}", dao0.getDatabaseConnection());
    }

}
