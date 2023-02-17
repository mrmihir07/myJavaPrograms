public class ArrayQue2
{
    public static void main(String[] args) {
        String arr [] = {"ab","bc","cd","de","ef","gh"};
        for(int i=0; i<arr.length; i++)
        {
            if(i%2!=0)
                System.out.print(arr[i]+" ");
        }
    }
}
