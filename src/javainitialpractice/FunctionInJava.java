package javainitialpractice;

public class FunctionInJava {

    public void test(){
        System.out.println("test method");
    }
    public void getInfo(){
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println(c);
    }
    public int getBillAmount(){
        System.out.println("getBillAmount");
        int foodBill=100;
        int tax=20;
        int finalAmount=foodBill + tax;
        return finalAmount;
    }
    public String getTrainerName(){
        System.out.println("getTrainerName");
        String name="naveen";
        return name;
    }

    public static void main(String[]args){
        FunctionInJava obj=new FunctionInJava();
        obj.test();
        obj.getInfo();
        int m=obj.getBillAmount();
        System.out.println(m);
        String n= obj.getTrainerName();
        System.out.println(n);

    }
}
