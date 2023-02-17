import java.util.Arrays;
import java.util.Scanner;

public class SmallestElement
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter the elements: ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Sorted array are: ");
        for(int i=0; i<n; i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.print("\nEnter the Kth element: ");
        int k = sc.nextInt();
        System.out.println(k+"rd"+" smallest element is : "+arr[k-1]);
    }
}
