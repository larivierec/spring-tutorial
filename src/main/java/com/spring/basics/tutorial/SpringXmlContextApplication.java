package com.spring.basics.tutorial;

import com.spring.basics.tutorial.basics.BinarySearchImpl;
import com.spring.basics.tutorial.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Configuration
@ComponentScan
public class SpringXmlContextApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringXmlContextApplication.class);

    public static void main(String[] args) {

        ClassPathXmlApplicationContext app_context = new ClassPathXmlApplicationContext("application_context.xml");
        XmlPersonDAO persondao1 = app_context.getBean(XmlPersonDAO.class);
        XmlPersonDAO persondao2 = app_context.getBean(XmlPersonDAO.class);



        LOGGER.info("{}", persondao1);
        LOGGER.info("{}", persondao2);

        LOGGER.info("Beans loaded -> {}", (Object) app_context.getBeanDefinitionNames());

        app_context.close();
    }

}
