public class Change_Calculator
{
    static void main (int f)
    {
        int a=f/1000;
        int b=f%1000;
        int c=b/500;
        int d=b%500;
        int e=d/100;
        int x=d%100;
        int g=e/50;
        int h=e%50;
        int i=g/20;
        int j=g%20;
        int k=i/10;
        int l=i%10;
        int m=k/5;
        int n=k%5;
        int o=m/2;
        int p=m%2;
        int q=o/1;
        {
            System.out.println("No. of 1000 Rupee notes: " +a);
            System.out.println("No. of 500 Rupee notes:  " +c);
            System.out.println("No. of 100 Rupee notes:  " +e);
            System.out.println("No. of 50 Rupee notes:   " +g);
            System.out.println("No. of 20 Rupee notes:   " +i);
            System.out.println("No. of 10 Rupee notes:   " +k);
            System.out.println("No. of 5 Rupee coins:    " +m);
            System.out.println("No. of 2 Rupee coins:    " +o);
            System.out.println("No. of 1 Rupee coins:    " +q);
        }
    }
}