

using System;
 
class mainclass
{
    public static void Main(string[] args)
    {
        int sum = 0;
        
        //losowa liczba, ktora zmieci wszystkie cyfry dzialania 2 ^ 1000  
        int[] digits_arr = new int[400];
        
        digits_arr[0] = 2;
        int carry = 0;
 
        for (int j = 1; j < 1000; j++)
        {
            for (int i = 0; i < digits_arr.Length; i++)
            {
                int number = digits_arr[i] * 2;
                 
                if (number > 9)
                {
                    digits_arr[i] = (number % 10) + carry;                    
                    carry = 1;
                }
                else
                {
                    digits_arr[i] = number + carry;                    
                    carry = 0;
                }
            }
        }        
 
        for (int i = 0; i < digits_arr.Length; i++)        
        {
            sum += digits_arr[i];            
            Console.Write(digits_arr[i]);
        }
 
        Console.WriteLine();
 
        Console.WriteLine("Sum of Digits = " + sum);
    }
}
