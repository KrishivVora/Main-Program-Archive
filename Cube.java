public class Cube
{
    static void main (int a, int b, int c)
    {
        System.out.println("If the side is "+a+ "cm");
        int TSA=6*a*a;
        double vol=Math.pow(a,3);
        System.out.println("Then Total Surface Area= "+TSA);
        System.out.println("And then the Volume= "+vol);
    }
}