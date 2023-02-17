public class Method
{
    int add(int a, int b)
    {
        return a+b;
    }
    int add(int a, int b, int c)
    {
        return a+b+c;
    }
    public static void main(String args[])
    {
        Method obj = new Method();
        int sum1 = obj.add(5,4);
        int sum2 = obj.add(1,2,3);
        System.out.println(sum1);
        System.out.println(sum2);
    }
}
