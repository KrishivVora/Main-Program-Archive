import java.util.*;
public class rec_binary
{
    StringBuffer S=new StringBuffer();
    public void bin_conv(int n1) //to convert decimal numbers into binary
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
    public void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter the number to be converted to binary.");
        int n=sc.nextInt();
        bin_conv(n);
        S.reverse(); //reversing the number
        System.out.println("Entered decimal number: "+n);
        System.out.println("     Binary conversion: "+S);
    }
}