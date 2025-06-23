package com.collection.practise.furniture.dto;

public class FurnitureDto {
    private String name;
    private String type;
    private String material;
    private String color;
    private double price;

    public FurnitureDto(String name,String type,String material,String color,double price){
        this.name=name;
        this.type=type;
        this.material=material;
        this.color=color;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "FurnitureDto{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
