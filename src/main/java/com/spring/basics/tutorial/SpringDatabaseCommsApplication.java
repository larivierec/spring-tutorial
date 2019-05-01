package com.spring.basics.tutorial;

import com.spring.basics.tutorial.dbcomms.PersonDAO;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring.basics.tutorial.dbcomms")
public class SpringDatabaseCommsApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringDatabaseCommsApplication.class);

    public static void main(String[] args) {
        ApplicationContext app_context = new AnnotationConfigApplicationContext(SpringDatabaseCommsApplication.class);
        PersonDAO dao0 = app_context.getBean(PersonDAO.class);
        PersonDAO dao1 = app_context.getBean(PersonDAO.class);

        LOGGER.info("{}",dao0);
        LOGGER.info("{}",dao1);
        LOGGER.info("{}", dao0.getDatabaseConnection());
        LOGGER.info("{}", dao1.getDatabaseConnection());

    }

}
