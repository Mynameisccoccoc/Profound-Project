package profound;

public class lecture1 {
    public static void main(String[] args) {
//write a program to pass two number from command line and to print greater number
        /*int n1 = Integer.parseInt(String.valueOf(0));
        int n2 = Integer.parseInt(String.valueOf(1));
        if (n1>n2)
            System.out.println("greater number="+n1);
        else
            System.out.println("greater number="+n2);*/


    // write a program to pass 3 number from command line and print greater number from that 3 number in java

        int n1 = Integer.parseInt(String.valueOf(0));
        int n2 = Integer.parseInt(String.valueOf(1));
        int n3 = Integer.parseInt(String.valueOf(2));
        if (n1>n2 && n1>n3)
            System.out.println("greater number="+n1);
        else if (n2>n3)
            System.out.println("greater number="+n2);
        else
            System.out.println("greater number="+n3);


    }
}

// wrp to pass single command line and check the char is the vowel char or not

//write a program to pass 3 number from command line and print greater number from that 3 number
//>>javac Number.java
//>>java Number 9 5