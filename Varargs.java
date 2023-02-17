public class Varargs
{   static int add(int ...arr)
    {
        int sum = 0;
        for(int a : arr)
        {
            sum = sum + a;
        }
        return sum;
    }
    public static void main(String args[])
    {
        System.out.println(add(1,2,3));
        System.out.println(add(1,2,3,4));
        System.out.println(add(1,2,3,4,5));
    }

}
