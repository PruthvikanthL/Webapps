import java.util.*;


public class NamesManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> names = new ArrayList<>();

        System.out.println("Enter the five names");
        for (int i = 0; i < 5; i++) {
            names.add(sc.nextLine());

        }
        System.out.println("The Names You Entered is");
        for (String n : names) {
            System.out.println(n);
        }
        System.out.println("Enter the names index number to remove that particular person name");
        int removernum = sc.nextInt();
        names.remove(removernum);
        System.out.println("The Names After Removing is");
        for (String n : names) {
            System.out.println(n);
        }
        Collections.sort(names);
        System.out.println("Names after sorted is");
        for (String n : names) {
            System.out.println(n);
        }
        sc.close();

    }
}