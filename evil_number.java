import java.util.*;
public class evil_number //converts whole number decimal or binary inputs into the other base
{
    static Scanner sc=new Scanner(System.in);
    static int a, n1, n=0;
    static double z=0.0;
    static StringBuffer S=new StringBuffer(); //used stringbuffer to facilitate easy reversal
    static void dec_to_bin() //to convert decimal numbers into binary
    {
        do
        {
            a=n1%2; //remainder
            n1=n1/2; //actually dividing by 2
            S.append(a); //adding remainder to the number
        }
        while(n1>2);
        if((S.charAt((S.length())-1))=='0' && (S.charAt(0))!='0') //adds 1 to the start of any binary no. starting with 0
        {
            S.append("1");
        }
        S.reverse(); //reversing the number
        System.out.println("Entered decimal number: "+n);
        System.out.println("     Binary conversion: "+S);
    }
    public static void main(String args[]) //main method
    {
        System.out.println("\fEnter the number you would like to convert.");
        n=sc.nextInt();
        n1=n;
        evil_number.dec_to_bin();
        char c;
        int one_cnt=0;
        for(int cnt=0; cnt<S.length(); cnt++)
        {
            c=S.charAt(cnt);
            if(c=='1')
            {
                one_cnt++;
            }
        }
        System.out.println("The binary conversion has "+one_cnt+" ones.");
        if(one_cnt%2==0)
        System.out.println("Thus the number IS an evil number.");
        else
        System.out.println("Thus the number is NOT an evil number.");
    }
}