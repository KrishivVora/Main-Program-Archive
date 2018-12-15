import java.util.*;
public class string_pattern_1 //this program prints the pattern I
                              //                                N
                              //                                D
                              //                                I
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
            a=S.charAt(cnt);
            System.out.println(a);
        }
    }
}