package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Pro {
    private static int i;

    public static void main(String[] args){
    int a[] =new int[10];
    Scanner sc= new Scanner(System.in);
        System.out.println("Enter the value");
        for (int i=0; i <a.length;i++);
        {
            a[i]= sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println("Stored array is:"+Arrays.toString(a));
    }
}
