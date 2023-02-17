import java.util.Scanner;

public class arrManipulation
{
    public static int largestNum(int arr[])
    {
        int n = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<n; i++)
        {
            if (arr[i] > max)
            {
                max = arr[i];
            }
        }
        return max;
    }
    public static int SecMax(int arr[])
    {
        int max = largestNum(arr);
        int n = arr.length;
        for(int i=0; i<n; i++)
        {
            if(arr[i]==max){
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int sMax = largestNum(arr);
        return sMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array size : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements : ");
        for (int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.println("Second largest number is : "+SecMax(arr));
    }
}
