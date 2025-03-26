package javainitialpractice;

public class Util {

String name;
int age;
static final String compName="Google";

public void getInfo(){
    System.out.println("get info");
}
public static void senMail(){
    System.out.println("send mail");
}
    public static void main(String[]args){
    Util u= new Util();
    u.name="ekta";
    u.age=35;
    u.getInfo();
    System.out.println(Util.compName);
    Util.senMail();

    }
}
