import java.util.*;
public class octal_conv //converts whole number decimal or octal inputs into the other base
{
    static Scanner sc=new Scanner(System.in);
    static int a, n1, n=0;
    static double z=0.0;
    static StringBuffer S=new StringBuffer(); //used stringbuffer to facilitate easy reversal
    static void dec_to_oct() //to convert decimal numbers into octal
    {
        do
        {
            a=n1%8; //remainder
            n1=n1/8; //actually dividing by 8
            S.append(a); //adding remainder to the number
        }
        while(n1>8);
        if((S.charAt((S.length())-1))=='0' && (S.charAt(0))!='0') //adds 1 to the start of any octal no. starting with 0
        {
            S.append("1");
        }
        S.reverse(); //reversing the number
        System.out.println("Entered decimal number: "+n);
        System.out.println("      Octal conversion: "+S);
    }
    static void oct_to_dec() //to convert octal numbers into decimals
    {
        S.append(n);
        double ytemp=0.0;
        int xtemp=0;
        String Stemp;
        for(int cnt=0; cnt<S.length(); cnt++)
        {
            if(S.charAt(cnt)!='0') //as long as digit is not 0
            {
                Stemp=""+S.charAt(cnt); //takes digit
                xtemp=Integer.parseInt(Stemp); //converts digit to int
                ytemp=xtemp*(Math.pow(8, (S.length()-(cnt+1)))); //value of converted digit
                z=z+ytemp; //adding digit value to final number
            }
        }
        System.out.println("Entered octal number: "+n);
        System.out.println("  Decimal conversion: "+z);
    }
    public static void main(String args[]) //main method
    {
        System.out.println("\fEnter the number you would like to convert.");
        n=sc.nextInt();
        n1=n;
        System.out.println("Would you like to convert: ");
        System.out.println("1. From decimal to octal?");
        System.out.println("2. From octal to decimal?");
        System.out.println("Choose your operation by entering the corresponding number.");
        int x=sc.nextInt();
        switch(x)
        {
            case 1:
            {
                octal_conv.dec_to_oct();
                break;
            }
            case 2:
            {
                octal_conv.oct_to_dec();
                break;
            }
            default:
            {
                System.out.println("Wrong input.");
            }
        }
    }
}