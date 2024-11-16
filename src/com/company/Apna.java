package com.company;

import java.util.Scanner;

/*public class Apna {
    public static void main(String[] args){*/
        //maths class
        /*System.out.println(Math.max(5,6));
        System.out.println(Math.min(5,6));
        //random number
        System.out.println(Math.random());
        System.out.println((int) (Math.random()*100));

        //Scanner
        Scanner sc=new Scanner(System.in);
        System.out.println("Input your age");
        int age = sc.nextInt();
        System.out.println(age);
        //string
        String name = sc.nextLine();
        System.out.println(name);*/

        //comaprison operator
        //a==b
        //a!=b
        //a>b
        //a<b
        //a>=b

        /*boolean issunup = true;
        if (issunup== true) {
            System.out.println("day");
        }
        else {
            System.out.println("night");
        }

        int age = 30;
        if (age>30){
            System.out.println("can vote");
        }
        else {
            System.out.println("cant vote");
        }*/
        //logical operator &&----it check both operator is true then pass output
        /*int a=60;
        int b= 40;

        //if (a<50&&b<50){
          //  System.out.println("both less than 50");
        //}

        //logical or ||----it cheack one operator is true
        if (a<50 ||b<50){
            System.out.println("atleast both less than 50");
        }

        //logical ! not
        boolean isadult = true;
        if (!isadult==true){
            System.out.println("is adulr");
        }
        else {
            System.out.println("not adult");
        }*/

        //conditional statement
        /*Scanner sc =new Scanner(System.in);
        //pen = 10; , notebook = 40;
        int cash = sc.nextInt();
        if (cash <10){
            System.out.println("Cannot buy anything");
            System.out.println("get more cash");
        }
        else if (cash >10 && cash<50){
            System.out.println("can get 1 thing");
        }
        else {
            System.out.println("can get both");
        }*/

        //Switch
        /*int day = 1;//1-monday,2=tuesday

        switch (day){
            case 1:
                System.out.println("monady");
                break;//to stop print
            case 2:
                System.out.println("tuesday");
            default:
                System.out.println("wed - sun");
        }*/

        //loops
        //System.out.println("1");
        //System.out.println("2");
        //System.out.println("3");

        //to write a loops

        //for
        //for (int i=1;i<=100;i+1){//we want continue loop put i++
          //  System.out.println(i);
        //}
        //for (int i=100;i>=1;i=i-1){//we want continue loop put i--
          //  System.out.println(i);
        //}
                                 //OR
        //while
        //int j=100;
        //while (j>=1){
        //    System.out.println(j);
          //  j = j - 1;
        //}

        //dowhile
        //int k = 100;
        //do {
          //  System.out.println(k);
            //k = k - 1;
        //}while (k>=1);

        //Exercise

        /*Scanner sc= new Scanner(System.in);
        int number = 0;
        do {
            System.out.println("input a number");
            number = sc.nextInt();
            System.out.println("Here is your number");
            System.out.println(number);
        }while (number>=0);
        System.out.println("The end");*/

        //Break & Continue
        /*int i =0;
        while (true/*it runs in continue mode) {
            if(i == 3){
                i = i+ 1;// if we dont want to print 3 without breaking the statement
                continue;
            }
            System.out.println(i);
            i = i + 1;
            if (i > 5){
                break;
            }
        }*/

        //exception handling
        /*int[] marks = {97,98,95};
        try {
            System.out.println(marks[5]);
        }catch (Exception exception){
            //do something after catching
        }
        System.out.println("the name is Aman");*/

        //function method
        public class Apna {
            public static void printJava(){
                System.out.println("Hello world");
            }
            public static void printName(String name){
                System.out.println(name);
            }
            public static void printSum(int a,int b){
                int sum = a+b;
                System.out.println(sum);
            }
            public static void main(String[] args){
                printJava();
                printJava();
                printJava();
                printName("Aman");
                printName("Akku");
                printSum(1,6);

    }
}
