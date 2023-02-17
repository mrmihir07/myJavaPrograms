public class Marks1
{
    public static void main(String args[])
    {
        int a[]={80,86,89,82,73,93};
        int sum=0,avg;
        for(int marks : a)
        {
            sum = sum + marks;
        }
        avg = sum/6;
        System.out.print("Average marks is : ");
        System.out.print(avg);
    }
}