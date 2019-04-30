package com.spring.basics.tutorial.dbcomms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PersonDAO {

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
