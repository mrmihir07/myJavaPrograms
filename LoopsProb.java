import java.util.Scanner;

public class LoopsProb
{
    public static void main(String[] args) {
        //Prob1
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int n = sc.nextInt();
//        int x=n, count=0;
//        while(n>0)
//        {
//            n=n/10;
//            count++;
//        }
//        System.out.println("Number of digits is : "+count);

        //prob2
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int n = sc.nextInt();
//        int x=n, sum=0;
//        while(n>0)
//        {
//            x = n%10;
//            sum = sum + x;
//            n=n/10;
//
//        }
//        System.out.println("Sum of digits is : "+sum);

        //Prob3
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int n = sc.nextInt();
//        int x=n, sum=0;
//        while(n>0)
//        {
//            x = n%10;
//            sum = sum*10+x;
//            n = n/10;
//
//        }
//        System.out.println("Reverse os number is: "+sum);
        //Prob4
        //Sum of the following series
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the range of the natural number: ");
//        int n = sc.nextInt();
//        int sum=0;
//        for(int i=1;i<=n;i++)
//        {
//            if(i%2==0)
//            {
//                sum = sum - i;
//            }
//            else{
//                sum = sum + i;
//            }
//        }
//        System.out.println("The result is: "+sum);

        //Prob5
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter an integer: ");
//        int a = sc.nextInt();
//        System.out.print("Enter the power: ");
//        int b = sc.nextInt();
//        int sum=1;
//        for(int i=1;i<=b;i++)
//        {
//            sum=sum*a;
//        }
//        System.out.println("Result is: "+sum);

        //Prob6
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int fact=1;
        for(int i=1; i<=n; i++)
        {
            fact=fact*i;
        }
        System.out.println("Factorial of "+n+" is "+fact);

    }
}
