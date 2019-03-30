package ch.juventus.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionExample {

    public String someFunction(int id) throws MyException {
        throw new MyException("An error occurred");
    }


    public int someOtherFunction(String url) {
        try {
            someFunction(42);
            int l = url.length();
            return url.substring(l).indexOf("://");
        } catch (MyException ex) {
            System.out.println(ex.getMessage());
        } catch (Exception e) {
            System.out.println("An error occured.");
        }
        return -1;
    }

    public void readFile() {
        try (FileReader fr = new FileReader("persons.txt")) {
            readPersons(fr);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void readPersons(FileReader fr) {
        // nothing
    }



}
