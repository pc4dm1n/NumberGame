/**
    This program generates a random integer between 1 and 10
    and prompts the user to guess it.  The program will answer
    higher or lower until the user guesses correctly.
*/

import java.util.Scanner;

public class NumberGame
{
    public static void main(String args[])
    {
        Number toGuess = new Number();
        toGuess.setRange(10);
        toGuess.setOffset(1);
        
        toGuess.setNumber((int)(Math.random() * toGuess.getRange() + toGuess.getOffset()));
        PlayerNumber userGuess = new PlayerNumber();
        boolean done = false;
        String outOfBounds = "Error: please enter integers between %d and %d only.\n";
        while(!done)
        {
            Scanner in = new Scanner(System.in);
            System.out.printf("I'm thinking of a number between %d and %d.  Try to guess: ", toGuess.getOffset(), toGuess.getRange());
            if(in.hasNextInt())
            {
                if(userGuess.setNumber(in.nextInt()))
                {
                    userGuess.setGuesses();
                    if(userGuess.testNumber(toGuess.getNumber()))
                    {
                        done = true;
                    }
                }
                else
                {
                    System.out.printf(outOfBounds, toGuess.getOffset(), toGuess.getRange());
                }
            }
            else
            {
                    System.out.printf(outOfBounds, toGuess.getOffset(), toGuess.getRange());
            }
        }
    }
}
