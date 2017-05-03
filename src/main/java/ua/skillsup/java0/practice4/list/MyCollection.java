package ua.skillsup.java0.practice4.list;

import java.util.Iterator;

/**
 * @author Anton Chernetskij
 */
public interface MyCollection extends Iterable<String> {
    void add(String v);

    boolean remove(String v);

    int size();

    int find(String v);

    String get(int index);

    @Override
    Iterator<String> iterator();

    default String first(){
        return get(0);
    }
}
