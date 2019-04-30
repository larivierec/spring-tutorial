package com.spring.basics.componentscan;

import com.spring.basics.tutorial.dbcomms.JdbcConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentPersonDAO {

    @Autowired
    private JdbcConnection conn;
    public JdbcConnection getDatabaseConnection()
    {
        return this.conn;
    }

    public void setJdbcConnection(JdbcConnection conn) {
        this.conn = conn;
    }
}
