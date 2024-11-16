package com.company;

import java.util.Scanner;

public class Miniproject {
    public static void main(String[] args){
        //mini project
        Scanner sc = new Scanner(System.in);
        int myNumber = (int) (Math.random()*100);
        int userNumber = 0;
        do {
            System.out.println("Guss my number : ");
            userNumber = sc.nextInt();

            if (userNumber == myNumber){
                System.out.println("Woohoo .. correct number!!!");
                break;
            } else if (userNumber > myNumber) {
                System.out.println("Your number is too large ");
            }
            else {
                System.out.println("Your nymber is too small");
            }
        }while (userNumber >= 0);
        System.out.println("My number was : ");
        System.out.println(myNumber);
    }
}
