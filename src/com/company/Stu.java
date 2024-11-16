package com.company;
import java.util.*;

public class Stu {
    public static void main(String[] args){
        /*int a=19;
        char c=21;
        float f= 2.445f;
        double d=22d;
        long l=7856765876786l;
        short s=67;
        String str="My name is abz";
        System.out.println(str);
        synchronized ()
        Object int_arr;
        int arr;
        byte b=-128;
        int num1 =6;
        int num2=7;
        int num3=4;
        int sum=num1+num2+num3;
        boolean bol=true;
        System.out.println(bol);
        System.out.println(b);
        char ch ='A';
        System.out.println("My name is abusufiyan and my age is "+ sum);
        System.out.println(f);*/

        //System.out.println("Talking input from the user");
        //
        //boolean b1=sc.hasNextInt();
        //System.out.println(b1);
        //String str=sc.nextLine();
        //System.out.println(str);

        System.out.println("Enter your marks out of 100");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of subject english");
        int eng= sc.nextInt();
        System.out.println("Enter marks of subject mathematics");
        int mat= sc.nextInt();
        System.out.println("Enter marks of subject science");
        int sci= sc.nextInt();
        System.out.println("Enter marks of subject evs");
        int evs= sc.nextInt();
        System.out.println("Enter marks of subject history");
        int his= sc.nextInt();

        int sum=eng+mat+sci+evs+his;
        float per=(sum*100)/500f;
        System.out.println("your percentage is: "+per);
    }
}
