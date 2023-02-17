public class countOccu {
    public static int greaterCount(int arr[], int x)
    {
        int count = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]>x)
                count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int a[]={5,6,7,9,6,8,1,5,4,6,7};
        int x = 5;
        System.out.println("Number of elements greater than "+x+"  : "+greaterCount(a,x));
    }
}