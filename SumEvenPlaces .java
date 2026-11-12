import java.util.Scanner;

class SumEvenPlaces 
{
    public static void main(String[] args)
     {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();

        int sum = 0, count = 1;

        while (n > 0) 
        {
            int rem = n % 10;

            if (count % 2 == 0)
           {
                sum = sum + rem;
            }

            n = n / 10;
            count++;
        }

        System.out.println("Sum of even places = " + sum);
    }
}
