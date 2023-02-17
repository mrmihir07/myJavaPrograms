import java.util.Scanner;

public class Array1
{
    public static void main(String args[])
    {
        int a[][];
        a = new int[2][2];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of Matrix: ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(a[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}