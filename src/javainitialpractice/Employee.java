package javainitialpractice;

import javax.xml.namespace.QName;

public class Employee {

    String name;
    int age;
    double salary;
    boolean isPerm;

    public static void main(String[]args){
        Employee obj=new Employee();

        obj.name="tom";
        obj.age=20;
        obj.salary=12.33;
        obj.isPerm=true;

        System.out.println(obj.name+" "+obj.age+" "+obj.salary+" "+ obj.isPerm);
        Employee e1=new Employee();
        System.out.println(e1.name+" "+e1.age+" "+e1.salary+" "+ e1.isPerm);

        e1.name="Peter";
        System.out.println(e1.name+ " " +e1.age+" "+e1.salary+" "+e1.isPerm);

        //no reference object:not recomeded.
        new Employee().name="Ekta";
        new Employee().age=30;

        Employee e2=new Employee();
        e2.name="kavi";
        System.out.println(e2.name);
        e2=null;
        e2.age=20;//NPE: null pointer exception
        System.out.println(e2.age);


    }
}
