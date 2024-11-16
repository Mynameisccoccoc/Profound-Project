package com.company;

import java.util.*;
//import java.util.Locale;
//import java.util.Scanner;
/*class Solution {
    static int B, H;

    static Scanner Sc = new Scanner(System.in);

    static {
        B = Sc.nextInt();
        H = Sc.nextInt();
    }
}*/
public class Block {
    public static void main(String[] args){
        /*if (Solution.B>0 && Solution.H>0){
            System.out.println(Solution.B*Solution.H);
        }
        else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }
}*/
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        // String s=???; Complete this line below

        String s = Integer.toString(n);

        if (n == Integer.parseInt(s)) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer.");
        }*/
        try (Scanner sc = new Scanner(System.in)) {
            int month = sc.nextInt();
            int day = sc.nextInt();
            int year = sc.nextInt();

            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.DATE, day);
            cal.set(Calendar.MONTH, month - 1);
            cal.set(Calendar.YEAR, year);

            System.out.println(cal.getDisplayName(Calendar.DAY_OF_WEEK,
                    Calendar.LONG, new Locale("hindi","INDIA")).toUpperCase());
        }
    }
}




