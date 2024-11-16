 /*System.out.println("Input number of Student: ");
        //int n= Integer.parseInt(in.nextLine().trim());
        int n=sc.nextInt();
        System.out.println("Input student name,marks: ");
        Student stud= new Student();
        Student max =new Student();
        Student min=new Student(" ",100);
        for (int i=0;i<n;i++){
            stud.name=sc.nextInt();
            stud.marks=sc.nextInt();
            if (max.marks<stud.marks)
            {
                max.name=stud.name;
                max.name=stud.marks;
            }
            if (min.marks>stud.marks)
            {
                min.name=stud.name;
                min.marks=stud.marks;
            }
        }
        System.out.println("Name of marks of student having highest marks: " + max.name + " " + max.mark);
        System.out.println("Name of marks of student having lowest marks: " + max.name + " " + max.mark);*/
 package com.company;
 import java.util.Scanner;

 public class Lite {
     public static void main(String[] args){
         Scanner in=new Scanner(System.in);
        String[] cityName =new String[5];
        System.out.println("Enter 5 city names: ");
        for (int i=0;i<5;i++){
            cityName[i] = String.valueOf(in.nextInt());
        }

        System.out.println("5 city name are: ");

        for (String element  : cityName){
            System.out.println(element);
        }
    }
}
