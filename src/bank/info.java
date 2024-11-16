package bank;

public class info {
    public static void main(String[] args) {

//        System.out.println(5+9);
//
//        String name;
//        name = "Abz";
//        System.out.println(name);
//
//        int myNum = 15;
//        myNum = 20;

//        int Num = 5;
//        float myFloatNum = 5.99f;
//        char myLetter = 'D';
//        boolean myBool = true;
//        String myText = "Hello";

//        String firstName = "John ";
//        String lastName = "Doe";
//        String fullName = firstName + lastName;
//        System.out.println(fullName);

//        int x, y, z;
//        x = y = z = 50;
//        System.out.println(x + y + z);

        /*double myDouble = 9.78d;
        int myInt = (int) myDouble;

        //in java int float char ... are called primitive data type

        //Automatic casting in java
        int Int = 9;
        double Double = myInt; // Automatic casting: int to double
        System.out.println(Int);      // Outputs 9
        System.out.println(Double);*/   // Outputs 9.0

//        Arithmetic operators
//        Assignment operators
//        Comparison operators
//        Logical operators
//        Bitwise operators


//         +	Addition	Adds together two values	x + y
//         -	Subtraction	Subtracts one value from another	x - y
//         *	Multiplication	Multiplies two values	x * y
//         /	Division	Divides one value by another	x / y
//         %	Modulus	Returns the division remainder	x % y
//         ++	Increment	Increases the value of a variable by 1	++x
//        --	Decrement	Decreases the value of a variable by 1	--x

//        int j = 10;
//        j += 5;
//        System.out.println(j);

//        ==	Equal to	x == y
//        !=	Not equal	x != y
//        >	Greater than	x > y
//        <	Less than	x < y
//        >=	Greater than or equal to	x >= y
//        <=	Less than or equal to	x <= y

//        && 	Logical and	Returns true if both statements are true	x < 5 &&  x < 10
//        || 	Logical or	Returns true if one of the statements is true	x < 5 || x < 4
//        !	Logical not	Reverse the result, returns false if the result is true	!(x < 5 && x < 10)

        /*String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        String txts = "Hello World";
        System.out.println(txts.toUpperCase());   // Outputs "HELLO WORLD"
        System.out.println(txts.toLowerCase());   // Outputs "hello world"

        String txtl = "Please locate where locate occurs!";
        System.out.println(txtl.indexOf("locate")); // Outputs 7
        System.out.println(txtl.indexOf("where"));
        System.out.println(txtl.codePointCount(0,14));

        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);//String concatenation
                               //OR
        String firstNames = "John ";
        String lastNames = "Doe";
        System.out.println(firstNames.concat(lastNames));*/

       /*tring x = "10";
        String y = "20";
        String z = x + y;  // z will be 1020 (a String) is do not add both value
        System.out.println(z);

        String txt = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt);
        String txts = "The character \\ is called backslash.";
        System.out.println(txts);
        String txtz = "It\'s alright.";
        System.out.println(txtz)*/

//        \n	New Line
//        \r	Carriage Return  //this is common escape sequences
//        \t	Tab
//        \b	Backspace
//        \f	Form Feed

//boolean expression
        /*int p = 10;
        System.out.println(p == 10);

        int myAge = 25;
        int votingAge = 18;
        System.out.println(myAge >= votingAge);

        int myAg = 25;
        int votingAg = 18;

        if (myAg >= votingAg) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("Not old enough to vote.");
        }*/


//conditional statement
        /*Scanner sc = new Scanner(System.in);
        int time = sc.nextInt();
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }*/

        //Java Short Hand If...Else (Ternary Operator)

        /*int times = 20;
        if (times < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
        //OR

        int timer = 20;
        String result = (timer < 18) ? "Good day." : "Good evening.";
        System.out.println(result);*/


//Java Switch Statements
        /*int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

        int days = 4;
        switch (days) {
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Looking forward to the Weekend");
        }*/

//Java while loop
        /*int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }*///this while loop will print number 0 to 4

//Do/While loop
        /*int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 5);*/

//For loop in java
        /*for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
        //This example will only print even values between 0 and 10
        for (int i = 0; i <= 10; i = i + 2) {
            System.out.println(i);
        }*/

//Nested Loop
        // Outer loop
        /*for (int i = 1; i <= 2; i++) {
            System.out.println("Outer: " + i); // Executes 2 times

            // Inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println(" Inner: " + j); // Executes 6 times (2 * 3)
            }
        }*/
       /*for (int i=0;i<5;i++){
           System.out.println("*");
           for (int j=0;j<5;j++){
               System.out.println("*");
           }
       }*/

//For-Each Loop
        /*String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }*/

//Java Break
        /*for (int i = 0; i < 10; i++) {
            if (i == 4) {
                break;
            }
            System.out.println(i);
        }*/

//Continue
        /*for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            }
            System.out.println(i);
        }*/

//Break and Continue in While Loop
        /*int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            }
        }*/

        /*int i = 0;
        while (i < 10) {
            if (i == 4) {
                i++;
                continue;
            }
            System.out.println(i);
            i++;
        }*/

//Java array
//        String[] cars;
//        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
//        int[] myNum = {10, 20, 30, 40};

        /*String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars[0]);*/

// Change an Array Element
        /*String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        cars[0] = "Opel";
        System.out.println(cars[0]);*/

//Array Length
        /*String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        System.out.println(cars.length);*/

//Java Arrays Loop
        /*String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }*/

        /*String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }*/

//Java Multi-Dimensional Arrays
        /*int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers[0]/*one for the array*///[2]/*one for the element inside that array);*/

//Change Element Values
        /*int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        myNumbers[1][2] = 9;
        System.out.println(myNumbers[1][2]); // Outputs 9 instead of 7*/

//loop Through a Multi-Dimensional Array
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        for (int i = 0; i < myNumbers.length ; ++i) {
            for (int j = 0; j < myNumbers[i].length; ++j) {
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}