//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите свой возраст: ");
//        int age = scanner.nextInt();
//        System.out.println(age == 18 ? "Вы 2006 года рождения" : "Вы года рождения больше");
//
//    }
//
//}

import java.util.ArrayList;
import java.util.List;

class Test {
    private final List foo;

    public Test() {
        foo = new ArrayList();
        foo.add("foo");
    }
    static int a = 12;

    public static void main(String[] args) {
        Test t = new Test();
        t.foo.add("bar");
        System.out.println("print - " + t.foo);
        System.out.println(a);

    }
}