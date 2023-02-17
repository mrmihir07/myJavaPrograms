public class lastOccurence
{
    public static int lastOcc(int arr[], int x)
    {
        int index = -1;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==x)
            {
                index = i;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int a [] = {1,1,8,9,3,4,5,1,5,6};
        int x = 5;
        System.out.println("Last Occurence is : "+lastOcc(a,x));
    }
}
