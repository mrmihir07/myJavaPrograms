import java.util.Scanner;
public class Nat_num
{
    public static void main(String args[])
    {
        int i,n;
        System.out.print("Enter the range: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(i=n;i>=0;i--)
        {
            if(i==6)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}