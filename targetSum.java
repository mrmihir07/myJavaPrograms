import java.util.Scanner;

public class targetSum
{
    public static int findUnique(int arr[])
    {
        int n = arr.length;
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; i<n; i++)
            {
                if(arr[i]==arr[j])
                {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = -1;
        for(int i=0; i<n; i++)
        {
            if(arr[i]>0)
            {
                ans = arr[i];
            }
        }
        return ans;
    }
    //Find triplet sum
    public static int triplet(int arr[], int target)
    {
        int count = 0;
        int n = arr.length;
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                for(int k=j+1; k<n; k++)
                {
                    if(arr[i]+arr[j]+arr[k]==target)
                        count++;
                }
            }
        }
        return count;
    }

    //Find pair Sum
    public static int pairSum(int arr[], int target)
    {
        int count = 0;
        int n = arr.length;
        for(int i=0; i<n; i++)
        {
            for (int j=i+1; j<n; j++)
            {
                if(arr[i]+arr[j]==target)
                    count++;
            }
        }
        return count;
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
//        System.out.println("Enter the target sum : ");
//        int target = sc.nextInt();
//        System.out.println(pairSum(arr,target));
//        System.out.println(triplet(arr,target));
        System.out.println("Unique element is : "+findUnique(arr));


    }
}
