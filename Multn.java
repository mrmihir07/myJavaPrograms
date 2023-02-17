import java.util.Scanner;

public class Multn
{
    static void table(int n)
    {
        for(int i=1; i<=10 ;i++)
        {
            System.out.printf("%d X %d = %d",n,i,n*i);
            System.out.println("");
        }
    }
    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the table number: ");
        n = sc.nextInt();
        table(n);
    }
}
