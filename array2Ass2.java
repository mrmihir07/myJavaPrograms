public class array2Ass2
{
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        int arr2[] = {1,2,3,6};
        int idx = 0;
        int union[] = new int[5];
        if(arr.length>= arr2.length)
        {
            for(int i=0; i<arr.length;i++)
            {
                union[idx]=arr[i];
                idx++;
            }
            for(int i=0; i< arr2.length; i++)
            {
                boolean check = false;
                for (int j=0; j<arr.length; j++)
                {
                    if(union[i]==arr2[j]){
                        check = true;
                        break;
                    }

                }
                if(!check)
                {
                    System.out.print(union[i]+" ");
                }
            }
        }
    }
}
