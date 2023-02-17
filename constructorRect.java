class Recta{
    int length, width;
    Recta(int x, int y)
    {
        length = x;
        width = y;
    }
    int getArea(){
        int area = length*width;
        return area;
    }
}
public class constructorRect {
    public static void main(String[] args) {
        int area1;
        Recta obj1 = new Recta(10,15);
        area1 = obj1.getArea();
        System.out.println("Area = "+area1);
    }
}
