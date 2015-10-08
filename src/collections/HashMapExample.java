package collections;

import objects.Word;

import java.lang.reflect.Array;
import java.util.*;

/**
 * Created by piotrek on 10/5/2015.
 */
// spróbuj zrobi? jeszcze sortowanie po kluczach u?ywaj?c TreeMap (mo?e Ci by? potrzebne skorzystanie z Comparable :) ). Druga kwestia, któr? mo?esz jeszcze zrobi? to zamieni? String na Word jako klucz (w osobnej klasie).
// clean code, treemap, skasowac Comparable(compareTo) i zobaczyc komunikaty, jak zmienisz w HashaMap'ie ze String(klucz w mapie) na Word i zobacz jak dziala metoda HashCode
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

    private TreeMap<String, Integer> wordCounterTreeMap = new TreeMap<>(wordCounter);
    private TreeMap<String, Integer> wordCounterTreeMapReverse = new TreeMap<>(Collections.reverseOrder());

    public void insertDataToTreeMap(){
        wordCounterTreeMap.putAll(wordCounter);
        wordCounterTreeMapReverse.putAll(wordCounter);
    }
    public void printTreeMap(){
        System.out.println("\nBelow TreeMap\n");
        System.out.println(wordCounterTreeMap);
        System.out.println("\nBelow TreeMap in Reverse\n");
        System.out.println(wordCounterTreeMapReverse);
    }
}
