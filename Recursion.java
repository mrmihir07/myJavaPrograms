public class Recursion
{
    static int factorial(int n)
    {
        if(n==1||n==0)
        {
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    static int product(int a)
    {
        int fact = 1;
        for(int i = a ; i>=1 ;i--)
        {
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String args[])
    {
        int a = 5;
        System.out.println("Factorial of a is : "+ factorial(a));
        System.out.println("Factotial of a is : "+ product(a));
    }
}
