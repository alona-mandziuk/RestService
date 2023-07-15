package com.soapservisewithjdbc;

import com.soapservisewithjdbc.DAO.Car;
import com.soapservisewithjdbc.DAO.CarDAO;
import com.soapservisewithjdbc.DAO.DAOFactory;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;

public class CarshopServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter printWriter = response.getWriter();

        CarDAO carDAO = DAOFactory.getInstance().getCarDao();
        Iterator<Car> carIterator = carDAO.getAll().iterator();

        while (carIterator.hasNext()) {
            printWriter.println(carIterator.next());
            printWriter.println("---------------------------");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
