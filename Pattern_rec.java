public class Pattern_rec
{
    static void Star(int n)
    {
        if(n>0)
        {
            Star(n-1);
            for(int i=0; i<n; i++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int n=4;
        Star(n);
    }
}
