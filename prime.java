import java.util.Scanner;

public class prime
{
    public static void main(String[] args) {
        int n,i,f=0;
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(i=2;i<n;i++) {
            if (n % i == 0) {
                f = 1;
                break;
            }
        }
            if(n==0||n==1){
                System.out.println("Not a prime number");

            }
            else if (f==0)
            {
                System.out.println("Prime number");
            }
            else{
                System.out.println("Not a prime number");
            }
    }
}
