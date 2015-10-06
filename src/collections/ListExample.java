package collections;

import objects.Name;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by piotrek on 10/3/2015.
 */
public class ListExample {
 private List<Name> names;
 public ListExample(){
     names = new ArrayList<>();
 }
    public void add(Name name){
        names.add(name);
    }
    public boolean contain(Name name){
        if (names.contains(name)){
            return true;
        }
        return false;
    }
    public String toString(){
        String namesList = new String();
        for(Name x : names){
            namesList+= x + "\n";
        }
        return namesList;
    }
}
