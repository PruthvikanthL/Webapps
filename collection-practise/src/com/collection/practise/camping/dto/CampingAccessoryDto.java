package com.collection.practise.camping.dto;

public class CampingAccessoryDto {
    private String name;
    private String brand;
    private String material;
    private float weight;
    private double price;

    public CampingAccessoryDto(String name,String brand,String material,float weight,double price){
        this.name=name;
        this.brand=brand;
        this.material=material;
        this.weight=weight;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getMaterial() {
        return material;
    }

    public float getWeight() {
        return weight;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "CampingAccessoryDto{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", material='" + material + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                '}';
    }
}
