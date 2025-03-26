package javainitialpractice;

public class ThreeNestedLoop {
    public static void main(String[]args){
        for(int t=1; t<=5; t++){
            for(int s=1; s<=5; s++){
                for(int f=1;f<=5;f++){
                    System.out.println(t+""+s+""+f);
                }
            }
        }
    }
}
