import java.util.Scanner;

public class MethodsProb
{
    //Prob1
//    int Avg(int a, int b, int c) {
//        int avg = (a + b + c) / 3;
//        return avg;
//    }
//
//    public static void main(String[] args) {
//        int a = 45, b = 45, c = 45;
//        MethodsProb obj = new MethodsProb();
//        System.out.println("Average of three numbers is : "+obj.Avg(a,b,c));
//
//    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,sum;
        System.out.println("Enter the value of a: ");
        a = sc.nextInt();
        System.out.println("Enter the value of b: ");
        b = sc.nextInt();
        sum = a+b;
        System.out.println("Sum is : "+sum);
    }

}

