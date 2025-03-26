package javainitialpractice;

import java.util.Scanner;

public class Calculation {
    public static void main(String[] args) {
        System.out.println("Please enter two different values and I will add them.......");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println("Well well your addition is ready and that is...... : "+(number2+number1));
    }
}

