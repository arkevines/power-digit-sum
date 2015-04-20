# power-digit-sum

using System;
 
class mainclass
{
    public static void Main(string[] args)
    {
        int sum = 0;
         
        int[] arr = new int[400];
        //losowa liczba, ktora zmieci wszystkie cyfry dzialania 2 ^ 1000 
        arr[0] = 2;
        int carry = 0;
 
        for (int j = 1; j < 1000; j++)
        {
            for (int i = 0; i < arr.Length; i++)
            {
                int tempno = arr[i] * 2;
                 
                if (tempno > 9)
                {
                    arr[i] = (tempno % 10) + carry;                    
                    carry = 1;
                }
                else
                {
                    arr[i] = tempno + carry;                    
                    carry = 0;
                }
            }
        }        
 
        for (int i = 0; i < arr.Length; i++)        
        {
            sum += arr[i];            
            Console.Write(arr[i]);
        }
 
        Console.WriteLine();
 
        Console.WriteLine("Sum of Digits = " + sum);
    }
}
