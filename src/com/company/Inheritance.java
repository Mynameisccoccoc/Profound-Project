package com.company;
/*class Shape{
    String color;
}

class Triangle extends Shape{
}*/

//single level Inheritance
class Shape {
    public void area(){
        System.out.println("display area");

    }
}

class Triangle extends Shape{
    public void area(int l,int h){
        System.out.println(1/2*l*h);

    }
}
//multiple level inheritance
class EquilateralTriangle extends Triangle{
    public void area(int l,int h){
        System.out.println(1/2*l*h);

    }
}
//Hirerarchial inheritance
class Circle extends Shape{
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}
//Hybrid inheritance
public class Inheritance {
    public static void main(String[] args) {
        /*Triangle t1= new Triangle();
        t1.color = "red";*/


    }
}
