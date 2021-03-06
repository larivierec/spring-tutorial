package com.spring.basics.tutorial;

import com.spring.basics.componentscan.ComponentPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.spring.basics.componentscan")
@Configuration
public class SpringComponentScanApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringComponentScanApplication.class);

    public static void main(String[] args) {
        ApplicationContext app_context = new AnnotationConfigApplicationContext(SpringComponentScanApplication.class);
        ComponentPersonDAO component_dao = app_context.getBean(ComponentPersonDAO.class);

        LOGGER.info("{}", component_dao);
    }

}
