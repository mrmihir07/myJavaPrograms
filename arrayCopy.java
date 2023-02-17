import java.util.Arrays;

public class arrayCopy {
    public static void printArray(int arr[])
    {
//        System.out.println("The elements are: ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        int a [] = {1,4,7,9};
        int n = a.length;
        int b [] = Arrays.copyOf(a,n);
        System.out.println("Original Array: ");
        printArray(a);
        System.out.println("\nCopied Array:");
        printArray(b);
    }
}
