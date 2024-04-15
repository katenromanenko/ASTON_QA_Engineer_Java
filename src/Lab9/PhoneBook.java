package Lab9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class PhoneBook {
    Map<String, Set<Integer>> directory = new HashMap<>();

    void add(String name, int num1) {
        directory.computeIfAbsent(name, k -> new HashSet<>()).add(num1);
    }

    void get(String name) {
        System.out.printf("%nКонтакт "+name+": "+ directory.getOrDefault(name, new HashSet<>()));
    }
}