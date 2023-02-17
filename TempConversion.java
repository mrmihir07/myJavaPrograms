import java.util.Scanner;

public class TempConversion
{
    static float Temp(float a)
    {
        float F;
        //°F = °C×(9/5)+32.
        F = (a*9/5)+32;
        return F;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the temperature in Celsius: ");
        float a = sc.nextInt();
        System.out.println("After conversion in Fahrenheit is:  "+Temp(a));
    }
}
