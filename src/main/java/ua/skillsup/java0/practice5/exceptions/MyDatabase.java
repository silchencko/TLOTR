package ua.skillsup.java0.practice5.exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * @author Anton Chernetskij
 */
public class MyDatabase {
    public void readAll() {
        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader("test.txt"));
            String filename;
            while ((filename = reader.readLine()) != null) {
                printFile(filename);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found, bro " + e.getMessage());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void printFile(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(
                new FileReader(filename));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
    }

    public static void main(String[] args) {
        new MyDatabase().readAll();
    }
}
