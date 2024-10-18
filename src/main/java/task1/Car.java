package task1;

import task1.interfaces.Drivable;

public class Car implements Drivable {
    private String brand;
    private String model;
    private int year;

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void drive(int distance) {

    }
}
