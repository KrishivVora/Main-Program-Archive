import java.util.*;
public class case_counter
{
    static void method()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\fEnter a string.");
        String S=sc.nextLine();
        int n=S.length();
        String c1;
        String c2;
        char c3;
        int i=1;
        int a=0;
        int b=0;
        for(int cnt=0;cnt<n;cnt++,i++)
        {
            c3=S.charAt(cnt);
            c1=S.substring(cnt,i);
            c2=S.substring(cnt,i);
            c1=c1.toLowerCase();
            if(c2.equals(c1))
            a++;
            else
            b++;
            if(c3==' ')
            a--;
        }
        System.out.println("The string you entered has "+a+" lower case letters and "+b+" upper case letters.");
    }
}