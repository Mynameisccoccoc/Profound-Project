package com.company;
/*abstract class Animal{
    abstract void walk();
    Animal(){
        System.out.println("you are creating a new instructor");
    }
    public void eat(){
        System.out.println("Animal eats");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("Created a Horse");
    }
    public void walk(){
        System.out.println("walks on 4 legs");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("walk on 2 legs");
    }
}
interface Animal{
    int eyes = 2;//same for all animal
    void walk();
}

interface Herbibore{

}
class Horse implements Animal, Herbibore{//in java we use interfaces to implement two class on same class
    public void walk(){
        System.out.println("walk on 4 legs");
    }
}*/

class Studentor{
    String name;
    static String school;
    public static void changeSchool(){
        school = "Newschool";
    }
}

public class Abstraction {
    public static void main(String[] args){
        /*Horse horse = new Horse();
        horse.walk();
        horse.eat();
        horse.walk();*/

        String school = Studentor.school;
        Studentor.school="Abz";
        Studentor student1 = new Studentor();
        student1.name="tony";
        System.out.println(student1.school);
    }
}
