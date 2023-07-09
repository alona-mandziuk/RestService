package com.example.soapservisewithjdbc.DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CarJdbcDao implements CarDAO{
    private static Connection getConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(System.getenv("URL"),
            System.getenv("USER"), System.getenv("PASSSWORD"));
            return connection;

        } catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Car> getAll() {
        List <Car> allCars = new ArrayList<>();
        try {
            PreparedStatement statement = getConnection()
                    .prepareStatement("SELECT car_id, mark, model, speed, price, firstname," +
                            "lastname, phone " +
                            "FROM cars INNER JOIN clients ON cars.client_id = clients.id");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                int id = resultSet.getInt(1);
                String mark = resultSet.getString(2);
                String model = resultSet.getString(3);
                int speed = resultSet.getInt(4);
                int price = resultSet.getInt(5);
                String firstName = resultSet.getString(6);
                String lastName = resultSet.getString(7);
                String phoneNumber = resultSet.getString(8);
                Car car = new Car();
                car.setCarId(id);
                car.setMark(mark);
                car.setModel(model);
                car.setSpeed(speed);
                car.setPrice(price);
                car.setClientFirstName(firstName);
                car.setClientLastName(lastName);
                car.setClientPhone(phoneNumber);
                allCars.add(car);
                statement.close();

            }
        }catch (SQLException e){
            e.printStackTrace();
        }

        return allCars;
    }
}
