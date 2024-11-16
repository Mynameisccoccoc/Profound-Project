/*package bank;
class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("writing something");
    }
    public void printColor(){
        System.out.println(this.color);
    }
}*/
class Student{
    String name;
    int age;

    public void printName(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    //non parameter constructor
    /*Student(){
        System.out.println("constructor");
    }

    //parameter constructor
    Student(String name , int age ){
        this.name = name;
        this.age = 45;
    }*/

    //copy constructor
    Student (Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }
    Student(){

    }
}
public class Bran {
    public static void main(String[]args){
        /*Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "gel";

        pen1.write();

        Pen pen2 = new Pen();
        pen2.color = "black";
        pen2.type = "ball";

        pen1.printColor();
        pen2.printColor();*/

        /*Student s1 = new Student();
        s1.name = "Shagr";
        s1.age = Integer.parseInt("45");*/

//        Student s1 = new Student("aman",65);
//        s1.printName();

        Student s1 = new Student();
        s1.name = "afge";
        s1.age = 89;

        Student s2 = new Student(s1);
        s2.printName();




    }
}
