package javainitialpractice;
import java.util.Scanner;
public class AsciiValue{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch=scanner.next().charAt(0);//display ascii value
        System.out.println("the ASCII value"+ch+"is"+(int)ch);
        scanner.close();

    }

}
