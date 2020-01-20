package studentdemo;

import java.util.Scanner;

/**
 *This class 
 *
 * @author Zhaoxu Han
 */
public class StudentDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       String [] students = new String[5];
       for (int i = 0; i<students.length; i++){
           System.out.println("Enter the student name");
           String name = input.nextLine();
           String student = name;
           students [i]=student;
           System.out.println(student);
           System.out.println("Hello, the world");
       }
    }

}
