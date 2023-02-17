class Base{
    public int X;

    public int getX()
    {
        return X;
    }
    public void setX(int X){
        System.out.println("I am in Base and setting x now");
        this.X=X;
    }
}
class Derived extends Base{
    public int y;
    public int gety()
    {
        return y;
    }
    public void sety(int y){
        this.y=y;
    }
}
public class Inheritance
{
    public static void main(String[] args) {
        //Creating object of base class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());
        //Creating object of Derived class
        Derived d = new Derived();
        d.sety(43);
        System.out.println(d.gety());
        d.setX(50);
        System.out.println(d.getX());








    }
}
