package ua.skillsup.java0.practice6;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Main
 * Created by kate on 4/21/17.
 */
public class Main {
    private static final int MIN_COUNT_WORDS = 100; //for TOP 100 common words that meet more than 100 times

    private static List<String> scannBook(String fileName) throws FileNotFoundException {
        List<String> wordsList = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            while (scanner.hasNext()) {
                wordsList.add(scanner.next());
            }
        }
        return wordsList;
    }

    // Ignore punctuations and Upper case
    private static String clean(String word) {
        if (word == null) {
            word = "";
        }
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
        for (int i = 0; i < 100; i++) {
            System.out.println(listOfMap.get(i));
        }
    }

    // Sort words that starts with d and f
    private static Map<String, Integer> printDandF(List<String> wordsList) {
        Map<String, Integer> wordsDandF = new TreeMap<>();
        for (String word : wordsList) {
            String key = word;
            Integer count = wordsDandF.get(key);
            if (word.startsWith("d") || word.startsWith("f")) {
                wordsDandF.put(word, count == null ? 1 : count + 1);
            }
        }
        return wordsDandF;
    }

    private static Map<String, Integer> readBook(String fileName) throws FileNotFoundException {
        return countUniqueWords(
                scannBook(fileName)
        );
    }


    public static void main(String[] args) throws FileNotFoundException {
        List<String> words = scannBook("TLOTR/TLOTR.txt");
        System.out.println(words.size());
        printTop(words);
        Map<String, Integer> uniqueWordsMap = countUniqueWords(words);
        System.out.println(uniqueWordsMap.keySet().size());
        printMap(uniqueWordsMap);
        System.out.println("*****");
        System.out.println(printDandF(new ArrayList<>(uniqueWordsMap.keySet())));


        Map<String, Integer> book1 = readBook("TLOTR/TLOTR1.txt");
        Map<String, Integer> book2 = readBook("TLOTR/TLOTR2.txt");
        Map<String, Integer> book3 = readBook("TLOTR/TLOTR3.txt");
        Map<String, Integer> book4 = readBook("TLOTR/TLOTR4.txt");
        Map<String, Integer> book5 = readBook("TLOTR/TLOTR5.txt");
        Map<String, Integer> book6 = readBook("TLOTR/TLOTR6.txt");
        System.out.println("______");

//      Common words for all books

        List<String> commonWords = new ArrayList<>();
        for (String word : book1.keySet()) {
            if (book2.containsKey(word)) {
                if (book3.containsKey(word)) {
                    if (book4.containsKey(word)) {
                        if (book5.containsKey(word)) {
                            if (book6.containsKey(word)) {
                                commonWords.add(word);
                            }
                        }
                    }
                }
            }
        }
        System.out.println(commonWords);
        System.out.println("||||||");

// TOP 100 common words for all books that meet more than 100 times

        List<String> commonWordsTop = new ArrayList<>();
        for (String word : book1.keySet()) {
            if (book1.get(word) >= MIN_COUNT_WORDS) {
                if (book2.containsKey(word) && book2.get(word) >= MIN_COUNT_WORDS) {
                    if (book3.containsKey(word) && book3.get(word) >= MIN_COUNT_WORDS) {
                        if (book4.containsKey(word) && book4.get(word) >= MIN_COUNT_WORDS) {
                            if (book5.containsKey(word) && book5.get(word) >= MIN_COUNT_WORDS) {
                                if (book6.containsKey(word) && book6.get(word) >= MIN_COUNT_WORDS) {
                                    commonWordsTop.add(word);
                                }
                            }
                        }
                    }
                }
            }
        }
        System.out.println(commonWordsTop);
        System.out.println("///////");
//        Unique words for each book

        System.out.println(
                getUniqueWors(book1, book2, book3, book4, book5, book6)
        );

        System.out.println(
                getUniqueWors(book2, book1, book3, book4, book5, book6)
        );

        System.out.println(
                getUniqueWors(book3, book2, book1, book4, book5, book6)
        );

        System.out.println(
                getUniqueWors(book4, book2, book3, book1, book5, book6)
        );

        System.out.println(
                getUniqueWors(book5, book2, book3, book4, book1, book6)
        );

        System.out.println(
                getUniqueWors(book6, book2, book3, book4, book5, book1)
        );


    }

    private static List<String> getUniqueWors(Map<String, Integer> bookA,
                                              Map<String, Integer> bookB,
                                              Map<String, Integer> bookC,
                                              Map<String, Integer> bookD,
                                              Map<String, Integer> bookE,
                                              Map<String, Integer> bookF) {
        List<String> uniqueWords = new ArrayList<>();
        for (String word : bookA.keySet()) {
            if (!bookB.containsKey(word)) {
                if (!bookC.containsKey(word)) {
                    if (!bookD.containsKey(word)) {
                        if (!bookE.containsKey(word)) {
                            if (!bookF.containsKey(word)) {
                                uniqueWords.add(word);
                            }
                        }
                    }
                }
            }
        }
        return uniqueWords;
    }

    static class MyComporator implements Comparator<Map.Entry<String, Integer>> {

        @Override
        public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
            return o2.getValue() - o1.getValue();
        }
    }
}
