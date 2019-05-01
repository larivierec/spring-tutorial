package com.spring.basics.tutorial;

import com.spring.basics.componentscan.ComponentPersonDAO;
import com.spring.basics.tutorial.cdi.SomeCDIBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.spring.basics.tutorial.cdi")
public class SpringCdiApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringCdiApplication.class);

    public static void main(String[] args) {
        ApplicationContext app_context = new AnnotationConfigApplicationContext(SpringCdiApplication.class);
        SomeCDIBusiness cdiBusiness = app_context.getBean(SomeCDIBusiness.class);

        LOGGER.info("{}", cdiBusiness);
    }

}
