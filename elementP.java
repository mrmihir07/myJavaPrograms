public class elementP
{
    public static void main(String[] args) {
        int a [] = {1,5,9,3,6,1,5,4,7};
        int index = -1;
        int x = 7;
        for(int i =0; i<a.length; i++)
        {
            if(a[i]==x)
                index = i;
        }
        System.out.println("Index is : "+index);
    }
}
