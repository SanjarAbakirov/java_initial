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

    }
}