package ua.skillsup.java0.practice2.access;

public class CoolClass {
    private void privateMethod(){
        System.out.println("I'm private!");
    }

    protected void protectedMethod(){
        System.out.println("I'm protected!");
    }

    void defaultMethod(){
        System.out.println("I have default visibility");
    }

    public void publicMethod(){
        System.out.println("I'm public!");
    }

    public static void staticMethod(){
        System.out.println("I'm static!");
    }
}
