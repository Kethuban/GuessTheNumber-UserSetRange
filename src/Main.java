//importing the scanner library
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        //Intialize scanner
        Scanner keyboard = new Scanner(System.in);
        //DECLARE VARIABLES
        int randomNum, guess, max, min, count;
        boolean again;

        //making again true to start the while loop
        again = true;

        //intiliazing the count variable
        count = 0;
        //while the again variable is equal to true the program inside will run
        while ( again == true){
            //adding one to the counter each time the loop runs
            count = count + 1;
            //Printing the instructions for the user
            System.out.print("Enter the maximum number for the range: ");
            //storing the number entered by the user in the variable max
            max = keyboard.nextInt();

            //Printing the instructions for the user
            System.out.print("Enter the minimum number for the range: ");
            //storing the number entered by the user in the variable min
            min = keyboard.nextInt();

            randomNum = (int)(Math.random()*max)+min;

            //Printing the instructions for the user
            System.out.print("Guess a number between " + min +  " - " + max + ":");
            //storing the number entered by the user in the variable guess
            guess = keyboard.nextInt();
            //if the guess is between the minimum and the maximum the program will analyze the user guess
            if (guess >= min && guess <= max)
            {
                //if the guess is equal to the random number the program will print the following
                if (guess == randomNum)
                {
                    System.out.println("You got it! It took you " + count + " try/tries!");
                    break;
                }
                // if the guess is less than the number the program determined it will print the following
                else if (guess < randomNum)
                {
                    System.out.println("Too low");
                }
                // if the guess is greater than the random number it will print the following
                else if (guess > randomNum)
                {
                    System.out.println("Too high!");
                }
            }
            //if the guess is not between the minimum and the maximum the program will print the following
            else
            {
                System.out.println("Invalid input!");
            }
        }
    }
}