import java.util.Scanner;

public class arrayShort
{
    public static boolean check(int arr[]){
        boolean ans = true;
        for(int i=1; i<arr.length; i++)
        {
            if(arr[i]<arr[i-1])
                ans = false;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements: ");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(check(a));
    }
}
