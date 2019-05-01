package com.spring.basics.tutorial.cdi;

import javax.inject.Inject;
import javax.inject.Named;

@Named
public class SomeCDIBusiness
{
    @Inject
    private SomeCDIDAO some_cdi_dao;

    public SomeCDIDAO getCdiDao() {
        return some_cdi_dao;
    }

    public void setCdiDao(SomeCDIDAO some_cdi_dao) {
        this.some_cdi_dao = some_cdi_dao;
    }
}
