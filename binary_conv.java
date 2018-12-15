import java.util.*;
public class binary_conv //converts whole number decimal or binary inputs into the other base
{
    static Scanner sc=new Scanner(System.in);
    static int a, n1, n=0;
    static int z=0;
    static StringBuffer S=new StringBuffer(); //used stringbuffer to facilitate easy reversal
    static void dec_to_bin() //to convert decimal numbers into binary
    {
        do
        {
            a=n1%2; //remainder
            n1=n1/2; //actually dividing by 2
            S.append(a); //adding remainder to the number
        }
        while(n1>=2);
        if((S.charAt((S.length())-1))=='0' && n!=0) //adds 1 to the start of any binary no. starting with 0, unless it's zero
        {
            S.append("1");
        }
        S.reverse(); //reversing the number
        System.out.println("Entered decimal number: "+n);
        System.out.println("     Binary conversion: "+S);
    }
    static void bin_to_dec() //to convert binary numbers into decimals
    {
        for(int cnt=0; cnt<S.length(); cnt++)
        {
            if(S.charAt(cnt)=='1')
            {
                z=z+(int)Math.pow(2, (S.length()-cnt-1));
            }
        }
        System.out.println("Entered binary number: "+n);
        System.out.println("   Decimal conversion: "+z);
    }
    public static void main(String args[]) //main method
    {
        System.out.println("\fWould you like to convert: ");
        System.out.println("1. From decimal to binary?");
        System.out.println("2. From binary to decimal?");
        int x=sc.nextInt();
        if(x!=1 && x!=2)
        {
            System.out.println("Wrong input.");
        }
        else
        {   
            System.out.println("Enter the number you would like to convert.");
            n=sc.nextInt();
            n1=n;
            switch(x)
            {
                case 1:
                {
                    binary_conv.dec_to_bin();
                    break;
                }
                case 2:
                {
                    S.append(n);
                    binary_conv.bin_to_dec();
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