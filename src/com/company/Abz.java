package com.company;

import java.util.Scanner;

public class Abz {
    public static void main(String[] args){
        int array[]= new int[10];
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value:");
        for (int a=0;a< array.length;a++){

            array[a] = sc.nextInt();
        }
        System.out.println("The value are:");
        for (int i: array)
        {
            System.out.println(i+" ");
        }
    }
}
