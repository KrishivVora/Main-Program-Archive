import java.util.*;
public class string_pattern_5 //this program prints the pattern INDIA
                              //                                INDI
                              //                                IND
                              //                                IN
                              //                                I
{
    static void method()
    {
        System.out.println("\fEnter a string.");
        Scanner sc=new Scanner(System.in);
        String S=sc.nextLine();
        char a;
        int n=S.length();
        for(int cnt=n-1;cnt>=0;cnt--)
        {
            for(int i=0;i<=cnt;i++)
            {
                a=S.charAt(i);
                System.out.print(a);
            }
            System.out.println();
        }
    }
}