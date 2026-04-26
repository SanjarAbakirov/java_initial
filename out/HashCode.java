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

//        Using the keySet() method to retrieve a Set of all keys in the HashMap
        Set<String> keySet = Geeks.keySet();
        System.out.println("Key set: " + keySet);

//        Using the values() method to retrive a Collection of all values in the HashMap
        Set<Map.Entry<String, String>> entrySet = Geeks.entrySet();
        System.out.println("Entry Set: " + entrySet);

//        Using the remove() method to remove a key-value pair from the HasMap

    }
}