// Average of set of arguments
import java.util.Scanner;

public class AvgNumbers
{
    static int Avg(int ...num)
    {
        int sum = 0;
        for(int a : num)
        {
            sum = sum + a;
        }
        return sum/num.length;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();
        System.out.println("Enter the set of numbers: ");
        int arr[];
        arr = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Avg of set of argumnets is : "+Avg(arr));
    }
}
