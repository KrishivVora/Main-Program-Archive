import java.util.*;
public class string_pattern_6 //this program prints the pattern AIDNI
                              //                                AIDN
                              //                                AID
                              //                                AI
                              //                                A
{
    static void method()
    {
        System.out.println("\fEnter a string.");
        Scanner sc=new Scanner(System.in);
        String S=sc.nextLine();
        char a;
        int n=S.length();
        for(int cnt=0;cnt<n;cnt++)
        {
            for(int i=n-1;i>=cnt;i--)
            {
                a=S.charAt(i);
                System.out.print(a);
            }
            System.out.println();
        }
    }
}