import java.util.Scanner;

public class PrintStar
{
    static void Star(int a)
    {
        for(int i=1; i<=a; i++)
        {
            for(int j=a; j>=i; j--)
            {
                System.out.printf("* ");
            }
            System.out.printf("\n");
        }
    }
    public static void main(String args[])
    {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines : ");
        n = sc.nextInt();
        Star(n);
    }
}
