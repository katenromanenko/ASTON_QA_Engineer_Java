package Lab9;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Мария", "Анна", "Ольга", "Наталья", "Татьяна", "Екатерина", "Александра", "Анна", "Елизавета", "София", "Мария", "Анастасия", "Дарья", "Екатерина", "Виктория", "Полина", "Ксения", "Александра", "Елизавета", "София");
        System.out.println("Вся коллекция имен: " + names);
        WordProcessor.processWords(names);

        PhoneBook phoneBook = new PhoneBook();

        phoneBook.add("Alex", 1234567);
        phoneBook.add("Alex", 2345678);
        phoneBook.add("John", 3456789);
        phoneBook.add("John", 4567890);
        phoneBook.add("Jane", 5678901);

        phoneBook.get("Alex");
    }
}
