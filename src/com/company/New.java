package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class New {
    public static void main(String[] args){
        //String name = sc.next();
        //System.out.println("Hello" + name +"Have a good day!");
        System.out.println("What is your name");
        Scanner sc=new Scanner(System.in);
        String name = sc.next();
        System.out.println("Abusufiyan"+name);
        try {
            int elemment = sc.nextInt();
            System.out.println("Rohit" + elemment);
        } finally {

        }
        System.out.println("args =56 " + Arrays.deepToString(args));
    }
}
