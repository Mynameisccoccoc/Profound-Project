package profound;

public class lecture2 {
    public static void main(String[] args) {
        /*char ch=args[0].charAt(0);
        if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o'||ch=='u');
        System.out.println("its vowel");
        else
        System.out.println("its not a vowel");*/

    //write a prog to pass one mathematical operator and two number from command line
        //and perform the arithmetic operation on that two number as per the operator

        char ch=args[0].charAt(0);
        int num1 = Integer.parseInt(String.valueOf(1));
        int num2 = Integer.parseInt(String.valueOf(2));
        switch(ch)
        {
            case'+':
                System.out.println("Addition: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Subtraction: " + (num1 - num2));
                break;
            case'*':
                System.out.println("Multiplication: " + (num1 * num2));
                break;
            case '/':
                System.out.println("Division: " + (num1 / num2));
                break;
            default:
                System.out.println("wrong operator");
        }
        //wrp to print addition of first 10 numbers pass the ten from command line
        //wrp to pass one number from command line and print the factorial of that number
        //wrp to pass one number from command line and check number is the perfect number or not
        //wrp to pass any number from command line and print its reverse number
    }
}
