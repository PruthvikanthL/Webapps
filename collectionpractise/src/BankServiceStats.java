import java.util.*;

public class BankServiceStats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> serviceCount = new HashMap<>();
        List<String> allServices = new ArrayList<>();

        System.out.print("Enter number of customers: ");
        int n = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= n; i++) {
            System.out.println("\nCustomer " + i);
            System.out.print("Enter service type (Deposit, Withdraw, Loan, etc.): ");
            String service = sc.nextLine().toLowerCase();


            serviceCount.put(service, serviceCount.getOrDefault(service, 0) + 1);
            allServices.add(service);
        }


        System.out.println("\n Service Usage Count:");
        for (Map.Entry<String, Integer> entry : serviceCount.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue() + " customers");
        }


        String mostUsed = null;
        int maxCount = 0;
        for (Map.Entry<String, Integer> entry : serviceCount.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxCount = entry.getValue();
                mostUsed = entry.getKey();
            }
        }
        System.out.println("\nMost Requested Service: " + mostUsed.toUpperCase() + " (" + maxCount + " times)");


        Set<String> uniqueSorted = new TreeSet<>(allServices);
        System.out.println("\nServices (Alphabetical Order): " + uniqueSorted);

        sc.close();
    }
}
