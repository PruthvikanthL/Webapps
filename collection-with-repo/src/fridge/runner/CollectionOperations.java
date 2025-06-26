package fridge.runner;

import java.util.ArrayList;
import java.util.List;

public class CollectionOperations {
    public static void main(String[] args) {
        List<String> list1=new ArrayList<>();
        list1.add("Apple");
        list1.add("Bannana");
        list1.add("Orange");
        list1.add("Pine Apple");
        list1.add("Grapes");
        List<String> list2=new ArrayList<>();
        list2.add("Apple");
        list2.add("Bannana");
        list2.add("Orange");

        boolean isremove=list1.remove("Grapes");
        System.out.println("From list one is Removed"+isremove);

        boolean iscontains=list1.contains("Apple");
        System.out.println("is List 1 Contain Apple "+iscontains);

        boolean isequal=list1.equals(list2);
        System.out.println("is both list are equal "+isequal);

        boolean isempty=list1.isEmpty();
        System.out.println("is list 1 is empty"+isempty);

        list1.addAll(list2);
        System.out.println("List 1 after add all list 2 is"+list1);

        list1.removeAll(list2);
        System.out.println("List 1 after remove all list 2"+list1);

        boolean hadall=list1.containsAll(list2);
        System.out.println("list1 contains all of the list"+hadall);
    }
}