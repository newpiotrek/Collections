package collections;

import objects.Word;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by piotrek on 10/3/2015.
 */
public class ListExample {
 private List<Word> names;
 public ListExample(){
     names = new ArrayList<>();
 }
    public void add(Word name){
        names.add(name);
    }
    public boolean contain(Word name){
        if (names.contains(name)){
            return true;
        }
        return false;
    }
    public String toString(){
        String namesList = new String();
        for(Word x : names){
            namesList+= x + "\n";
        }
        return namesList;
    }
}
