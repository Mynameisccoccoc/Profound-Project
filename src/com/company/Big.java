package com.company;

import java.util.Scanner;

class Big {
    //public static void main(String[] args){
        private String accno;
        private String name;
        private long balance;

        Scanner sc=new Scanner(System.in);

        void openAccount(){
            System.out.println("Enter Account No: ");
            accno = sc.next();
            System.out.println("Enter Name: ");
            name = sc.next();
            System.out.println("Enter Balance: ");
            balance = Long.parseLong(sc.next());
        }

        void showAccount(){
            System.out.println(accno + "," + name + "," + balance);
        }

        void deposit(){
            long amt;
            System.out.println("Enter Amount U want to Deposit: ");
            amt =sc.nextLong();
            balance =balance+amt;
        }

        void withdrawal(){
            long amt;
            System.out.println("Enter amount u want to withdraw");
            amt = sc.nextLong();
            if (balance>= amt){
                balance = balance-amt;
            }else {
                System.out.println("Less balance..transaction failed..");
            }
        }

        boolean search(String acn){
            if (accno.equals(acn)){
                showAccount();
                return (true);
            }
            return (false);
        }
}

class Exbank{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("How many customer u want to input: ");
        int n=sc.nextInt();
        Big[] c =new Big[n];
        for (int i=0;i<c.length;i++){
            c[i]=new Big();
            c[i].openAccount();
        }

        int ch;
        do {
            System.out.println("Main menu\n 1. Display All\n 2. Search By Account\n 3. Deposit\n 4. Withdrawal\n 5. Exit");
            System.out.println("Ur Choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    for (int i = 0; i < c.length; i++) {

                    }
                    break;

                case 2:
                    System.out.println("Enter account no u want to search...:");
                    String ach= sc.next();
                    boolean found =false;
                    for (int i=0;i<c.length;i++){
                        found =c[i].search(ach);
                        if (found){
                            System.out.println("Search failed..Account not exist..");
                        }
                        break;
                    }

                case 3:
                    System.out.println("Enter account no: ");
                    ach=sc.next();
                    found=false;
                    for (int i=0;i<c.length;i++){
                        found=c[i].search(ach);
                        if (found){
                            c[i].deposit();
                            break;
                        }
                    }
                    if (!found){
                        System.out.println("Search failed.account not exist..");
                    }
                    break;

                case 4:
                    System.out.println("Enter account no:");
                    ach= sc.next();
                    found=false;
                    for (int i=0;i<c.length;i++){
                        found=c[i].search(ach);
                        if (found){
                            c[i].withdrawal();
                            break;
                        }
                    }
                    if (!found){
                        System.out.println("Search failed.account not exist..");
                    }
                    break;
            }

        }
        while (ch!=5);
    }
}