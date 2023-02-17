import java.util.Scanner;
public class SumEven
{
    public static void main(String args[])
{
    int i,n,sum=0;
    System.out.println("Enter the No. of even numbers that you want to add: ");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    for(i=0;i<n;i++)
    {
        sum=sum+(2*i);
    }
    System.out.printf("Sum of %d even number is %d ",n,sum);
}
}