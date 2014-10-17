public class PlayerNumber extends Number
{
    private int guesses;

    /**
        Tracks the number of user inputs
    */
    public void setGuesses()
    {
        guesses++;
    }    
    
    /**
        Returns the number of guesses made
        @return the number of guesses entered
    */
    private int getGuesses()
    {
        return guesses;
    }    

    /**
        Tests whether the user-supplied guess is the same
        as the system generated number.
        @param toGuess the system's generated number
        @return false if guess is wrong, true if correct
    */
    public boolean testNumber(int toGuess)
    {
        if(getNumber() > toGuess)
        {
            System.out.println("Lower."); // guess too high
            return false;
        }
        else if(getNumber() < toGuess)
        {
            System.out.println("Higher."); // guess too low
            return false;
        }
        else
        {
            System.out.printf("That's right!  You guessed correctly after %d tries.", this.guesses);
            return true;
        }
    }
}