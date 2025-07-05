public class LaptopsWithPrice {
    public static void main(String[] args) {
Details det=Details.HPVictus;
        System.out.println(det+" "+det.getPrice());
        for(Details d:Details.values()){
            System.out.println(d+" "+d.getPrice()
                    .);

        }
    }
}
enum Details{
    Lenovo(55000),HPVictus(63000),Asus(45000),MU(3000);
    private int price;

    Details(int price) {
        this.price = price;
    }


    public void setPrice(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
