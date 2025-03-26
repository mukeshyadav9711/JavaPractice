package javainitialpractice;

import java.util.Scanner;

public class FindVowel {
    public void findVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("it is vowel");
        } else {
            System.out.println("it is consonants");

        }
    }

    public static void main(String[] args) {
        FindVowel ob = new FindVowel();
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the input");
        char ch = sc.next().charAt(0);
        ob.findVowel(ch);
    }

}