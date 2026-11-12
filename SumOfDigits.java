
import java.util.Scanner;

class SumOfDigits
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = sc.nextInt();

        int sum = 0;
        int digit;

        while (number > 0)
        {
            digit = number % 10;
            sum = sum + digit;
            number = number / 10;
        }

        System.out.println("Sum of digits = " + sum);
    }
}
