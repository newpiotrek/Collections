package main;

import collections.HashMapExample;
import collections.ListExample;
import objects.Word;

/**
 * Created by piotrek on 10/3/2015.
 */
public class Main {
    public static void main(String[] args) {
        ListExample test = new ListExample();

        Word name1 = new Word("hello");
        Word name2 = new Word("World");
        Word name3 = new Word("whatever");
        test.add(name1);
        test.add(name2);
        test.add(name3);

        System.out.println(test);
        System.out.println(test.contain(new Word("hello")));
        String entireText = "Five One Two Three Four Five Six Seven Eight Nine Ten Two Three Four Five Three Four Five Four Five" ;
        HashMapExample list = new HashMapExample();
        String[] strings;
        strings = list.stringCut(entireText);
        list.getWordCounter(strings);
        list.getKeyValues();
        list.sortKeysAlphabetically();
        list.sortValuesAscendingAndDescending();
        list.insertDataToTreeMap();
        list.printTreeMap();
    }
}
