public class ArrayQue1
{
    public static void main(String[] args) {
        int [] a = {2,3,5,8,-6,-5,0,5,-5,-7};
        for(int i=0; i<a.length; i++)
        {
            if(a[i]>=0)
            {
                System.out.print(a[i]+" ");
            }
        }
    }
}
