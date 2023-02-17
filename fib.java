import java.util.Scanner;

public class fib
{
    public static void main(String args[])
    {
        int a,b,result,i,n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        a=0;
        b=1;
        for(i=0;i<n;i++)
        {
            System.out.print(a);
            System.out.print(" ");
            result=a+b;
            a = b;
            b = result;
        }

    }
}

