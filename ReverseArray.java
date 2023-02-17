//Reverse Array
public class ReverseArray
{
    public static void main(String args[])
    {
        int arr[]={1,2,3,4,5};
        System.out.print("Array before reverse: ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
        }
        int t,x;
        t=arr[0];
        arr[0]=arr[4];
        arr[4]=t;
        x=arr[1];
        arr[1]=arr[3];
        arr[3]=x;
        System.out.print("\nArray after reverse is : ");
        for(int i=0;i<5;i++)
        {
            System.out.print(arr[i]);
            System.out.print(" ");
        }

    }
}