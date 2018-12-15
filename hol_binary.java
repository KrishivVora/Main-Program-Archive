import java.util.*;
public class hol_binary
{
    static StringBuffer S;
    static int z;
    hol_binary()
    {
        S=new StringBuffer();
        z=0;
    }
    void bin_conv(int n1) //to convert decimal numbers into binary
    {
        if(n1>=2)
        {
            S.append(n1%2);
            bin_conv(n1/2);
        }
        else
        {
            S.append(1);
        }
    }
    void dec_conv(int cnt) //to convert binary numbers to decimal
    {
        if(cnt<S.length())
        {
            if(S.charAt(cnt)=='1')
            {
                z=z+(int)Math.pow(2,(S.length()-cnt-1));
            }
            dec_conv((cnt+1));
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        hol_binary obj = new hol_binary();
        System.out.println("\fEnter the operation you would like to perform:");
        System.out.println("1. Decimal to binary");
        System.out.println("2. Binary to decimal");
        int x=sc.nextInt();
        if(x!=1 && x!=2)
        {
            System.out.println("Wrong input.");
        }
        else
        {    
            System.out.println("Enter the number to be converted.");
            int n=sc.nextInt();
            switch(x)
            {
                case 1:
                {
                    obj.bin_conv(n);
                    S.reverse(); //reversing the number
                    System.out.println("Entered decimal number: "+n);
                    System.out.println("     Binary conversion: "+S);
                    break;
                }
                case 2:
                {
                    S.append(n);
                    obj.dec_conv(0);
                    System.out.println("Entered binary number: "+n);
                    System.out.println("   Decimal conversion: "+z);
                    break;
                }
                default:
                {
                    System.out.println("Wrong input.");
                }
            }
        }
    }
}