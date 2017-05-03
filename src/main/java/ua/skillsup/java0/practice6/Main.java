package ua.skillsup.java0.practice6;

import ua.skillsup.java0.practice4.Iterator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * Created by kate on 4/21/17.
 */
public class Main {

    public static void main(String[] args)throws FileNotFoundException{
        Scanner scanner = new Scanner(new File("TLOTR/TLOTR.txt"));
//        for (int i =0; i<10; i++){
//            System.out.println(scanner.next());
//        }
        int size = 0;
        HashSet<String> scannerHashSet= new HashSet<>();

        Map<String, Integer> hashMap = new HashMap<String , Integer>();

        while (scanner.hasNext()) {
            size++;
            scannerHashSet.add(scanner.next());
            Integer count = hashMap.get(scanner.next());
//            Игнорирование знаков препинания и регистра
            String key = scanner.next().replace('.', ' ')
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
//                                       .replace("'ve", " have")
                    .replace('\'', ' ')
                    .trim();
            hashMap.put(key.toLowerCase(), count == null ? 1 : count + 1);
        }
//          Сортировка слов по частоте употребления
            List<Map.Entry<String, Integer>>  listOfMap = new ArrayList<>(hashMap.entrySet());

            listOfMap.sort(new MyComporator());
            for (int i = 0; i < listOfMap.size(); i++) {
                System.out.println(listOfMap.get(i));
            }

//        System.out.println(size);
//        System.out.println(scannerHashSet.size());
//        System.out.println(hashMap);

        }

static class MyComporator implements Comparator<Map.Entry<String, Integer>>{

    @Override
    public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
        return o2.getValue() - o1.getValue();
    }
}

//    Map<String, Integer> sortedMap = sortByValue
//    List list = new ArrayList<>(Map.entrySet)

}
