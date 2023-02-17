class Rect
{
    int length, width;
    void getData(int x, int y)
    {
        length = x;
        width = y;
    }
    int getArea(){
        int area = length*width;
        return area;
    }
}
public class rectArea {
    public static void main(String[] args) {
        int area1, area2;
        Rect obj1 = new Rect();
        Rect obj2 = new Rect();
        obj1.length = 15;
        obj1.width = 10;
        obj1.getData(obj1.length, obj1.width);
        area1 = obj1.getArea();
        obj2.getData(20,12);
        area2 = obj2.getArea();
        System.out.println("Area1 = "+area1);
        System.out.println("Area2 = "+area2);

    }
}
