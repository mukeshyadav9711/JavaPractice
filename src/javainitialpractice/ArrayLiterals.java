package javainitialpractice;

import java.util.Arrays;

public class ArrayLiterals {
    public static void main(String[]args) {
        //int array:
        //1.using new:
        int i[] = new int[4];
        //2:array literals:
        int p[] = {1, 4, 3, 22, 12, 10, 7, 2, 4};
        System.out.println(p.length);
        System.out.println("li =" + 0);
        System.out.println("hi =" + (p.length - 1));

        System.out.println(p[0]);
        // System.out.println(p[10]);
        for (int e : p) {
            System.out.println(e);
        }
        System.out.println(Arrays.toString(p));

    }
    String students[] ={"jay","ravi","pooja"};

}
