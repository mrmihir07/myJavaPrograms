public class Methods2
{
    int multiply(int a, int b)
    {
        return a*b;
    }
    int multiply(int a, int b, int c)
    {
        return a*b*c;
    }
    public static void main(String args[])
    {
        Methods2 obj = new Methods2();
        int c = obj.multiply(5,4);
        double d = obj.multiply(6,7, 8);
        System.out.println(c);
        System.out.println(d);
    }
}