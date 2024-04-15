package Lab9;

import java.util.*;

public class WordProcessor {
    public static void processWords(List<String> names) {
        Set<String> uniqueNames = new HashSet<>(names);
        System.out.println("Уникальные имена: " + uniqueNames);

        Map<String, Integer> nameCounts = new HashMap<>();
        for (String name : names) {
            nameCounts.put(name, nameCounts.getOrDefault(name, 0) + 1);
        }
        System.out.println("Количество повторений каждого имени: " + nameCounts);
    }
}