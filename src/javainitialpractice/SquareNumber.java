package javainitialpractice;

public class SquareNumber {
    static int roi=6;
    //    public static void main(String[] args) {
//        double d=3.9;
//        double myOwnNumber=(d*d);
//        System.out.println(myOwnNumber);
//        myOwnNumber=Math.pow(d,2);
//        System.out.println(myOwnNumber);
//    }
    public static void method1() {
        int t=9;
        System.out.println("static method1 calling");
    }

    public void method2() {
         int t=9;
         
        System.out.println("non static method2 calling");
    }

    public static void main(String[] args) {
        SquareNumber.method1();
        SquareNumber object = new SquareNumber();
        object.method2();
//method2();
    }
}
