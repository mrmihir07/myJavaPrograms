class Cellphone {
    public void Ringing() {
        System.out.println("Ringing...");
    }

    public void Vibrat() {
        System.out.println("Vinbrating...");
    }
}
class Square{
        int a;
        public int area()
        {
            return a*a;
        }
        public int perimeter()
        {
        return 4*a;
        }
}
class Rectangle{
    int l,b;
    public int area()
    {
        return l*b;
    }
    public int perimeter()
    {
        return 2*(l+b);
    }
}
class Tommy{
    public void hit()
    {
        System.out.println("Hitting...");
    }
    public void run()
    {
        System.out.println("Running...");
    }
    public void fire()
    {
        System.out.println("Firing...");
    }
}
class Circle{
    float r;
    public float area()
    {
        return 3.14f*r*r;
    }
    public float perimeter()
    {
        return 3.14f*r*2;
    }

}
public class Practice_set_Ch_8
{
    public static void main(String args[])
    {
        //Problem 2
       /* Cellphone obj = new Cellphone();
        obj.Ringing();
        obj.Vibrat();

        //Problem 3
        Square ob1 = new Square();
        ob1.a=3;
        System.out.println("Area of Square is : "+ ob1.area());
        System.out.println("Perimeter of Square is : "+ob1.perimeter());

        //Problem 4
        Rectangle ob2 = new Rectangle();
        ob2.l = 4;
        ob2.b = 6;
        System.out.println("Area of Rectangle is : "+ob2.area());
        System.out.println("Perimeter of Rectangle is : "+ob2.perimeter());

        //Problem 5
        Tommy ob3 = new Tommy();
        ob3.hit();
        ob3.run();
        ob3.fire();   */
        Circle ob4 = new Circle();
        ob4.r=12;
        System.out.println("Area of circle is : "+ob4.area());
        System.out.println("Perimeter of Circle is : "+ob4.perimeter());

    }
}
