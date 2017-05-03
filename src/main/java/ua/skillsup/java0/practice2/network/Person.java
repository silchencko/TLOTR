package ua.skillsup.java0.practice2.network;

import java.util.Arrays;
import static java.lang.Math.*;


import static java.lang.Math.pow;

public class Person {
    static long NEXT_ID = 0;
    public long id;
    public boolean isWoman;
    String name;
    byte age;
    Person[] friends;

    public Person(boolean isWoman,
           String name, byte age){
        this.id = NEXT_ID++;
        this.isWoman = isWoman;
        this.name = name;
        this.age = age;
        friends = new Person[10];
    }

    private void addFriend(Person person){
        for (int i = 0; i < friends.length; i++) {
            if (friends[i] == null) {
                friends[i] = person;
                break;
            }
        }
    }

    static long getNextId(){

        return NEXT_ID;
    }

    int getNumBros(){
        int num = 0;
        for (int i = 0; i < friends.length; i++) {
            if (friends[i] != null &&
                    friends[i].isWoman == false){
                num++;
            }
        }
        return num;
    }

    void a(){
        System.out.println("Hello");
        int a = 4/0;
        System.out.println("world" + a);
    }
    void b(){
        a();
    }
    void c(){
        b();
    }
    public static void main(String[] args) {

        Person jane = new Person(true, "Jane", (byte) 24);
        jane.c();
        jane.addFriend(new Person(false, "John", (byte) 24));
        jane.addFriend(new Person(true, "Jane", (byte) 24));
        jane.addFriend(new Person(false, "Joe", (byte) 24));
        System.out.println(jane);
        jane.getNextId();
        Person.getNextId();
        sqrt(12);
        System.out.println(max(2,50));
    }


    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", isWoman=" + isWoman +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", friends=" + (friends == null ? null : Arrays.asList(friends)) +
                '}';
    }
}
