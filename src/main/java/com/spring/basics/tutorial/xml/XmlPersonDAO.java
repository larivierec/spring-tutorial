package com.spring.basics.tutorial.xml;

public class XmlPersonDAO {

    private XMLJdbcConnection xmlJdbcConnection;
    public XMLJdbcConnection getXMLJdbcConnection()
    {
        return this.xmlJdbcConnection;
    }

    public void setXMLJdbcConnection(XMLJdbcConnection conn) {
        this.xmlJdbcConnection = conn;
    }
}
