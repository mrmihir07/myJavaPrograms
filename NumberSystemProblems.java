import java.util.Scanner;

public class NumberSystemProblems
{
    public static void main(String[] args) {
        //Prob1
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a number: ");
//        int n = sc.nextInt();
//        int ans=0,p,pw=1;
//        while(n>0)
//        {
//            p = n%2;
//            ans = ans + (p*pw);
//            pw = pw*10;
//            n = n/2;
//        }
//        System.out.println("Binary number is: "+ans);

        //Prob2
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the binary digits: ");
//        int n = sc.nextInt();
//        int ans=0,pw=1,p;
//        while(n>0)
//        {
//            p = n%10;
//            ans = ans + (pw*p);
//            pw = pw*2;
//            n = n/10;
//        }
//        System.out.println("Decimal value is: "+ans);

        //Prob3
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number in decimal form: ");
//        int m = sc.nextInt();
//        System.out.print("Enter the number in binary form: ");
//        int n = sc.nextInt();
//        int ans=0,pw=1,p, sum;
//        while(n>0)
//        {
//            p = n%10;
//            ans = ans + (pw*p);
//            pw = pw*2;
//            n = n/10;
//        }
//        sum = m + ans;
//        System.out.println("Sum of these numbers is: "+sum);

        //Prob4
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number in decimal form: ");
        int m = sc.nextInt();
        System.out.print("Enter the number in binary form: ");
        int n = sc.nextInt();
        int ans=0,pw=1,p, sum;
        while(n>0)
        {
            p = n%10;
            ans = ans + (pw*p);
            pw = pw*2;
            n = n/10;
        }
        sum = m * ans;
        System.out.println("Product of these numbers is: "+sum);


    }
}
