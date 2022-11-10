public class MathFunction
{
    static int multiply (int a, int b)
    {
        System.out.println("Product of " +a+ " and " +b+ " = ");
        return (a*b);
    }
    static float multiply (float a, float b)
    {
        System.out.println("Product of " +a+ " and " +b+ " = ");
        return (a*b);
    }
    static float multiply(float a,int b)
    {
        System.out.println("Product of " +a+ " and " +b+ " = ");
        return (a*b);
    }
    public static void main(String[] args)
    {
        System.out.println(multiply(1, 2));
        System.out.println(multiply(1.2f, 2.1f));
        System.out.println(multiply(1.2f, 2));
    }
}
