import java.util.Scanner;

public class arrayProbAss2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("\nEnter the elements: ");
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("\nEnter the value of X : ");
        int x = sc.nextInt();
        int count = 0;
        for(int i=0; i<n; i++)
        {
            if(arr[i]==x)
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
