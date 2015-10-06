package main;

import collections.HashMapExample;
import collections.ListExample;
import objects.Name;

/**
 * Created by piotrek on 10/3/2015.
 */
public class Main {
    public static void main(String[] args) {
        ListExample test = new ListExample();

        Name name1 = new Name("hello");
        Name name2 = new Name("World");
        Name name3 = new Name("whatever");
        test.add(name1);
        test.add(name2);
        test.add(name3);

        System.out.println(test);
        System.out.println(test.contain(new Name("hello")));
        String entireText = "Five One Two Three Four Five Six Seven Eight Nine Ten Two Three Four Five Three Four Five Four Five" ;
        HashMapExample list = new HashMapExample();
        String[] strings;
        strings = list.stringCut(entireText);
        list.getWordCounter(strings);
        list.getKeyValues();
    }
}
