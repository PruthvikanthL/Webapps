package fridge.runner;

import java.util.HashMap;
import java.util.Map;

public class StudentsList {
    public static void main(String[] args) {
        Map<String,Integer> students=new HashMap();
        students.put("Pruthvi",88);
        students.put("Rangu",90);
        students.put("Chiru",99);
        System.out.println(students);
        //System.out.println(students.containsKey("Pruthvi"));
        System.out.println(students.values());
    }
}
