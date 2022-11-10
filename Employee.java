import java.util.Scanner;

public class Employee
{
    private String name;
    private int id;
    private String result;
    private int ass1;
    private int ass2;
    private int ass3;

    public Employee(String n, int i, int a1, int a2, int a3)
    {
        name = n;
        id = i;
        ass1 = a1;
        ass2 = a2;
        ass3 = a3;
        if(a1 > 75 && a2 > 75 && a3 > 75)
        {
            result = "Promoted";
        }
        else
        {
            result = "Demoted";
        }
    }

    public int total()
    {
        return ass1 + ass2 + ass3;
    }

    public double percent()
    {
        return (total()/3.0);
    }

    public void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Employee id:"+id);
        System.out.println("Total:"+total());
        System.out.println("Percentage= "+percent());
        System.out.println("Result:"+result);
    }
    public static void main(String[]args)
    {
        Employee ob1=new Employee("Jeeva",1234,77,78,87);
        Employee ob2=new Employee("Ann",5678,76,55,89);
        Employee ob3=new Employee("Jayan",9101,78,88,98);
        ob1.display();
        ob2.display();
        ob3.display();
    }
}
