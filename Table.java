import java.util.Scanner;
public class Table
{
    public static void main(String args [])
    {
        int n,i;
        System.out.print("Enter the table no. ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(i=10;i>=1;i--)
        {
            System.out.printf("%dX%d=%d\n",n,i,n*i);
        }
    }
}