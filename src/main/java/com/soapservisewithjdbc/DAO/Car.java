package com.soapservisewithjdbc.DAO;

public class Car {
    private int carId;
    private String mark;
    private String model;
    private int speed;
    private int price;

    private String clientFirstName;
    private String clientLastName;
    private String clientPhone;

    int getCarId() {
        return carId;
    }

    void setCarId(int carId) {
        this.carId = carId;
    }

    String getMark() {
        return mark;
    }

    void setMark(String mark) {
        this.mark = mark;
    }

    String getModel() {
        return model;
    }

    void setModel(String model) {
        this.model = model;
    }

    int getSpeed() {
        return speed;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    int getPrice() {
        return price;
    }

    void setPrice(int price) {
        this.price = price;
    }

    String getClientFirstName() {
        return clientFirstName;
    }

    void setClientFirstName(String clientFirstName) {
        this.clientFirstName = clientFirstName;
    }

    String getClientLastName() {
        return clientLastName;
    }

    void setClientLastName(String clientLastName) {
        this.clientLastName = clientLastName;
    }

    String getClientPhone() {
        return clientPhone;
    }

    void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    @Override
    public String toString() {
        return "\nCar Id: " + carId +
                "\n mark: " + mark +
                "\n model: " + model +
                "\n speed: " + speed +
                "\n price: " + price +
                "\n\tClient first name: " + clientFirstName +
                "\n\t last name: " + clientLastName +
                "\n\t phone number: " + clientPhone + ".";
    }
}
