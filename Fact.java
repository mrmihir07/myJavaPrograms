import java.util.Scanner;
public class Fact
{
    public static void main(String args[])
    {
        int i,n,fact=1;
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(i=n;i>=1;i--)
        {
            fact=fact*i;
        }
        System.out.printf("Factorial of %d is %d",n,fact);
    }
}