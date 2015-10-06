package collections;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by piotrek on 10/5/2015.
 */
public class HashMapExample {


    private HashMap<String,Integer> wordCounter = new HashMap<>();
    public HashMapExample() {
        this.wordCounter = wordCounter;
    }

    public String[] stringCut(String string){
        String[] splitWords = string.split(" ");
        return splitWords;
    }
    // Put elements to the map
    public HashMap<String, Integer> getWordCounter(String[] arrayToCountWords) {
        Integer counter = 1;
        for (int i = 0; i<arrayToCountWords.length; i++ ) {
            if (wordCounter.containsKey(arrayToCountWords[i])){
                wordCounter.put(arrayToCountWords[i], wordCounter.get(arrayToCountWords[i]) + 1);
            } else {
                wordCounter.put(arrayToCountWords[i], 1);
            }
        }
        return wordCounter;
    }

    public void getKeyValues(){
        for (Map.Entry<String, Integer> map : wordCounter.entrySet()){
            System.out.println("Key: " + map.getKey() + " --> Value: " + map.getValue());
        }
    }

    public void sortKeysAlphabetically(){
       LinkedList sortedKeys=new LinkedList<>(wordCounter.keySet());
       Collections.sort(sortedKeys);
       System.out.println("\nNow sorted alphabetically:");
       for (Object x : sortedKeys){
            System.out.println("Key: " + x + " --> Value: " + wordCounter.get(x));
       }
    }

    public void sortValuesAscendingAndDescending(){
        LinkedList sortedValues=new LinkedList<>(wordCounter.values());
        Collections.sort(sortedValues);
        System.out.println("\nAscending order");
        for (Object x : sortedValues) {
            for (Map.Entry<String, Integer> map : wordCounter.entrySet()) {

                if (map.getValue().equals(x)) {
                    System.out.println(map.getKey() + " , value: " + map.getValue());
                    break;
                }
            }
        }
        Collections.reverse(sortedValues);
        System.out.println("\nDescending order");
        for (Object x : sortedValues) {
            for (Map.Entry<String, Integer> map : wordCounter.entrySet()) {
                if (map.getValue().equals(x)) {
                    System.out.println(map.getKey() + " , value: " + map.getValue());
                    break;
                }
            }
        }
    }
}
