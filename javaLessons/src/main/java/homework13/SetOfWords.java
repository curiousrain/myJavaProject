package homework13;

import java.util.*;

public class SetOfWords {
    public static void main(String[] args) {
        hashMap(array);
    }


    static String[] array = {"Taric","Lux","Morgana","Seraphine","Bard",
                      "Thresh", "Lulu","Morgana","Braum","Sona",
                       "Janna","Milio","Nami","Lux","Soraka",
                       "Rakan","Morgana","Lux","Zyra","Senna"};


    public static void hashMap(String[] array) {
        HashMap <String, Integer> map = new HashMap<>();
        for (String str : array) {
            int value = 1;
            if (map.containsKey(str)){
                value = map.get(str) + 1;
            }
            map.put(str, value);
        }
        System.out.println("\nWord frequencies");
        for (Map.Entry<String, Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey()+ ":" + entry.getValue());
        }
    }
}
