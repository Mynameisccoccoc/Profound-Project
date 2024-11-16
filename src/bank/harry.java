package bank;

public class harry {
        public static void main(String[] args) {
           /* int i = 0;
            int userWinCounter = 0;
            int compWinCounter = 0;
            Scanner sc = new Scanner(System.in);

            while (i < 5) {
                System.out.println("Enter a choice: ");
                System.out.println("1. Rock\n2. Paper\n3. Scissors\n");
                byte userInput = (byte) sc.nextInt();
                Random ra = new Random();                    /* random number map:
        0: Rock
        1: Paper
        2: Scissors

                int compInput = ra.nextInt(3);
                String map = "s";
                switch (compInput) {
                    case 0:
                        map = "Rock";
                        break;
                    case 1:
                        map = "Paper";
                        break;
                    case 2:
                        map = "Scissors";
                        break;
                }

                // Tie condition:
                if (userInput == compInput + 1) {
                    System.out.println("Tie");
                    System.out.println("Computer played: " + map);
                    userWinCounter += 0;
                    compWinCounter += 0;
                    // Winning conditions for user:
                } else if (userInput == 1 && compInput == 2 || userInput == 2 && compInput == 0 || userInput == 3 && compInput == 1) {
                    System.out.println("Yay! You won!");
                    System.out.println("Computer played: " + map);
                    userWinCounter += 1;
                    compWinCounter += 0;
                    // Losing condition for user:
                } else if (userInput == compInput) {
                    System.out.println("Sorry, you lost :(");
                    System.out.println("Computer played: " + map);
                    userWinCounter += 0;
                    compWinCounter += 1;
                }
                i++;
            }

            if (userWinCounter == compWinCounter) {
                System.out.println("The series is a tie.");
            } else if (userWinCounter > compWinCounter) {
                System.out.println("You won the series.");
            } else System.out.println("You lost the series.");
            System.out.printf("Your score: %d, computer's score %d.", userWinCounter, compWinCounter);
*/
            /*int i = 1;
            while (i<=3){
                System.out.println(i);
                i++;
            }
            int b = 10;
            do {
                System.out.println(b);
                b++;
            }while (b<5);*/
            /*for (int i =1;i<=10;i++){
                System.out.println(i);
            }*/
            /*int[] marks = {23,54,23,45,67};
            float[] markes = {12.5f,45.6f,56.2f};
//            System.out.println(marks.length);
//            System.out.println(markes[2]);
//            System.out.println(marks[2]);
            for (int i=0;i<marks.length;i++){
                System.out.println(marks[i]);
            }
            //for reverse order
            for (int i=marks.length -1;i>=0;i--){
                System.out.println(marks[i]);
            }
            //arternate method to print statement
            for (int element: marks){
                System.out.println(element);
            }*/

            //2D array
            int [] marks;//1D array
            int [][] flats;//2D array
            flats = new int[2][3];
            flats[0][0]=101;
            flats[0][1]=102;
            flats[0][2]=103;
            flats[1][0]=201;
            flats[1][1]=202;
            flats[1][2]=203;

            for (int i=0;i<flats.length;i++) {
                for (int j=0; j<flats[i].length; j++) {
                    System.out.print(flats[i][j]);
                    System.out.print(" ");
                }
                System.out.println(" ");
            }
            int a = 5;
            int b = 7;
            int c = (a+b)*5;
        }
    }