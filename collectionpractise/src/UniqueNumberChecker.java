import java.util.*;

public class UniqueNumberChecker {
    public static void main(String[] args) {
        Set<Integer> num=new HashSet<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the any 10 numbers including repeated numbers");
        for(int i=1;i<=10;i++){
            num.add(sc.nextInt());
        }
        System.out.println("Unique Values from set");
        for(int n:num){
            System.out.println(n);
        }
    }
}
