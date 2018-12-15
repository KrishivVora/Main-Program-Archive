import java.util.*;
public class array_product
{
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        int x[]=new int[6];
        int y[]=new int[6];
        int z[]=new int[6];
        System.out.println("\fEnter the  numbers for the first chain.");
        for(int a=0; a<6; a++)
        {
            x[a]=sc.nextInt();
        }
        System.out.println("Enter the  numbers for the second chain.");
        for(int b=0; b<6; b++)
        {
            y[b]=sc.nextInt();
        }
        System.out.println("The answers for the products in the 'z' chain are:");
        for(int c=0; c<6; c++)
        {
            z[c]=x[c]*y[c];
            System.out.println(z[c]);
        }
    }
}