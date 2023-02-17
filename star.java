import java.util.Scanner;

public class star
{
    public static void main(String[] args) {
        int lines,i,j;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        lines = sc.nextInt();
        for(i=1;i<=lines;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
