/**
    This program generates a random integer between 1 and 10
    and prompts the user to guess it.  The program will answer
    higher or lower until the user guesses correctly.
*/

import java.util.Scanner;

public class NumberGuess
{
    public static void main(String args[])
    {
        int toGuess = (int)Math.random() * 10 + 1;
        Number userGuess = new Number();
        boolean done = false;
        String outOfBounds = "Error: please enter integers between one and ten only.";
        while(!done)
        {
            Scanner in = new Scanner(System.in);
            System.out.print("I'm thinking of a number between one and ten.  Try to guess: ");
            if(in.hasNextInt())
            {
                if(userGuess.setNumber(in.nextInt()))
                {
                    if(userGuess.testNumber(toGuess))
                    {
                        done = true;
                    }
                }
                else
                {
                    System.out.println(outOfBounds);
                }
            }
            else
            {
                System.out.println(outOfBounds);
            }
        }
    }
}
