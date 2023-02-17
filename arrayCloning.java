public class arrayCloning
{
    public static void printArray(int arr[])
    {
        System.out.println("The elements are: ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int a[] = {1,4,7,9};
        int n = a.length;
        int b[] = a.clone();
        b[0] = 5;
        System.out.println("original Array: ");
        printArray(a);
        System.out.println("\nReferenced Array: ");
        printArray(b);

    }
}
