package javainitialpractice;

import java.util.Scanner;

//WAP to print weekdays in sequence of it occurrence
public class Weekdays {
    public static void main(String[] args) {
//        String nameOfTheDay = "";
        Scanner sc = new Scanner(System.in);


        String nameOfTheDay = sc.next();

        switch (nameOfTheDay) {
            case "Monday":
                System.out.println("First day of the week");
                break;
            case "Tuesday":
                System.out.println("Second day of the week");
                break;

            case "Wednesday":
                System.out.println("Third day of the week");
                break;
            case "Thursday":
                System.out.println("Forth day of the week");
                break;
            case "Friday":
                System.out.println("Fifth day of the week");
                break;
            case "Saturday":
                System.out.println("Sixth day of the week");
                break;
            case "Sunday":
                System.out.println("Last day of the week");
                break;
            default:
                System.out.println("Not a week day......");
        }

    }
}
