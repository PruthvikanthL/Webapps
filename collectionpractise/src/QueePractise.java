import java.util.LinkedList;
import java.util.Queue;

public class QueePractise {
    public static void main(String[] args) {
        Queue<String> car=new LinkedList<>();
        car.add("BMW");
        car.add("HONDA");
        car.add("SCODA");

        for(String cars:car){
            System.out.println(cars);
        }
        car.poll();
        for(String cars:car){
            System.out.println(cars);
        }
    }
}
