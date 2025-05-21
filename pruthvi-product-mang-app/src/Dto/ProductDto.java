package Dto;

public class ProductDto {
    public ProductDto(){
        System.out.println("ProductDto running in Dto");
    }
    private String name;
    private String type;
    private String incomingprice;
    private String sellingprice;
    private String MRP;
    private String description;
    private String brand;
    private  String quality;
    private String color;
    private String weight;
    private String manufdate;
    private  String warranty;
    private String returnpolicy;

    public void setName(String name){
        this.name=name;
    }
    public void setType(String type){
        this.type=type;
    }
    public void setIncomingprice(String incomingprice){
        this.incomingprice=incomingprice;
    }
    public void setSellingprice(String sellingprice){
        this.sellingprice=sellingprice;
    }
    public void setMRP(String MRP){
        this.MRP=MRP;
    }
    public void setDescription(String description){
        this.description=description;
    }
    public void setBrand(String brand){
        this.brand=brand;
    }
    public void setQuality(String quality){
        this.quality=quality;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setWeight(String weight){
        this.weight=weight;
    }
    public void setManufdate(String manufdate){
        this.manufdate=manufdate;
    }
    public void setWarranty(String warranty){
        this.warranty=warranty;
    }
    public void setReturnpolicy(String returnpolicy){
        this.returnpolicy=returnpolicy;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public String getIncomingprice() {
        return incomingprice;
    }

    public String getSellingprice() {
        return sellingprice;
    }

    public String getMRP() {
        return MRP;
    }

    public String getDescription() {
        return description;
    }

    public String getBrand() {
        return brand;
    }

    public String getQuality() {
        return quality;
    }

    public String getColor() {
        return color;
    }

    public String getWeight() {
        return weight;
    }

    public String getManufdate() {
        return manufdate;
    }

    public String getWarranty() {
        return warranty;
    }

    public String getReturnpolicy() {
        return returnpolicy;

    }
}
