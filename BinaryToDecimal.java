import java.util.Scanner;

public class BinaryToDecimal
{
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the binary value: ");
//        int n = sc.nextInt();
//        int ans=0, pw=1, p;
//        while(n>0)
//        {
//           p=n%10;
//           ans = ans +(pw*p);
//           pw = pw*2;
//           n = n/10;
//        }
//        System.out.println("Decimal value is: "+ans);
        //Decimal to binary
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int pw = 1, ans =0, p;
        while(n>0)
        {
            p = n%2;
            ans = ans + (p*pw);
            pw = pw*10;
            n = n/2;
        }
        System.out.println("Binary value is: "+ans);
    }
}
