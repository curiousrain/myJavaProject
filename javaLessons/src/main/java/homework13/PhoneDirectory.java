package homework13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class PhoneDirectory {
    private final HashMap<String, ArrayList<String>> hashMap = new HashMap<>();

    public void add(String lastName, String phoneNumber) {
        if (hashMap.containsKey(lastName)) {
           hashMap.get(lastName).add(phoneNumber);
            return;
        }
        hashMap.put(lastName, new ArrayList<>(Collections.singletonList(phoneNumber)));
    }

    public ArrayList<String> get(String lastName) {
        return hashMap.get(lastName);
    }
}
