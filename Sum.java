public class Sum
{
    public static void main(String args[])
    {
        float sum=0;
        float a[]={2.2f,8.9f,3.4f,5.7f,9.3f};
        for(float element : a)
        {
            sum=sum+element;
        }
        System.out.println(sum);
    }
}