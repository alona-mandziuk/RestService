package com.soapservisewithjdbc.DAO;

import com.soapservisewithjdbc.RegisterDriver;

public class DAOFactory implements IDAOFactory {

    private static IDAOFactory factory;

    private DAOFactory() {
        RegisterDriver.registerDriver();
    }

    public static synchronized IDAOFactory getInstance() {
        if (factory == null) {
            factory = new DAOFactory();
        }
        return factory;
    }

    @Override
    public CarDAO getCarDao() {
        return new CarJdbcDao();
    }
}
