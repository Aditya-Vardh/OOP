package student;

import java.util.Scanner;

public class student {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("NAME: ");
        String name = sc.nextLine();

        System.out.print("Age: ");
        int age = sc.nextInt();

        System.out.print("ROLL NO: ");
        long roll = sc.nextLong();

        System.out.println("name: " + name);
        System.out.println("age: " + age);
        System.out.println("roll no: " + roll);
    }
}
