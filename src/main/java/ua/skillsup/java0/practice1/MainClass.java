package ua.skillsup.java0.practice1;

import ua.skillsup.java0.practice2.network.Person;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int b = 0;
        int[] c = {1, 2, 3};
        Person person = new Person(true, "Jane", (byte) 3);
        a(b, c, person);
        System.out.println(b);
        System.out.println(Arrays.toString(c));
        System.out.println(person);
    }

    static void a(int b, int[] c, Person person){
        b += 10;
        c[0] = 10;
        person.id = 10;
    }

    static Person switchGender(Person person){
        person.isWoman = ! person.isWoman;
        return person;
    }
}
