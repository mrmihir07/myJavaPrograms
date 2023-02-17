import java.util.Scanner;

public class SumNaturalNumber
{
    static int sum(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else
        {
            return n + sum(n-1);
        }

    }
    public static void main(String args[])
    {
        int a;
        System.out.println("Enter a positive integer: ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        System.out.println("Sum of n natural number is : " + sum(a));
    }
}
