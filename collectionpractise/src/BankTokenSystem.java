import java.util.*;

public class BankTokenSystem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Queue<Integer> tokenqueue=new LinkedList<>();
        Map<Integer,String> Customersname=new HashMap<>();
        Map<Integer,String> Customerservice=new HashMap<>();
        Set<String> uniqueservice=new HashSet<>();
        int tokennumber=1;
        for(int i=1;i<=3;i++){
            System.out.println("Enter the customer Name");
            String name=sc.nextLine();
            System.out.println("Enter the service (Deposit,withdraw,Loan)");
            String service=sc.nextLine();
            tokenqueue.add(tokennumber);
            Customersname.put(tokennumber,name);
            Customerservice.put(tokennumber,service);
            uniqueservice.add(service);
            System.out.println(" Customer Registered with Token Number --> "+tokennumber+" Name --> "+name+" Service --> "+service);
            tokennumber++;
            System.out.println();
        }
        System.out.println("\n========== Serving Customers ==========");

        while(!tokenqueue.isEmpty()){
            int currenttoken=tokenqueue.poll();
            System.out.println("Now Serving is Token Number "+currenttoken);
            System.out.println("Custmer Name "+Customersname.get(currenttoken));
            System.out.println("Customer Service is "+Customerservice.get(currenttoken));
            System.out.println("Remaining next Customers is "+tokenqueue.size());
            System.out.println("-----------------------------");
        }
        System.out.println("Unique services requested today:");
        System.out.println(uniqueservice);
        sc.close();
    }
}
