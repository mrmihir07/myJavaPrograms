import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class Area{
    public int getArea(int l, int b){
        return l*b;
    }
}
public class Test1
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int l = sc.nextInt();
        System.out.println("Enter the breadth: ");
        int b = sc.nextInt();
        Area obj = new Area();
        System.out.println(obj.getArea(l,b));
    }
}
