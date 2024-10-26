package com.example.autowire.name;

public class Specification {
    private String model;
    private String make;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    @Override
    public String toString() {
        return "Specification{" +
                "model='" + model + '\'' +
                ", make='" + make + '\'' +
                '}';
    }
}
