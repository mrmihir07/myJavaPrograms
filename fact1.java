import java.util.Scanner;

public class fact1
{
    public static void main(String[] args) {
        int n,i,sum=1;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n = sc.nextInt();
        for(i=n;i>=1;i--)
        {
            sum = sum*i;
        }
        System.out.printf("Factorial of %d is %d",n,sum);

    }
}
