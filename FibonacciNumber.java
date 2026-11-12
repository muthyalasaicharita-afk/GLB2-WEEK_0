import java.util.Scanner;

class FibonacciNumber
 {
    public static void main(String[] args)
    {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the numbers");
        int n = sc.nextInt();

        int a = 0, b = 1;

        for (int i = 1; i <= n; i++) 
        {
            int c = a + b;
            a = b;
            b = c;
           
        }
    }
}
