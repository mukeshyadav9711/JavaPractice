package javainitialpractice;

public class IncrementalDecrementalOperator {
    public static void main(String[]args){

        int i=10;
        int j=i++;
        System.out.println(j++);
        System.out.println(i);

        int m1=5;
        int t1=m1++;
        System.out.println(t1);

        int l1=99;
        int n1=++l1;
        System.out.println(n1);
        System.out.println(l1);

        //post decremental operator
        int p1=2;
        int q1=p1--;
        System.out.println(p1);
        System.out.println(q1);

        int v=-999;
        int k=v--;
        System.out.println(v);
        System.out.println(k);

        //pre decrement:first decrese then assign

        int pop=10;
        System.out.println(--pop);

    }
}
