class MyEmployee{
    private int id;
    private String name;
    public String getName()
    {
        return name;
    }
    public void setName(String n)
    {
        name = n;
    }
    public void setId(int i)
    {
        id = i;
    }
    public int getId()
    {
        return id;
    }

}
public class AccessMod
{
    public static void main(String args[])
    {
        MyEmployee obj = new MyEmployee();
        obj.setId(1001);
        System.out.println(obj.getId());
        obj.setName("Mihir");
        System.out.println(obj.getName());
    }

}
