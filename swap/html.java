package swap;

import java.util.Scanner;

public class html
{
    public static void main(String[] args) {
        int a,b,t;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a nd b");
        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println("Before swapping");
        System.out.printf("a = %d and b = %d",a,b);
        System.out.println("\n");
        t=a;
        a=b;
        b=t;
        System.out.println("After swapping");
        System.out.printf("a = %d and b = %d",a,b);

    }
}
