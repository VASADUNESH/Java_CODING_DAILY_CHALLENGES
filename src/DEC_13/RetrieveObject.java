package DEC_13;

import java.io.*;
import java.util.*;

public class RetrieveObject {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Student.txt"))) {
            List<Student> students =  (List<Student>) ois.readObject();
            
            for (Student student : students) {
                System.out.println(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}