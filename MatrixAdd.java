import java.util.Scanner;
public class MatrixAdd
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a[][], b[][], c[][];
        a = new int [2][3];
        b = new int [2][3];
        c = new int [2][3];
        System.out.println("Enter the elements of matrix a(2X3) : ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of matrix b(2X3) : ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                b[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        System.out.println("Addition of Matrices are : ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(c[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}