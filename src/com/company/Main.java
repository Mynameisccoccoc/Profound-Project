package com.company;


import java.util.Arrays;
import java.util.*;
public class Main {
    public static void main(String[] args){
        int a[]={5,4,11,6,7,1,45,3,8,9};
        System.out.println("Element in array are");
        System.out.println(Arrays.toString(a));
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the index of the required element:");
        try
        {
            int element=sc.nextInt();
            System.out.println("Enter in the given index is: "+a[element]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index error");
        }
    }
}