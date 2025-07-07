import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequencyCounter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Sentance or word");
        String input=sc.nextLine();
        input=input.replaceAll(" ","").toLowerCase();
        Map<Character,Integer> charcount=new HashMap<>();
        for(int i=0;i<input.length();i++){
            char ch=input.charAt(i);
            if(charcount.containsKey(ch)){
                charcount.put(ch,charcount.get(ch)+1);
            }
            else{
                charcount.put(ch,1);
            }
        }
        for(Map.Entry<Character,Integer> entry:charcount.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
