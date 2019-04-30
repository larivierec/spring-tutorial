package com.spring.basics.tutorial;

import com.spring.basics.componentscan.ComponentPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.spring.basics.componentscan")
@SpringBootApplication
public class SpringComponentScanApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringComponentScanApplication.class);

    public static void main(String[] args) {
        ApplicationContext app_context = SpringApplication.run(SpringComponentScanApplication.class, args);
        ComponentPersonDAO component_dao = app_context.getBean(ComponentPersonDAO.class);

        LOGGER.info("{}", component_dao);
    }

}
