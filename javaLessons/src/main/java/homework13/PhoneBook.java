package homework13;

import java.util.ArrayList;

public class PhoneBook {
    public static void main(String[] arg) {
        PhoneDirectory phoneBook = new PhoneDirectory();
        phoneBook.add("Newton", "1234567");
        phoneBook.add("Newton", "7654321");
        phoneBook.add("Maple", "123246");
        phoneBook.add("Swan", "457891");
        ArrayList<String> numbers = phoneBook.get("Newton");
        for (String number: numbers) {
            System.out.println(number);
        }
    }
}
