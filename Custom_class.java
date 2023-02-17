class Employee{
    int id;
    int salary;
    String name;
    public void printDetails()
    {
        System.out.println("My id is : "+id);
        System.out.println("My name is : "+name);
        System.out.println("And my salary is : "+salary);
    }
}
public class Custom_class
{
    public static void main(String[] args) {
        Employee Mihir = new Employee();
        Employee John = new Employee();
        //Set Mihir details
        Mihir.id = 1001;
        Mihir.salary = 34;
        Mihir.name = "Mihir Kumar";
        //Set John Details
        John.id = 1002;
        John.salary = 13;
        John.name = "John Watson";
        Mihir.printDetails();
        John.printDetails();
    }

}
