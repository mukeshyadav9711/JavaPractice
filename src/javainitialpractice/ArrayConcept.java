package javainitialpractice;

public class ArrayConcept {
    public static void main(String[]args) {
        int i = 10;
        i = 20;
        i = 33;
        i = 40;
        System.out.println(i);

        //array:non primitive data types
        int j[] = new int[4];
        j[0] = 10;
        j[1] = 20;
        j[2] = 30;
        j[3] = 40;
        System.out.println(j[0]);
        System.out.println(j[3]);

        //use cases:month array
        //capacity of a bus:120
        int len;
        len = i;
        int hi=len-1;
        int li=0;
        System.out.println(len);
        System.out.println(hi);
        System.out.println(li);
    }
}

