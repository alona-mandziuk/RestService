package com.example.soapservisewithjdbc.DAO;

public class Car {
    private int carId;
    private String mark;
    private String model;
    private int speed;
    private int price;

    private String clientFirstName;
    private String clientLastName;
    private String clientPhone;

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getClientFirstName() {
        return clientFirstName;
    }

    public void setClientFirstName(String clientFirstName) {
        this.clientFirstName = clientFirstName;
    }

    public String getClientLastName() {
        return clientLastName;
    }

    public void setClientLastName(String clientLastName) {
        this.clientLastName = clientLastName;
    }

    public String getClientPhone() {
        return clientPhone;
    }

    public void setClientPhone(String clientPhone) {
        this.clientPhone = clientPhone;
    }

    @Override
    public String toString() {
        return "Car Id: " + carId +
                ", mark: " + mark +
                ", model: " + model +
                ", speed: " + speed +
                ", price: " + price +
                ", \nclient first name: " + clientFirstName +
                ", client last name: " + clientLastName +
                ", client phone number: " + clientPhone + ".";
    }
}
