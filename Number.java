public class Number 
{
    private int number;
    private static int range; // single int representing the range of possible numbers
    private static int offset; // minimum possible number to guess
    
    /**
        Assigns a value to number instance variable
        @param input the integer to assign to number
        @return true if successful false if not
    */
    public boolean setNumber(int input)
    {
        if(validNumber(input))
        {
            number = input;
            return true;
        }
        else
        {
            return false;
        }
    }
    
    private boolean validNumber(int input)
    {
        if(input < offset || input > range)
        {
            return false;
        }
        else
        {
            return true;
        }
    }
    
    public int getNumber()
    {
        return number;
    }
        
    public void setRange(int input)
    {
        range = input;
    }
    
    public int getRange()
    {
        return range;
    }
    
    public void setOffset(int input)
    {
        offset = input;
    }
    
    public int getOffset()
    {
        return offset;
    }
}
