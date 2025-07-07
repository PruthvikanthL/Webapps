import java.util.*;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentance ");
        String sentance=sc.nextLine();
        String[] words=sentance.toLowerCase().split(" ");

        Map<String , Integer> wordcount=new HashMap<>();
        for(String word:words){
            if(wordcount.containsKey(word)){
                wordcount.put(word,wordcount.get(word)+1);
            }
            else{
                wordcount.put(word,1);
            }
        }
        for(Map.Entry<String,Integer> entry:wordcount.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

    }
}
