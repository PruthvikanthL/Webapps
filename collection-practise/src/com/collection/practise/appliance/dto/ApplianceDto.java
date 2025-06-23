package com.collection.practise.appliance.dto;

public class ApplianceDto {
    private String name;
    private String brand;
    private String type;
    private int powerconsumption;
    private double price;
    public ApplianceDto(String name,String brand,String type,int powerconsumption,double price){
        this.name=name;
        this.brand=brand;
        this.type=type;
        this.powerconsumption=powerconsumption;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public int getPowerconsumption() {
        return powerconsumption;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "ApplianceDto{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", type='" + type + '\'' +
                ", powerconsumption=" + powerconsumption +
                ", price=" + price +
                '}';
    }
}
