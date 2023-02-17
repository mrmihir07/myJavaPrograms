import java.util.*;

public class Practice1
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value : ");
        int fact=1;
        int n = sc.nextInt();
        for(int i=n;i>=1;i--)
        {
            fact *=i;
        }
        System.out.printf("Factorial of %d is %d",n,fact);
    }
}
