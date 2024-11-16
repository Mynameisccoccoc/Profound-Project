package com.company;


import java.util.Scanner;

//public static void main(String[] args) {
        /*private String color;
        private int gears;

        public static int getNumberofWheels () {
            return 2;
        }

    public OOP(String color, int gears){
            this.color = color;
            this.gears = gears;
        }*/
//}
    public class OOP {
        //public void checkMarks(int marks) {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            int marks = sc.nextInt();
            if (marks == 50) {
                int i;
                for (i=0;i<50;i++){
                    System.out.println("I fail");
                }
                while (marks==55){
                    System.out.println("Easy");
                }
                System.out.println("Fail");
            } else {
                System.out.println("Pass");
            }
            String st="45";
            System.out.println(st);
        }

    }