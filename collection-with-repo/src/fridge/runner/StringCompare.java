package fridge.runner;

import java.util.*;

public class StringCompare {
    public static void main(String[] args) {
        List<String> words=new ArrayList<>();
        words.add("Apple");
        words.add("one");
        words.add("Banana");
        words.add("Pine Apple");
        words.add("Cat");

        Comparator<String> com=new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                System.out.println("Comparing "+o1+" lenght "+o2);
                if(o1.length()>o2.length())
                return 1;
                else return -1;
            }
        };

        Collections.sort(words,com);

        Iterator<String> word =words.iterator();
        while(word.hasNext()){
            String w=word.next();
            System.out.println(w);

        }
    }
}
