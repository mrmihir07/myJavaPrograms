import java.util.Scanner;

public class array2Ass5
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of 1st array : ");
        int m = sc.nextInt();
        int arr1[] = new int[m];
        System.out.print("Enter the size of 2nd array : ");
        int n = sc.nextInt();
        int arr2[] = new int[n];
        System.out.print("Enter the elemnts of 1st array : ");
        for(int i=0; i<m; i++)
        {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter the elemnts of 2nd array : ");
        for(int i=0; i<n; i++)
        {
            arr2[i] = sc.nextInt();
        }
        boolean check = true;
        for (int i=0; i<m; i++){
            if(arr1[i]!=arr2[i])
            {
                check = false;
            }
        }
        System.out.println(check);


    }
}
