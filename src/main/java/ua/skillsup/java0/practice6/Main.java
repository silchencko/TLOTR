package ua.skillsup.java0.practice6;

import ua.skillsup.java0.practice4.Iterator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by kate on 4/21/17.
 */
public class Main {

    private static List<String> scannBook() throws FileNotFoundException {
        List<String> wordsList = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File("TLOTR/TLOTR.txt"))) {
            while (scanner.hasNext()) {
                wordsList.add(scanner.next());
            }
        }
        return wordsList;
    }

    private static String clean(String word) {
        return word.replace('.', ' ')
                .replace(',', ' ')
                .replace(';', ' ')
                .replace(':', ' ')
                .replace('/', ' ')
                .replace('?', ' ')
                .replace('!', ' ')
                .replace('(', ' ')
                .replace(')', ' ')
                .replace('[', ' ')
                .replace(']', ' ')
                .replace('_', ' ')
                .replace('#', ' ')
                .replace('\'', ' ')
                .trim()
                .toLowerCase();
    }

    //    First 10 words
    private static void printTop(List<String> words) {
        for (int i = 0; i < 10; i++) {
            System.out.println(words.get(i));
        }
    }

    //    Count unique words
    private static Map<String, Integer> countUniqueWords(List<String> wordsList) {
        Map<String, Integer> uniqueWordsMap = new HashMap<>();
        for (String word : wordsList) {
            String key = clean(word);
            Integer count = uniqueWordsMap.get(key);
            uniqueWordsMap.put(key, count == null ? 1 : count + 1);
        }
        return uniqueWordsMap;
    }

    // Сортировка слов по частоте употребления
    private static void printMap(Map<String, Integer> uniqueWordsMap) {
        List<Map.Entry<String, Integer>> listOfMap = new ArrayList<>(uniqueWordsMap.entrySet());
        listOfMap.sort(new MyComporator());
        for (int i = 0; i < 10; i++) {
            System.out.println(listOfMap.get(i));
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        List<String> words = scannBook();
        System.out.println(words.size());
        printTop(words);
        Map<String, Integer> uniqueWordsMap = countUniqueWords(words);
        System.out.println(uniqueWordsMap.keySet().size());
        printMap(uniqueWordsMap);
    }

    static class MyComporator implements Comparator<Map.Entry<String, Integer>> {

        @Override
        public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
            return o2.getValue() - o1.getValue();
        }
    }
}
