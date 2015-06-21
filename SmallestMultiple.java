package smallest.multiple;

/**
 *
 * @author KW
 */

public class SmallestMultiple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Poszukiwana liczba to: " + smallestMultiple(20));
    }
    
    //  Public : Compute the smallest number that can be divided by each of the numbers 
    //  from 1 to given limit without any remainder.
    //
    //  upperLimit − the highest factor that has to divide the number without any reminder
    //
    //  Examples
    //
    //  smallestMultiple(4)
    //  => 12
    //
    //  isPrime(10)
    //  => 2520
    //
    //  Returns the smallest multiple of following numbers from 1 to N
    public static int smallestMultiple(int upperLimit)
    {
        int highestPrime = highestPrime((short)upperLimit);
        int product = highestPrime * upperLimit;
        for(int i = product ; ;i += product)
        {
            System.out.println("Sprawdzam liczbę: " + i);
            if(canBeDivided(i,upperLimit))
            {
                return i;
            }
        }
    }
    
    public static short highestPrime(short maxNum)
    {        
        for (short i = maxNum ; i >= 1 ; i--) 
        {
            if(isPrime(i))
            {
                return i;
            }
        }
        return 0;
    }
    
    public static boolean isPrime(int x)
    {
        for(int i = x-1 ; i > 1 ; i--)
        {
            if(x%i == 0)
            {
                return false;
            }
        }
        return true;
    }
    
    public static boolean canBeDivided(int x,int highestFactor)
    {
        for(int i = highestFactor ; i > 1 ; i--)
        {
            if(x%i != 0)
            {
                return false;
            }
        }
        return true;
    }
}
