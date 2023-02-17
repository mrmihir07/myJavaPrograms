import java.util.Scanner;

public class pro1
{
    public static void main(String args[])
    {
       int a,b,c,big,big1;
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        big=(a>b)?a:b;
        big1=(big>c)?big:c;
        System.out.println("Biggest number is: "+big1);
    }

}
