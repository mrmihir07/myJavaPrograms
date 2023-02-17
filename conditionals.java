import java.util.Scanner;

public class conditionals
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number: ");
//        int n = sc.nextInt();
//        if(n%2!=0)
//        {
//            System.out.println("Odd");
//        }
//        else{
//            System.out.println("Even");
//        }
//        System.out.println("Enter a lower character: ");
//        char n = sc.next().charAt(0);
//        if(n=='a')
//        {
//            System.out.println("Yes");
//        }
//        else
//        {
//            System.out.println("No");
//        }
//        System.out.println("Enter the age: ");
//        int age = sc.nextInt();
//        if(age<12)
//        {
//            System.out.println("Child");
//        }
//        else if(age<18)
//        {
//            System.out.println("Teenager");
//        }
//        else if(age>=18)
//        {
//            System.out.println("Adult");
//        }
//        System.out.println("Enter three integer numbers: ");
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//        int c = sc.nextInt();
//        if(a>b&&a>c)
//        {
//            System.out.println("Biggest number is : "+a);
//        }
//        else if(b>a&&b>c)
//        {
//            System.out.println("Biggest number is : "+b);
//        }
//        else
//        {
//            System.out.println("Biggest number is : "+c);
//        }

//

        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if(n%3==0||n%5==0)
        {
            System.out.println(n);
        }
        else{
            System.out.println("Invalid number");
        }


    }
}

