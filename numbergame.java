package CODSOFT.Task4_CurrencyConverter;
import java.util.Scanner;

public class CurrencyConverter
{

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Choose base currency: 1.USD 2.EUR 3.INR");
        int baseChoice=sc.nextInt();

        System.out.println("Choose base currency: 1.USD 2.EUR 3.INR");
        int targetChoice=sc.nextInt(); 
        
        System.out.println("Enter amount to convert:");
        double amount=sc.nextDouble();
        
        double[][] rates = {
            {1.0,0.92,83.0},
            {1.09,1.0,90.0},
            {0.012,0.011,1.0}
        };

        String[] symbols = {"USD", "EUP", "INR"};

        double rate = rates[baseChoice-1][targetChoice-1];
        double result= amount * rate;

        System.out.printf("Converted amount:%.2f %s\n", result, symbols[targetChoice=1]);
        sc.close();
    }
}

