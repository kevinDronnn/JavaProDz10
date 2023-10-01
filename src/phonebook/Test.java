package phonebook;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Note> list = new ArrayList<>();
        PhoneBook.add(list, new Note("alex", "3626526"));
        PhoneBook.add(list, new Note("oleg", "4514104"));
        PhoneBook.add(list, new Note("misha", "5494845"));
        PhoneBook.add(list, new Note("misha", "851152"));
        PhoneBook.add(list, new Note("misha", "14515220"));

        System.out.println(list);

        System.out.println(PhoneBook.find(list, "misha"));
        System.out.println(PhoneBook.findAll(list, "misha"));

    }
}
