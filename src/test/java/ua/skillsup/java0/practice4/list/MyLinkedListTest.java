package ua.skillsup.java0.practice4.list;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Anton Chernetskij
 */
public class MyLinkedListTest {
    private MyCollection list;

    @Before
    public void setUp() throws Exception {
        list = new MyLinkedList();
        list.add("String0");
        list.add("String1");
        list.add("String2");
        list.add("String3");
        list.add("String0");
    }

    @Test
    public void testGet() throws Exception {
        assertEquals("String0", list.get(0));
        assertEquals("String1", list.get(1));
        assertEquals("String2", list.get(2));
        assertEquals("String3", list.get(3));
        assertEquals("String0", list.get(4));
    }

    @Test
    public void testSize() throws Exception {
        assertEquals(5, list.size());
        list.remove("String0");
        assertEquals(4, list.size());
        list.remove("String0");
        assertEquals(3, list.size());
    }

    @Test
    public void testFind() throws Exception {
        assertEquals(0, list.find("String0"));
        assertEquals(3, list.find("String3"));
        assertEquals(-1, list.find("String"));
    }

    @Test
    public void testRemove() throws Exception {
        assertTrue(list.remove("String0"));
        assertEquals(list.get(1), "String2");

        assertEquals(list.get(3), "String0");

        assertFalse(list.remove("String4"));
        assertEquals(4, list.size());
    }

    @Test
    public void testIterator() throws Exception {
        assertNotNull(list.iterator());
        String[] elements = new String[5];
        int i = 0;
        for (String s : list) {
            elements[i++] = s;
        }
        assertArrayEquals(new String[]{"String0", "String1", "String2", "String3", "String0"}, elements);
    }

    @Test
    public void testNull() throws Exception {
        list.add(null);
        assertEquals(5, list.find(null));
        assertTrue(list.remove(null));
        assertEquals(5, list.size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testOutOfBoundsLow() throws Exception {
        list.get(-1);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testOutOfBoundsHigh() throws Exception {
        list.get(10);
    }

    @Test
    public void testRemoveEmptyList() throws Exception {
        list = new MyLinkedList();
        assertFalse(list.remove("s111"));
    }

    @Test
    public void testRemoveAll() throws Exception {
        list.remove("String0");
        list.remove("String1");
        list.remove("String2");
        list.remove("String3");
        list.remove("String0");
        assertEquals(0, list.size());
        list.add("a");
        assertEquals(0, list.find("a"));
    }

    @Test
    public void testFirst() throws Exception {
        assertEquals("String0", list.first());
    }
}
