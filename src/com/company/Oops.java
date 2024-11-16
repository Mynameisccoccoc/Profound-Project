package com.company;
/*class Pen{
    String color;
    String type;         //first program

    public void write(){
        System.out.println("Writing something");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}*/

class Students{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }

    /*Students(){
        System.out.println("Constructor called");
    }*/

    /*Students(String name,int age){
        this.name = name;
        this.age = age;
    }*/

    Students(Students s2){
        this.name = s2.name;
        this.age = s2.age;
    }

    Students(){

    }
}
public class Oops {
    public static void main(String[] args){
        /*Pen pen1 = new Pen();
        pen1.color = "blue";
        pen1.type = "Gel";

        pen1.write();     //first program

        Pen pen2 = new Pen();
        pen2.color = "Black";
        pen2.type = "ballpoint";

        pen1.printColor();
        pen2.printColor();*/

        /*Students s1 = new Students();
        s1.name = "aman";
        s1.age = 24;
        s1.printInfo();*/

        /*Students s1 = new Students("aman",23);
        s1.printInfo();*/

        Students s1 = new Students();
        s1.name = "aman";
        s1.age = 24;

        Students s2 = new Students(s1);
        s2.printInfo();

    }
}
