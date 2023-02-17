//Place all negative elements at the end of the array without changing the order of the positive and negative elements.
import java.util.Scanner;

public class array1Ass1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int n = sc.nextInt();
        int arr [] = new int[n];
        System.out.print("Enter the elements: ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int ans [] = new int[arr.length];
        int idx = 0;
        for (int i=0; i<arr.length; i++)
        {
            if(arr[i]>=0)
            {
                ans[idx]=arr[i];
                idx++;
            }
        }
        for (int i=0; i<arr.length; i++)
        {
            if(arr[i]<0)
            {
                ans[idx]=arr[i];
                idx++;
            }
        }
        for(int i=0; i<arr.length;i++)
        {
            System.out.print(ans[i]+" ");
        }
    }
}
