import java.util.Scanner;

public class arrManipulation1
{
    public static int firstRepeating(int arr[])
    {
        int ans = -1;
        int n = arr.length;
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; i<n; i++)
            {
                if(arr[i]==arr[j])
                {
                    ans = arr[i];
                }
            }
        }
        return ans;
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
        System.out.println("First Repeating element is : "+firstRepeating(arr));
    }
}
