package com.company;

public class Kota {
    /*private static int Score;

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int type=sc.nextInt();
        type=Score;
        /*if (Score < 5){
            System.out.println("New company");
        }
        else {
            System.out.println("there is not perminent");
        }*/
        /*int i;
        for (i=0; i<999999999; i++){
            System.out.println("New company");
        }
        while (Score==4){
            System.out.println("New port");
        }*/
    public int subNumber(int x,int y){
        int subtract = x-y;
        return subtract;
    }
    public static boolean main(String[] args){
        int num1 = 57;
        int num2 = 67;
        Kota ko = new Kota();
        int outcome = ko.subNumber(num1,num2);
        System.out.println("outcome is: " + outcome);
        return false;
    }
}
