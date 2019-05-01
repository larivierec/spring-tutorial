package com.spring.basics.componentscan;

import com.spring.basics.tutorial.dbcomms.JdbcConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ComponentPersonDAO {

    @Autowired
    private ComponentJdbcConnection conn;
    public ComponentJdbcConnection getComponentJdbcConnection()
    {
        return this.conn;
    }

    public void setComponentJdbcConnection(ComponentJdbcConnection conn) {
        this.conn = conn;
    }
}
