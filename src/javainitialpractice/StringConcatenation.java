package javainitialpractice;

public class StringConcatenation {
    public static void main(String[]args){
        int a=100;
        int b=200;
        System.out.println(a);
        System.out.println(b);
        System.out.println(a+b);

        String x="mukesh";
        String y="code";
        System.out.println(x+a);
        System.out.println(x+y+a+b);
        System.out.println(x+y+(a+b));
        char c='a';
        char d='b';
        System.out.println('a'+'b'+x+y);
    }
}
