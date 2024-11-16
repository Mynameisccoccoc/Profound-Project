package com.company;

import java.util.*;

public class dowillloop {
    public static void main(String[] args) {
        /*int i=5;
        System.out.println("try while loop:");
        while (i<5);
        {
            System.out.println("Ileration" + ++i);
        }
        System.out.println("try while loop:");
        i=5;
        do {
            System.out.println("Ileration" + ++i);
        }
        while (i<5);*/

        /*Scanner sc=new Scanner(System.in);
        int i;
        System.out.println("Enter 0 to exit");
        while (true)
        {
            System.out.println("Enter any integer value:");
            i= sc.nextInt();
            if (i==0)
            {
                System.out.println("Program exit");
            }
            System.out.println("You entered:" + i);*/


       
        Scanner sc=new Scanner(System.in);
        
        char i = 0,j= (char) sc.nextInt();
        while (i++ <=1) {
            while (j <= 5) {
                System.out.println(j++);
            }
            System.out.println("");
            j =0;
        }
    }
}
