package profound;

public class lecture4 {
    public static void main(String[] args) {
        /*int k;
        int j;
        for (int i=1;i<=5;i++){
            for (k=4; k>=i; k--){
                System.out.print(" ");
            }
            for (j = 1; j<=i; j++){
                System.out.print(" *");
            }
            System.out.print("\n");
        }*/
        //wrp to accept two number from user and print multiplication of that two without using int operator
        /*Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int n1=sc.nextInt();
        System.out.println("enter second number");
        int n2=sc.nextInt();
        int mul=0;
        for (int a=1;a<=n2;a++){
            mul=mul+n1;
        }
        System.out.println("Multiplication="+mul);*/

        //wrp a program to accept two number from user and divide the first number by second number without using divide operator

        //wrp to pass one string from command line and count the number of vowels
        /*int count =0;
        for (int i=0;i<args[0].length();i++){
            char ch=args[0].charAt(i);
            if (ch=='a' ||ch='e' ||ch='i' ||ch='o' ||ch='u'){
                count++;
            }
        }
        System.out.println("no of vowels="+count);*/
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter rollno");
        int rn=sc.nextInt();
        System.out.println("enter name");
        sc.nextLine();//option
        String nm=sc.next();
        System.out.println("Enter marks");
        int m=sc.nextInt();
        System.out.println("Rollno=" +rn+ " name=" +nm+ " marks="+m);*/

        //wrp to print all prime numbers between 1 to 100
        int n1=5;
        for (n1=2;n1<=100;n1++){
            boolean flag=true;
            for (int a=2;a<=n1/2;a++){
                if(n1%a==0){
                    flag=false;
                    break;
                }
            }
            if(flag==true)
                System.out.println(n1);
        }

        //wrp to print all armstrong numbers between 100 and throusand
    }
}
