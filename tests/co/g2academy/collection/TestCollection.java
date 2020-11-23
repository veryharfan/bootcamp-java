package co.g2academy.collection;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;

public class TestCollection {

    @Test
    public void testUsingAddAllMethodInList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ajay");

        ArrayList<String> secondList = new ArrayList<>();
        secondList.add("Ravi");
        secondList.add("Hanumat");

        list.addAll(secondList);

        //expected result? there are 5 items in list
        int actual = list.size();
        assertEquals(5, actual);
    }

    @Test
    public void testUsingRemoveAllMethodInList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ajay");

        ArrayList<String> secondList = new ArrayList<>();
        secondList.add("Ravi");
        secondList.add("Hanumat");

        list.removeAll(secondList);

        //expected result? there are 2 items in list
        int actual = list.size();
        assertEquals(2, actual);
        assertEquals("Vijay", list.get(0));
        assertEquals("Ajay", list.get(1));
    }

    @Test
    public void testUsingRetainAllMethodInList() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ajay");

        ArrayList<String> secondList = new ArrayList<>();
        secondList.add("Ravi");
        secondList.add("Hanumat");

        list.retainAll(secondList);

        //expected result? there are 5 items in list
        int actual = list.size();
        assertEquals(1, actual);
        String actualRavi = list.get(0);
        assertEquals("Ravi", actualRavi);
    }
}
