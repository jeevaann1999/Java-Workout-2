import java.util.Scanner;

public class Faculty
{
    int facultyid;
    float salary;
}
class FullTimeFaculty extends Faculty
{
    float basic;
    float allowance;

    FullTimeFaculty(float basic, float allowance)
    {
        this.basic=basic;
        this.allowance=allowance;
    }
    float salaryF()
    {
        float salary1;
        salary1=(basic+allowance);
        return salary1;
    }

    void display1()
    {
        System.out.println(""+salaryF());
    }
}
class PartTimeFaculty extends Faculty {
    int hour;
    float rate;

    PartTimeFaculty(int hour, float rate) {
        this.hour = hour;
        this.rate = rate;
    }

    float salaryP() {
        float salary2;
        salary2 = (hour * rate);
        return salary2;
    }

    void display2() {
        System.out.println("" + salaryP());
    }
}

    class DriverClass
    {
      public static void main(String[] args)
      {
          Scanner sc=new Scanner(System.in);
          System.out.println("Enter basic salary and allowance");
          FullTimeFaculty F1=new FullTimeFaculty(sc.nextFloat(), sc.nextFloat());
          FullTimeFaculty F2=new FullTimeFaculty(sc.nextFloat(), sc.nextFloat());
          System.out.println("Enter hour and rate");
          PartTimeFaculty P1=new PartTimeFaculty(sc.nextInt(), sc.nextFloat());
          PartTimeFaculty P2=new PartTimeFaculty(sc.nextInt(), sc.nextFloat());
          F1.display1();
          F2.display1();
          P1.display2();
          P2.display2();
      }

    }



