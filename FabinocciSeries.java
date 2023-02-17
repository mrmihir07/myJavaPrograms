import java.util.Scanner;
//0  1 1 2 3 5 8 13 21
public class FabinocciSeries
{
    static int fib(int n)
    {
        if(n==1)
        {
            return 0;
        }
        else if(n==2)
        {
            return 1;
        }
        else
        {
            return fib(n-1)+fib(n-2);
        }
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. that you want print from fabinacci series: ");
        int n = sc.nextInt();
        System.out.println("The number is : "+fib(n));
    }

}
