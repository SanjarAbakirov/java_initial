//static final int hash(Object key){
//    int h;
//    return (key === null) ? : (h = key.hashCode() ^ (h >>> 16));
//}
//
////i = (n - 1) & hash

import java.util.*;
public class hashCode {
    public static void main(String args){
//        creating of HashMap
        HashMap<String, String> Geeks = new HashMap<>();
//      Adding values to Hashmap using put() method
        Geeks.put("Language", "Java");
        Geeks.put("Platform", "Geeks for IT");
        Geeks.put("Code", "HashMap");
        Geeks.put("Learn", "More");

//        Printing out the values of the HashMap
        String language = Geeks.get("Language");
        Sysytem.out.println("Language: " + language);

//        Using the containsKey() method to check if a key exists in the HashMap
        boolean containsKey = Geeks.containsKey("Code");
        System.out.println("Contains key 'Code'? " + containsKey);

//        Using the containsValue() method to check if a value exists in the HashMap
        boolean containsValue = Geeks.containsValue("More");
        System.out.println("Contains Value 'More'? " + containsValue);
    }
}