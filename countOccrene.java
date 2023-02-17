import java.util.Scanner;

public class countOccrene
{
    public static int countOfElements(int arr[], int x)
    {
        int count = 0;
        for(int i =0; i<arr.length; i++)
        {
            if(arr[i]==x)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n = sc.nextInt();
        int a [] = new int[n];
        System.out.println("Enter the elements of array: ");
        for(int i = 0; i<n; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter the elements X: ");
        int x = sc.nextInt();
        System.out.println("No. of Occurence is: "+countOfElements(a,x));
    }
}
