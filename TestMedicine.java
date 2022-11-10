class Medicine {
    void displayLabel()
    {
        System.out.println("Company : ABC Pharmacy");
        System.out.println("Address : Ernakulam");
    }
}
class Tablet extends Medicine
{
    public void displayLabel()
    {
        System.out.println("Store in a cool dry place");
    }
}
class Syrup extends Medicine
{
    public void displayLabel()
    {
        System.out.println("Use according to prescription");
    }
}

class Ointment extends Medicine
{
    public void displayLabel()
    {
        System.out.println("For external use only");
    }
}

class TestMedicine
{
    public static void main(String[] args)
    {
        double i=Math.random()*4;
        int j=(int) i;
        System.out.println(j);

        switch (j)
        {
            case 1:
                Medicine m1=new Medicine();
                Tablet t1=new Tablet();
                m1.displayLabel();
                t1.displayLabel();
                break;

            case 2:
                Medicine m2=new Medicine();
                Tablet t2=new Tablet();
                m2.displayLabel();
                t2.displayLabel();
                break;

            case 3:
                Medicine m3=new Medicine();
                Tablet t3=new Tablet();
                m3.displayLabel();
                t3.displayLabel();

            default:
                System.out.println("Invaild choice");
        }
    }
}

