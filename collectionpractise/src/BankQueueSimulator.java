import java.util.LinkedList;
import java.util.Queue;

public class BankQueueSimulator {
    public static void main(String[] args) {
        Queue<String> customers=new LinkedList<>();
        customers.add("Pruthvi");
        customers.add("Kanth");
        customers.add("Chiru");
        customers.add("Rangu");
        customers.add("Surya");
        System.out.println("The Bank customer are ");
        for(String name:customers){
            System.out.println(name);
        }
        while(!customers.isEmpty()) {
            System.out.println("The customer currently serving is "+customers.peek());
            customers.poll();
            System.out.println("=======================================");
            System.out.println("The customers in line is");
            for(String name:customers) {
                System.out.println(name);
            }
        }
    }
}
