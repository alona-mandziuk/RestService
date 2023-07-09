package com.example.soapservisewithjdbc;

import com.example.soapservisewithjdbc.DAO.Car;
import com.example.soapservisewithjdbc.DAO.CarDAO;
import com.example.soapservisewithjdbc.DAO.DAOFactory;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

public class CarshopServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter printWriter = response.getWriter();


        CarDAO carDAO = DAOFactory.getInstance().getCarDao();
        Iterator<Car> carIterator = carDAO.getAll().iterator();

        while (carIterator.hasNext()){
            printWriter.println(carIterator.next());
        }


    }
}
