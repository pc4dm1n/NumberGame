public class Number
{
    private int number;
    private int noGuesses;
    
    /**
        Assigns a value to number instance variable
        @param input the integer to assign to number
    */
    public boolean setNumber(int input)
    {
        if(validGuess(input))
        {
            number = input;
            setNoGuesses();
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public int getNumber()
    {
        return number;
    }
    
    /**
        Tracks the number of user inputs
    */
    private void setNoGuesses()
    {
        noGuesses++;
    }
    
    /**
        Returns the number of guesses made
        @return the number of guesses entered
    */
    private int getNoGuesses()
    {
        return noGuesses;
    }
    
    /**
        Tests whether the user-supplied guess is the same
        as the system generated number.
        @param toGuess the system's generated number
        @return an integer representing one of three possible states (high, low, equal)
    */
    public boolean testNumber(int toGuess)
    {
        if(number > toGuess)
        {
            System.out.println("Lower."); // guess was too high
            return false;
        }
        else if(number < toGuess)
        {
            System.out.println("Higher."); // guess to was too low
            return false;
        }
        else
        {
            System.out.printf("Congratulations!  You won after guessing correctly with only %d tries!", getNoGuesses());
            return true;
        }
    }
    
    /**
        Tests whether user supplied input is as expected
        @param input is the user-supplied integer
        @return boolean
    */
    private boolean validGuess(int input)
    {
        if(input > 10 || input < 1)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
}
