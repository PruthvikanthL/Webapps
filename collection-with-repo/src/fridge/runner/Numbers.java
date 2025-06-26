package fridge.runner;

import java.util.*;

public class Numbers {
    public static void main(String[] args) {
        List<Integer> num=new ArrayList<>();
        num.add(4);
        num.add(5);
        num.add(6);
        num.add(7);
        num.add(8);
        System.out.println(num.contains(5));

        System.out.println("The sorted numver are ");

        Comparator<Integer> com=new Comparator<Integer>() {
            @Override
            public int compare(Integer i, Integer j) {
                System.out.println("Comparing: " + i + " and " + j);
                if(i%10 >j%10)
                    return 1;
                else
                    return -1;
            }
        };

//        for(Integer n:num){
//            System.out.println(n);
//        }
        Collections.sort(num,com);
        Iterator<Integer> numbers =num.iterator();
        while(numbers.hasNext()){
            Integer num1=numbers.next();
            System.out.println(num1);
        }
    }
}
