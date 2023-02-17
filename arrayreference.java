public class arrayreference
{
    public static void main(String[] args) {
        int a[ ]= {1,2,3,4,5};
        int n = a.length;
        int b[ ]= new int[n];
        b = a;
        b[0]=0;
        System.out.print("Elements of Original Array: ");
        for(int ele : a)
        {
            System.out.print(ele+" ");
        }
        System.out.print("\nReferenced array: ");
        for(int ele1 : b)
        {
            System.out.print(ele1+" ");
        }
    }
}
