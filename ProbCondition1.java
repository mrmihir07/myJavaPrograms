import java.util.Scanner;

public class ProbCondition1
{
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
        //Problem 1
//        System.out.println("Enter the number: ");
//        int n = sc.nextInt();
//        if (n % 3 == 0 && n % 5 == 0) {
//            System.out.println("FizzBuzz");
//        } else if (n % 5 == 0) {
//            System.out.println("Buzz");
//        } else if (n % 3 == 0) {
//            System.out.println("Fizz");
//        } else
//        {
//            System.out.println("invalid number");
//        }
        //Problem 2
//        int n=1;
//        while(n<=100)
//        {
//            if(n%5==0 && n%7==0)
//            {
//                System.out.println(n);
//            }
//            n++;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day number: ");
        int n = sc.nextInt();
        switch(n)
        {
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3 :
                System.out.println("Wednesday");
                break;
            case 4 :
                System.out.println("Thursday");
                break;
            case 5 :
                System.out.println("Friday");
                break;
            case 6 :
                System.out.println("Saturday");
                break;
            case 7 :
                System.out.println("Sunday");
        }


    }
}
