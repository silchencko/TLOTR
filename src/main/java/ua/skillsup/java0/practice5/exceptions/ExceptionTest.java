package ua.skillsup.java0.practice5.exceptions;

import javax.naming.NamingException;

/**
 * @author Anton Chernetskij
 */
public class ExceptionTest {

    public void a(int a) throws MyException, NamingException {
        if (a > 5) {
            throw new MyException("Too much");
        } else if (a < 0) {
            throw new MyChildException("Too few");
        } else {
            throw new NamingException("sd");
        }
//        System.out.println("234234");
    }

    public void b(int b) throws NamingException, MyException {
        try{
            a(b);
        } finally {
            System.out.println("#");
        }
    }

    public void c(int c){
        try {
            System.out.println("1");
            b(c);
            System.out.println("2");
        } catch (MyChildException e) {
            System.out.println("3");
        } catch (MyException e) {
            System.out.println("4");
        } catch (NamingException e) {
            System.out.println("5");
        } finally {
            System.out.println("6");
        }
    }

    public void d(int d){
        try {
            b(d);
        } catch (NamingException | MyException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        ExceptionTest test = new ExceptionTest();
//        test.c(-7);
        test.d(-1);
    }
}
