package fridge.dto;

public class FridgeDto {
    private String brand;
    private int capacity;
    private double price;
    public FridgeDto(String brand,int capacity,double price){
        this.brand=brand;
        this.capacity=capacity;
        this.price=price;
    }

    public String getBrand() {
        return brand;
    }

    public int getCapacity() {
        return capacity;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "FridgeDto{" +
                "brand='" + brand + '\'' +
                ", capacity=" + capacity +
                ", price=" + price +
                '}';
    }
}
