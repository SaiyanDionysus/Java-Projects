// Write a Java program to print 'Hello' on screen and your name on a separate line.
//Expected Output :
//Hello
//Alexandra Abramov

import java.util.*;

public class tasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите свое имя: ");
        String fname = scanner.next();
        System.out.print("Введите фамилию: ");
        String lname = scanner.next();
        System.out.print("Hello \n" + fname + " " + lname);
    }
}